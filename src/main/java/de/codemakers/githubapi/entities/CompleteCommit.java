package de.codemakers.githubapi.entities;

import java.util.Arrays;
import java.util.Objects;

public class CompleteCommit {
    
    private String sha;
    private Commit commit;
    private String url;
    private String html_url;
    private String comments_url;
    private Owner author;
    private Owner committer;
    private Parent[] parents;
    private Stats stats;
    private File[] files;
    public GitHubClient gitHubClient = null;
    
    public CompleteCommit(String sha, Commit commit, String url, String html_url, String comments_url, Owner author, Owner committer, Parent[] parents, Stats stats, File[] files) {
        this.sha = sha;
        this.commit = commit;
        this.url = url;
        this.html_url = html_url;
        this.comments_url = comments_url;
        this.author = author;
        this.committer = committer;
        this.parents = parents;
        this.stats = stats;
        this.files = files;
    }
    
    public final String getSha() {
        return sha;
    }
    
    public final CompleteCommit setSha(String sha) {
        this.sha = sha;
        return this;
    }
    
    public final Commit getCommit() {
        return commit;
    }
    
    public final CompleteCommit setCommit(Commit commit) {
        this.commit = commit;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final CompleteCommit setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public final String getHtml_url() {
        return html_url;
    }
    
    public final CompleteCommit setHtml_url(String html_url) {
        this.html_url = html_url;
        return this;
    }
    
    public final String getComments_url() {
        return comments_url;
    }
    
    public final CompleteCommit setComments_url(String comments_url) {
        this.comments_url = comments_url;
        return this;
    }
    
    public final Owner getAuthor() {
        return author;
    }
    
    public final CompleteCommit setAuthor(Owner author) {
        this.author = author;
        return this;
    }
    
    public final Owner getCommitter() {
        return committer;
    }
    
    public final CompleteCommit setCommitter(Owner committer) {
        this.committer = committer;
        return this;
    }
    
    public final Parent[] getParents() {
        return parents;
    }
    
    public final CompleteCommit setParents(Parent[] parents) {
        this.parents = parents;
        return this;
    }
    
    public final Stats getStats() {
        return stats;
    }
    
    public final CompleteCommit setStats(Stats stats) {
        this.stats = stats;
        return this;
    }
    
    public final File[] getFiles() {
        return files;
    }
    
    public final CompleteCommit setFiles(File[] files) {
        this.files = files;
        return this;
    }
    
    @Override
    public final String toString() {
        return "CompleteCommit{" + "sha='" + sha + '\'' + ", commit=" + commit + ", url='" + url + '\'' + ", html_url='" + html_url + '\'' + ", comments_url='" + comments_url + '\'' + ", author=" + author + ", committer=" + committer + ", parents=" + Arrays.toString(parents) + ", stats=" + stats + ", files=" + Arrays.toString(files) + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CompleteCommit that = (CompleteCommit) o;
        return Objects.equals(sha, that.sha) && Objects.equals(commit, that.commit) && Objects.equals(url, that.url) && Objects.equals(html_url, that.html_url) && Objects.equals(comments_url, that.comments_url) && Objects.equals(author, that.author) && Objects.equals(committer, that.committer) && Arrays.equals(parents, that.parents) && Objects.equals(stats, that.stats) && Arrays.equals(files, that.files);
    }
    
    @Override
    public final int hashCode() {
        int result = Objects.hash(sha, commit, url, html_url, comments_url, author, committer, stats);
        result = 31 * result + Arrays.hashCode(parents);
        result = 31 * result + Arrays.hashCode(files);
        return result;
    }
    
}
