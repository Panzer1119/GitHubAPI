package de.codemakers.githubapi.entities;

import java.util.Objects;

public class Tree {
    
    private String sha;
    private String url;
    public GitHubClient gitHubClient = null;
    
    public Tree(String sha, String url) {
        this.sha = sha;
        this.url = url;
    }
    
    public final String getSha() {
        return sha;
    }
    
    public final Tree setSha(String sha) {
        this.sha = sha;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final Tree setUrl(String url) {
        this.url = url;
        return this;
    }
    
    @Override
    public final String toString() {
        return "Tree{" + "sha='" + sha + '\'' + ", url='" + url + '\'' + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tree tree = (Tree) o;
        return Objects.equals(sha, tree.sha) && Objects.equals(url, tree.url);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(sha, url);
    }
    
}
