package de.codemakers.githubapi.entities;

import java.util.Objects;

public class License {
    
    private String key;
    private String name;
    private String spdx_id;
    private String url;
    private String node_id;
    public GitHubClient gitHubClient = null;
    
    public License(String key, String name, String spdx_id, String url, String node_id) {
        this.key = key;
        this.name = name;
        this.spdx_id = spdx_id;
        this.url = url;
        this.node_id = node_id;
    }
    
    public final String getKey() {
        return key;
    }
    
    public final License setKey(String key) {
        this.key = key;
        return this;
    }
    
    public final String getName() {
        return name;
    }
    
    public final License setName(String name) {
        this.name = name;
        return this;
    }
    
    public final String getSpdx_id() {
        return spdx_id;
    }
    
    public final License setSpdx_id(String spdx_id) {
        this.spdx_id = spdx_id;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final License setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public final String getNode_id() {
        return node_id;
    }
    
    public final License setNode_id(String node_id) {
        this.node_id = node_id;
        return this;
    }
    
    @Override
    public final String toString() {
        return "License{" + "key='" + key + '\'' + ", name='" + name + '\'' + ", spdx_id='" + spdx_id + '\'' + ", url='" + url + '\'' + ", node_id='" + node_id + '\'' + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(key, license.key) && Objects.equals(name, license.name) && Objects.equals(spdx_id, license.spdx_id) && Objects.equals(url, license.url) && Objects.equals(node_id, license.node_id);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(key, name, spdx_id, url, node_id);
    }
    
}
