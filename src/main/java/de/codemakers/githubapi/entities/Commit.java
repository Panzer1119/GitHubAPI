package de.codemakers.githubapi.entities;

import java.util.Objects;

public class Commit {
    
    private Owner author;
    private Owner committer;
    private String message;
    private Tree tree;
    private String url;
    private long comment_count;
    private Verification verification;
    public GitHubClient gitHubClient = null;
    
    public Commit(Owner author, Owner committer, String message, Tree tree, String url, long comment_count, Verification verification) {
        this.author = author;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.url = url;
        this.comment_count = comment_count;
        this.verification = verification;
    }
    
    public final Owner getAuthor() {
        return author;
    }
    
    public final Commit setAuthor(Owner author) {
        this.author = author;
        return this;
    }
    
    public final Owner getCommitter() {
        return committer;
    }
    
    public final Commit setCommitter(Owner committer) {
        this.committer = committer;
        return this;
    }
    
    public final String getMessage() {
        return message;
    }
    
    public final Commit setMessage(String message) {
        this.message = message;
        return this;
    }
    
    public final Tree getTree() {
        return tree;
    }
    
    public final Commit setTree(Tree tree) {
        this.tree = tree;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final Commit setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public final long getComment_count() {
        return comment_count;
    }
    
    public final Commit setComment_count(long comment_count) {
        this.comment_count = comment_count;
        return this;
    }
    
    public final Verification getVerification() {
        return verification;
    }
    
    public final Commit setVerification(Verification verification) {
        this.verification = verification;
        return this;
    }
    
    @Override
    public final String toString() {
        return "Commit{" + "author=" + author + ", committer=" + committer + ", message='" + message + '\'' + ", tree=" + tree + ", url='" + url + '\'' + ", comment_count=" + comment_count + ", verification=" + verification + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Commit commit = (Commit) o;
        return comment_count == commit.comment_count && Objects.equals(author, commit.author) && Objects.equals(committer, commit.committer) && Objects.equals(message, commit.message) && Objects.equals(tree, commit.tree) && Objects.equals(url, commit.url) && Objects.equals(verification, commit.verification);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(author, committer, message, tree, url, comment_count, verification);
    }
    
}
