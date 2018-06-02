package de.codemakers.githubapi.entities;

import java.util.Objects;

public class Stats {
    
    private long total;
    private long additions;
    private long deletions;
    public GitHubClient gitHubClient = null;
    
    public Stats(long total, long additions, long deletions) {
        this.total = total;
        this.additions = additions;
        this.deletions = deletions;
    }
    
    public final long getTotal() {
        return total;
    }
    
    public final Stats setTotal(long total) {
        this.total = total;
        return this;
    }
    
    public final long getAdditions() {
        return additions;
    }
    
    public final Stats setAdditions(long additions) {
        this.additions = additions;
        return this;
    }
    
    public final long getDeletions() {
        return deletions;
    }
    
    public final Stats setDeletions(long deletions) {
        this.deletions = deletions;
        return this;
    }
    
    @Override
    public final String toString() {
        return "Stats{" + "total=" + total + ", additions=" + additions + ", deletions=" + deletions + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stats stats = (Stats) o;
        return total == stats.total && additions == stats.additions && deletions == stats.deletions;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(total, additions, deletions);
    }
    
}
