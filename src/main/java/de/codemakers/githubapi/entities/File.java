package de.codemakers.githubapi.entities;

import java.util.Objects;

public class File {
    
    private String sha;
    private String filename;
    private String status;
    private long additions;
    private long deletions;
    private long changes;
    private String blob_url;
    private String raw_url;
    private String contents_url;
    public GitHubClient gitHubClient = null;
    
    public File(String sha, String filename, String status, long additions, long deletions, long changes, String blob_url, String raw_url, String contents_url) {
        this.sha = sha;
        this.filename = filename;
        this.status = status;
        this.additions = additions;
        this.deletions = deletions;
        this.changes = changes;
        this.blob_url = blob_url;
        this.raw_url = raw_url;
        this.contents_url = contents_url;
    }
    
    public final String getSha() {
        return sha;
    }
    
    public final File setSha(String sha) {
        this.sha = sha;
        return this;
    }
    
    public final String getFilename() {
        return filename;
    }
    
    public final File setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    
    public final String getStatus() {
        return status;
    }
    
    public final File setStatus(String status) {
        this.status = status;
        return this;
    }
    
    public final long getAdditions() {
        return additions;
    }
    
    public final File setAdditions(long additions) {
        this.additions = additions;
        return this;
    }
    
    public final long getDeletions() {
        return deletions;
    }
    
    public final File setDeletions(long deletions) {
        this.deletions = deletions;
        return this;
    }
    
    public final long getChanges() {
        return changes;
    }
    
    public final File setChanges(long changes) {
        this.changes = changes;
        return this;
    }
    
    public final String getBlob_url() {
        return blob_url;
    }
    
    public final File setBlob_url(String blob_url) {
        this.blob_url = blob_url;
        return this;
    }
    
    public final String getRaw_url() {
        return raw_url;
    }
    
    public final File setRaw_url(String raw_url) {
        this.raw_url = raw_url;
        return this;
    }
    
    public final String getContents_url() {
        return contents_url;
    }
    
    public final File setContents_url(String contents_url) {
        this.contents_url = contents_url;
        return this;
    }
    
    @Override
    public final String toString() {
        return "File{" + "sha='" + sha + '\'' + ", filename='" + filename + '\'' + ", status='" + status + '\'' + ", additions=" + additions + ", deletions=" + deletions + ", changes=" + changes + ", blob_url='" + blob_url + '\'' + ", raw_url='" + raw_url + '\'' + ", contents_url='" + contents_url + '\'' + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        File file = (File) o;
        return additions == file.additions && deletions == file.deletions && changes == file.changes && Objects.equals(sha, file.sha) && Objects.equals(filename, file.filename) && Objects.equals(status, file.status) && Objects.equals(blob_url, file.blob_url) && Objects.equals(raw_url, file.raw_url) && Objects.equals(contents_url, file.contents_url);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(sha, filename, status, additions, deletions, changes, blob_url, raw_url, contents_url);
    }
    
}
