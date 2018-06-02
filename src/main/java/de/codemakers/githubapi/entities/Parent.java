package de.codemakers.githubapi.entities;

import java.util.Objects;

public class Parent {
    
    private String sha;
    private String url;
    private String html_url;
    public GitHubClient gitHubClient = null;
    
    public Parent(String sha, String url) {
        this.sha = sha;
        this.url = url;
    }
    
    public final String getSha() {
        return sha;
    }
    
    public final Parent setSha(String sha) {
        this.sha = sha;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final Parent setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public final String getHtml_url() {
        return html_url;
    }
    
    public final Parent setHtml_url(String html_url) {
        this.html_url = html_url;
        return this;
    }
    
    @Override
    public final String toString() {
        return "Parent{" + "sha='" + sha + '\'' + ", url='" + url + '\'' + ", html_url='" + html_url + '\'' + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Parent parent = (Parent) o;
        return Objects.equals(sha, parent.sha) && Objects.equals(url, parent.url) && Objects.equals(html_url, parent.html_url);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(sha, url, html_url);
    }
    
}
