package de.codemakers.githubapi.entities;

import java.io.IOException;
import java.util.Objects;

public class Owner {
    
    private String login;
    private long id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private boolean site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    private long public_repos;
    private long public_gists;
    private long followers;
    private long following;
    private String created_at;
    private String updated_at;
    public GitHubClient gitHubClient = null;
    private boolean isUserSet = false;
    private boolean isUser = true;
    
    public Owner(String login, long id, String node_id, String avatar_url, String gravatar_id, String url, String html_url, String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url, String organizations_url, String repos_url, String events_url, String received_events_url, String type, boolean site_admin, String name, String company, String blog, String location, String email, String hireable, String bio, long public_repos, long public_gists, long followers, long following, String created_at, String updated_at) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.public_repos = public_repos;
        this.public_gists = public_gists;
        this.followers = followers;
        this.following = following;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
    
    public final String getLogin() {
        return login;
    }
    
    public final Owner setLogin(String login) {
        this.login = login;
        return this;
    }
    
    public final long getId() {
        return id;
    }
    
    public final Owner setId(long id) {
        this.id = id;
        return this;
    }
    
    public final String getNode_id() {
        return node_id;
    }
    
    public final Owner setNode_id(String node_id) {
        this.node_id = node_id;
        return this;
    }
    
    public final String getAvatar_url() {
        return avatar_url;
    }
    
    public final Owner setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
        return this;
    }
    
    public final String getGravatar_id() {
        return gravatar_id;
    }
    
    public final Owner setGravatar_id(String gravatar_id) {
        this.gravatar_id = gravatar_id;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final Owner setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public final String getHtml_url() {
        return html_url;
    }
    
    public final Owner setHtml_url(String html_url) {
        this.html_url = html_url;
        return this;
    }
    
    public final String getFollowers_url() {
        return followers_url;
    }
    
    public final Owner setFollowers_url(String followers_url) {
        this.followers_url = followers_url;
        return this;
    }
    
    public final String getFollowing_url() {
        return following_url;
    }
    
    public final Owner setFollowing_url(String following_url) {
        this.following_url = following_url;
        return this;
    }
    
    public final String getGists_url() {
        return gists_url;
    }
    
    public final Owner setGists_url(String gists_url) {
        this.gists_url = gists_url;
        return this;
    }
    
    public final String getStarred_url() {
        return starred_url;
    }
    
    public final Owner setStarred_url(String starred_url) {
        this.starred_url = starred_url;
        return this;
    }
    
    public final String getSubscriptions_url() {
        return subscriptions_url;
    }
    
    public final Owner setSubscriptions_url(String subscriptions_url) {
        this.subscriptions_url = subscriptions_url;
        return this;
    }
    
    public final String getOrganizations_url() {
        return organizations_url;
    }
    
    public final Owner setOrganizations_url(String organizations_url) {
        this.organizations_url = organizations_url;
        return this;
    }
    
    public final String getRepos_url() {
        return repos_url;
    }
    
    public final Owner setRepos_url(String repos_url) {
        this.repos_url = repos_url;
        return this;
    }
    
    public final String getEvents_url() {
        return events_url;
    }
    
    public final Owner setEvents_url(String events_url) {
        this.events_url = events_url;
        return this;
    }
    
    public final String getReceived_events_url() {
        return received_events_url;
    }
    
    public final Owner setReceived_events_url(String received_events_url) {
        this.received_events_url = received_events_url;
        return this;
    }
    
    public final String getType() {
        return type;
    }
    
    public final Owner setType(String type) {
        this.type = type;
        return this;
    }
    
    public final boolean isSite_admin() {
        return site_admin;
    }
    
    public final Owner setSite_admin(boolean site_admin) {
        this.site_admin = site_admin;
        return this;
    }
    
    public final String getName() {
        return name;
    }
    
    public final Owner setName(String name) {
        this.name = name;
        return this;
    }
    
    public final String getCompany() {
        return company;
    }
    
    public final Owner setCompany(String company) {
        this.company = company;
        return this;
    }
    
    public final String getBlog() {
        return blog;
    }
    
    public final Owner setBlog(String blog) {
        this.blog = blog;
        return this;
    }
    
    public final String getLocation() {
        return location;
    }
    
    public final Owner setLocation(String location) {
        this.location = location;
        return this;
    }
    
    public final String getEmail() {
        return email;
    }
    
    public final Owner setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public final String getHireable() {
        return hireable;
    }
    
    public final Owner setHireable(String hireable) {
        this.hireable = hireable;
        return this;
    }
    
    public final String getBio() {
        return bio;
    }
    
    public final Owner setBio(String bio) {
        this.bio = bio;
        return this;
    }
    
    public final long getPublic_repos() {
        return public_repos;
    }
    
    public final Owner setPublic_repos(long public_repos) {
        this.public_repos = public_repos;
        return this;
    }
    
    public final long getPublic_gists() {
        return public_gists;
    }
    
    public final Owner setPublic_gists(long public_gists) {
        this.public_gists = public_gists;
        return this;
    }
    
    public final long getFollowers() {
        return followers;
    }
    
    public final Owner setFollowers(long followers) {
        this.followers = followers;
        return this;
    }
    
    public final long getFollowing() {
        return following;
    }
    
    public final Owner setFollowing(long following) {
        this.following = following;
        return this;
    }
    
    public final String getCreated_at() {
        return created_at;
    }
    
    public final Owner setCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }
    
    public final String getUpdated_at() {
        return updated_at;
    }
    
    public final Owner setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }
    
    public final boolean isUser() {
        if (!isUserSet) {
            isUser = Objects.equals(type, "User");
            isUserSet = true;
        }
        return isUser;
    }
    
    public final boolean isOrganization() {
        return !isUser();
    }
    
    public final Repository getRepository(String repoName) throws IOException {
        return gitHubClient.getRepository(login, repoName);
    }
    
    public final Repository[] listRepositories() throws IOException {
        return gitHubClient.listRepositories(isUser(), login);
    }
    
    public final Owner[] listOrganizations() throws IOException {
        return gitHubClient.listOrganizations(login);
    }
    
    public final CompleteCommit getCommit(String repoName, String sha) throws IOException {
        return gitHubClient.getCommit(login, repoName, sha);
    }
    
    public final CompleteCommit[] listCommits(String repoName) throws IOException {
        return gitHubClient.listCommits(login, repoName);
    }
    
    @Override
    public final String toString() {
        return "Owner{" + "login='" + login + '\'' + ", id=" + id + ", node_id='" + node_id + '\'' + ", avatar_url='" + avatar_url + '\'' + ", gravatar_id='" + gravatar_id + '\'' + ", url='" + url + '\'' + ", html_url='" + html_url + '\'' + ", followers_url='" + followers_url + '\'' + ", following_url='" + following_url + '\'' + ", gists_url='" + gists_url + '\'' + ", starred_url='" + starred_url + '\'' + ", subscriptions_url='" + subscriptions_url + '\'' + ", organizations_url='" + organizations_url + '\'' + ", repos_url='" + repos_url + '\'' + ", events_url='" + events_url + '\'' + ", received_events_url='" + received_events_url + '\'' + ", type='" + type + '\'' + ", site_admin=" + site_admin + ", name='" + name + '\'' + ", company='" + company + '\'' + ", blog='" + blog + '\'' + ", location='" + location + '\'' + ", email='" + email + '\'' + ", hireable='" + hireable + '\'' + ", bio='" + bio + '\'' + ", public_repos=" + public_repos + ", public_gists=" + public_gists + ", followers=" + followers + ", following=" + following + ", created_at='" + created_at + '\'' + ", updated_at='" + updated_at + '\'' + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Owner owner = (Owner) o;
        return id == owner.id && site_admin == owner.site_admin && public_repos == owner.public_repos && public_gists == owner.public_gists && followers == owner.followers && following == owner.following && Objects.equals(login, owner.login) && Objects.equals(node_id, owner.node_id) && Objects.equals(avatar_url, owner.avatar_url) && Objects.equals(gravatar_id, owner.gravatar_id) && Objects.equals(url, owner.url) && Objects.equals(html_url, owner.html_url) && Objects.equals(followers_url, owner.followers_url) && Objects.equals(following_url, owner.following_url) && Objects.equals(gists_url, owner.gists_url) && Objects.equals(starred_url, owner.starred_url) && Objects.equals(subscriptions_url, owner.subscriptions_url) && Objects.equals(organizations_url, owner.organizations_url) && Objects.equals(repos_url, owner.repos_url) && Objects.equals(events_url, owner.events_url) && Objects.equals(received_events_url, owner.received_events_url) && Objects.equals(type, owner.type) && Objects.equals(name, owner.name) && Objects.equals(company, owner.company) && Objects.equals(blog, owner.blog) && Objects.equals(location, owner.location) && Objects.equals(email, owner.email) && Objects.equals(hireable, owner.hireable) && Objects.equals(bio, owner.bio) && Objects.equals(created_at, owner.created_at) && Objects.equals(updated_at, owner.updated_at);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(login, id, node_id, avatar_url, gravatar_id, url, html_url, followers_url, following_url, gists_url, starred_url, subscriptions_url, organizations_url, repos_url, events_url, received_events_url, type, site_admin, name, company, blog, location, email, hireable, bio, public_repos, public_gists, followers, following, created_at, updated_at);
    }
    
}
