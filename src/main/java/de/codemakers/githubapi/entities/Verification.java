package de.codemakers.githubapi.entities;

import java.util.Objects;

public class Verification {
    
    private boolean verified;
    private String reason;
    private String signature;
    private String payload;
    public GitHubClient gitHubClient = null;
    
    public Verification(boolean verified, String reason, String signature, String payload) {
        this.verified = verified;
        this.reason = reason;
        this.signature = signature;
        this.payload = payload;
    }
    
    public final boolean isVerified() {
        return verified;
    }
    
    public final Verification setVerified(boolean verified) {
        this.verified = verified;
        return this;
    }
    
    public final String getReason() {
        return reason;
    }
    
    public final Verification setReason(String reason) {
        this.reason = reason;
        return this;
    }
    
    public final String getSignature() {
        return signature;
    }
    
    public final Verification setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    
    public final String getPayload() {
        return payload;
    }
    
    public final Verification setPayload(String payload) {
        this.payload = payload;
        return this;
    }
    
    @Override
    public final String toString() {
        return "Verification{" + "verified=" + verified + ", reason='" + reason + '\'' + ", signature='" + signature + '\'' + ", payload='" + payload + '\'' + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Verification that = (Verification) o;
        return verified == that.verified && Objects.equals(reason, that.reason) && Objects.equals(signature, that.signature) && Objects.equals(payload, that.payload);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(verified, reason, signature, payload);
    }
    
}
