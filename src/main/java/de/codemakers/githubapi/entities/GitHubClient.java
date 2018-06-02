package de.codemakers.githubapi.entities;

import de.codemakers.githubapi.GitHubAPI;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

public class GitHubClient {
    
    private byte[] accessToken = null;
    
    public GitHubClient() {
        this(null);
    }
    
    public GitHubClient(byte[] accessToken) {
        this.accessToken = accessToken;
    }
    
    public final byte[] getAccessToken() {
        return accessToken;
    }
    
    public final GitHubClient setAccessToken(byte[] accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    
    public final Owner getUser(String userName) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, GitHubAPI.API_USERS, userName);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final Owner user = GitHubAPI.GSON.fromJson(json, Owner.class);
        response.close();
        user.gitHubClient = this;
        return user;
    }
    
    public final Repository getRepository(String ownerName, String repoName) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, GitHubAPI.API_REPOS, ownerName, repoName);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final Repository repository = GitHubAPI.GSON.fromJson(json, Repository.class);
        response.close();
        repository.gitHubClient = this;
        if (repository.getOwner() != null) {
            repository.getOwner().gitHubClient = this;
        }
        if (repository.getLicense() != null) {
            repository.getLicense().gitHubClient = this;
        }
        return repository;
    }
    
    public final Repository[] listRepositories(boolean isUser, String ownerName) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, isUser ? GitHubAPI.API_USERS : GitHubAPI.API_ORGS, ownerName, GitHubAPI.API_REPOS);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final Repository[] repositories = GitHubAPI.GSON.fromJson(json, Repository[].class);
        for (Repository repository : repositories) {
            if (repository == null) {
                continue;
            }
            repository.gitHubClient = this;
            if (repository.getOwner() != null) {
                repository.getOwner().gitHubClient = this;
            }
            if (repository.getLicense() != null) {
                repository.getLicense().gitHubClient = this;
            }
        }
        response.close();
        return repositories;
    }
    
    public final Owner getOrganization(String orgName) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, GitHubAPI.API_ORGS, orgName);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final Owner organization = GitHubAPI.GSON.fromJson(json, Owner.class);
        response.close();
        organization.gitHubClient = this;
        return organization;
    }
    
    public final Owner[] listOrganizations(String orgName) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, GitHubAPI.API_USERS, orgName, GitHubAPI.API_ORGS);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final Owner[] organizations = GitHubAPI.GSON.fromJson(json, Owner[].class);
        for (Owner organization : organizations) {
            if (organization == null) {
                continue;
            }
            organization.gitHubClient = this;
        }
        response.close();
        return organizations;
    }
    
    public final CompleteCommit getCommit(String ownerName, String repoName, String sha) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, GitHubAPI.API_REPOS, ownerName, repoName, GitHubAPI.API_COMMITS, sha);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final CompleteCommit commit = GitHubAPI.GSON.fromJson(json, CompleteCommit.class);
        response.close();
        commit.gitHubClient = this;
        if (commit.getCommit() != null) {
            commit.getCommit().gitHubClient = this;
            if (commit.getCommit().getAuthor() != null) {
                commit.getCommit().getAuthor().gitHubClient = this;
            }
            if (commit.getCommit().getCommitter() != null) {
                commit.getCommit().getCommitter().gitHubClient = this;
            }
            if (commit.getCommit().getTree() != null) {
                commit.getCommit().getTree().gitHubClient = this;
            }
            if (commit.getCommit().getVerification() != null) {
                commit.getCommit().getVerification().gitHubClient = this;
            }
        }
        if (commit.getAuthor() != null) {
            commit.getAuthor().gitHubClient = this;
        }
        if (commit.getCommitter() != null) {
            commit.getCommitter().gitHubClient = this;
        }
        if (commit.getParents() != null) {
            for (Parent parent : commit.getParents()) {
                if (parent != null) {
                    parent.gitHubClient = null;
                }
            }
        }
        if (commit.getStats() != null) {
            commit.getStats().gitHubClient = this;
        }
        if (commit.getFiles() != null) {
            for (File file : commit.getFiles()) {
                if (file != null) {
                    file.gitHubClient = null;
                }
            }
        }
        return commit;
    }
    
    public final CompleteCommit[] listCommits(String ownerName, String repoName) throws IOException {
        final String url = GitHubAPI.createURLString(null, accessToken, GitHubAPI.API_REPOS, ownerName, repoName, GitHubAPI.API_COMMITS);
        System.out.println(url);
        final HttpGet httpGet = new HttpGet(url);
        final CloseableHttpResponse response = GitHubAPI.HTTP_CLIENT.execute(httpGet);
        final String json = IOUtils.toString(response.getEntity().getContent(), "UTF-8");
        final CompleteCommit[] commits = GitHubAPI.GSON.fromJson(json, CompleteCommit[].class);
        for (CompleteCommit commit : commits) {
            if (commit == null) {
                continue;
            }
            commit.gitHubClient = this;
            if (commit.getCommit() != null) {
                commit.getCommit().gitHubClient = this;
                if (commit.getCommit().getAuthor() != null) {
                    commit.getCommit().getAuthor().gitHubClient = this;
                }
                if (commit.getCommit().getCommitter() != null) {
                    commit.getCommit().getCommitter().gitHubClient = this;
                }
                if (commit.getCommit().getTree() != null) {
                    commit.getCommit().getTree().gitHubClient = this;
                }
                if (commit.getCommit().getVerification() != null) {
                    commit.getCommit().getVerification().gitHubClient = this;
                }
            }
            if (commit.getAuthor() != null) {
                commit.getAuthor().gitHubClient = this;
            }
            if (commit.getCommitter() != null) {
                commit.getCommitter().gitHubClient = this;
            }
            if (commit.getParents() != null) {
                for (Parent parent : commit.getParents()) {
                    if (parent != null) {
                        parent.gitHubClient = null;
                    }
                }
            }
            if (commit.getStats() != null) {
                commit.getStats().gitHubClient = this;
            }
            if (commit.getFiles() != null) {
                for (File file : commit.getFiles()) {
                    if (file != null) {
                        file.gitHubClient = null;
                    }
                }
            }
        }
        response.close();
        return commits;
    }
    
}
