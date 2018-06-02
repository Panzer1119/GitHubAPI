package de.codemakers.githubapi.entities;

import java.io.IOException;
import java.util.Objects;

public class Repository {
    
    private long id;
    private String node_id;
    private String name;
    private String full_name;
    private Owner owner;
    private boolean private_;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String forks_url;
    private String keys_url;
    private String collaborators_url;
    private String teams_url;
    private String hooks_url;
    private String issue_events_url;
    private String events_url;
    private String assignees_url;
    private String branches_url;
    private String tags_url;
    private String blobs_url;
    private String git_tags_url;
    private String git_refs_url;
    private String trees_url;
    private String statuses_url;
    private String languages_url;
    private String stargazers_url;
    private String contributors_url;
    private String subscribers_url;
    private String subscription_url;
    private String commits_url;
    private String git_commits_url;
    private String comments_url;
    private String issue_comment_url;
    private String contents_url;
    private String compare_url;
    private String merges_url;
    private String archive_url;
    private String downloads_url;
    private String issues_url;
    private String pulls_url;
    private String milestones_url;
    private String notifications_url;
    private String labels_url;
    private String releases_url;
    private String deployments_url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String svn_url;
    private String homepage;
    private long size;
    private long stargazers_count;
    private long watchers_count;
    private String language;
    private boolean has_issues;
    private boolean has_projects;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private long forks_count;
    private String mirror_url;
    private boolean archived;
    private long open_issues_count;
    private License license;
    private long forks;
    private long open_issues;
    private long watchers;
    private String default_branch;
    private long network_count;
    private long subscribers_count;
    public GitHubClient gitHubClient = null;
    
    public Repository(long id, String node_id, String name, String full_name, Owner owner, boolean private_, String html_url, String description, boolean fork, String url, String forks_url, String keys_url, String collaborators_url, String teams_url, String hooks_url, String issue_events_url, String events_url, String assignees_url, String branches_url, String tags_url, String blobs_url, String git_tags_url, String git_refs_url, String trees_url, String statuses_url, String languages_url, String stargazers_url, String contributors_url, String subscribers_url, String subscription_url, String commits_url, String git_commits_url, String comments_url, String issue_comment_url, String contents_url, String compare_url, String merges_url, String archive_url, String downloads_url, String issues_url, String pulls_url, String milestones_url, String notifications_url, String labels_url, String releases_url, String deployments_url, String created_at, String updated_at, String pushed_at, String git_url, String ssh_url, String clone_url, String svn_url, String homepage, long size, long stargazers_count, long watchers_count, String language, boolean has_issues, boolean has_projects, boolean has_downloads, boolean has_wiki, boolean has_pages, long forks_count, String mirror_url, boolean archived, long open_issues_count, License license, long forks, long open_issues, long watchers, String default_branch, long network_count, long subscribers_count) {
        this.id = id;
        this.node_id = node_id;
        this.name = name;
        this.full_name = full_name;
        this.owner = owner;
        this.private_ = private_;
        this.html_url = html_url;
        this.description = description;
        this.fork = fork;
        this.url = url;
        this.forks_url = forks_url;
        this.keys_url = keys_url;
        this.collaborators_url = collaborators_url;
        this.teams_url = teams_url;
        this.hooks_url = hooks_url;
        this.issue_events_url = issue_events_url;
        this.events_url = events_url;
        this.assignees_url = assignees_url;
        this.branches_url = branches_url;
        this.tags_url = tags_url;
        this.blobs_url = blobs_url;
        this.git_tags_url = git_tags_url;
        this.git_refs_url = git_refs_url;
        this.trees_url = trees_url;
        this.statuses_url = statuses_url;
        this.languages_url = languages_url;
        this.stargazers_url = stargazers_url;
        this.contributors_url = contributors_url;
        this.subscribers_url = subscribers_url;
        this.subscription_url = subscription_url;
        this.commits_url = commits_url;
        this.git_commits_url = git_commits_url;
        this.comments_url = comments_url;
        this.issue_comment_url = issue_comment_url;
        this.contents_url = contents_url;
        this.compare_url = compare_url;
        this.merges_url = merges_url;
        this.archive_url = archive_url;
        this.downloads_url = downloads_url;
        this.issues_url = issues_url;
        this.pulls_url = pulls_url;
        this.milestones_url = milestones_url;
        this.notifications_url = notifications_url;
        this.labels_url = labels_url;
        this.releases_url = releases_url;
        this.deployments_url = deployments_url;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.pushed_at = pushed_at;
        this.git_url = git_url;
        this.ssh_url = ssh_url;
        this.clone_url = clone_url;
        this.svn_url = svn_url;
        this.homepage = homepage;
        this.size = size;
        this.stargazers_count = stargazers_count;
        this.watchers_count = watchers_count;
        this.language = language;
        this.has_issues = has_issues;
        this.has_projects = has_projects;
        this.has_downloads = has_downloads;
        this.has_wiki = has_wiki;
        this.has_pages = has_pages;
        this.forks_count = forks_count;
        this.mirror_url = mirror_url;
        this.archived = archived;
        this.open_issues_count = open_issues_count;
        this.license = license;
        this.forks = forks;
        this.open_issues = open_issues;
        this.watchers = watchers;
        this.default_branch = default_branch;
        this.network_count = network_count;
        this.subscribers_count = subscribers_count;
    }
    
    public final long getId() {
        return id;
    }
    
    public final Repository setId(long id) {
        this.id = id;
        return this;
    }
    
    public final String getNode_id() {
        return node_id;
    }
    
    public final Repository setNode_id(String node_id) {
        this.node_id = node_id;
        return this;
    }
    
    public final String getName() {
        return name;
    }
    
    public final Repository setName(String name) {
        this.name = name;
        return this;
    }
    
    public final String getFull_name() {
        return full_name;
    }
    
    public final Repository setFull_name(String full_name) {
        this.full_name = full_name;
        return this;
    }
    
    public final Owner getOwner() {
        return owner;
    }
    
    public final Repository setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }
    
    public final boolean isPrivate_() {
        return private_;
    }
    
    public final Repository setPrivate_(boolean private_) {
        this.private_ = private_;
        return this;
    }
    
    public final String getHtml_url() {
        return html_url;
    }
    
    public final Repository setHtml_url(String html_url) {
        this.html_url = html_url;
        return this;
    }
    
    public final String getDescription() {
        return description;
    }
    
    public final Repository setDescription(String description) {
        this.description = description;
        return this;
    }
    
    public final boolean isFork() {
        return fork;
    }
    
    public final Repository setFork(boolean fork) {
        this.fork = fork;
        return this;
    }
    
    public final String getUrl() {
        return url;
    }
    
    public final Repository setUrl(String url) {
        this.url = url;
        return this;
    }
    
    public final String getForks_url() {
        return forks_url;
    }
    
    public final Repository setForks_url(String forks_url) {
        this.forks_url = forks_url;
        return this;
    }
    
    public final String getKeys_url() {
        return keys_url;
    }
    
    public final Repository setKeys_url(String keys_url) {
        this.keys_url = keys_url;
        return this;
    }
    
    public final String getCollaborators_url() {
        return collaborators_url;
    }
    
    public final Repository setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
        return this;
    }
    
    public final String getTeams_url() {
        return teams_url;
    }
    
    public final Repository setTeams_url(String teams_url) {
        this.teams_url = teams_url;
        return this;
    }
    
    public final String getHooks_url() {
        return hooks_url;
    }
    
    public final Repository setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
        return this;
    }
    
    public final String getIssue_events_url() {
        return issue_events_url;
    }
    
    public final Repository setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
        return this;
    }
    
    public final String getEvents_url() {
        return events_url;
    }
    
    public final Repository setEvents_url(String events_url) {
        this.events_url = events_url;
        return this;
    }
    
    public final String getAssignees_url() {
        return assignees_url;
    }
    
    public final Repository setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
        return this;
    }
    
    public final String getBranches_url() {
        return branches_url;
    }
    
    public final Repository setBranches_url(String branches_url) {
        this.branches_url = branches_url;
        return this;
    }
    
    public final String getTags_url() {
        return tags_url;
    }
    
    public final Repository setTags_url(String tags_url) {
        this.tags_url = tags_url;
        return this;
    }
    
    public final String getBlobs_url() {
        return blobs_url;
    }
    
    public final Repository setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
        return this;
    }
    
    public final String getGit_tags_url() {
        return git_tags_url;
    }
    
    public final Repository setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
        return this;
    }
    
    public final String getGit_refs_url() {
        return git_refs_url;
    }
    
    public final Repository setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
        return this;
    }
    
    public final String getTrees_url() {
        return trees_url;
    }
    
    public final Repository setTrees_url(String trees_url) {
        this.trees_url = trees_url;
        return this;
    }
    
    public final String getStatuses_url() {
        return statuses_url;
    }
    
    public final Repository setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
        return this;
    }
    
    public final String getLanguages_url() {
        return languages_url;
    }
    
    public final Repository setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
        return this;
    }
    
    public final String getStargazers_url() {
        return stargazers_url;
    }
    
    public final Repository setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
        return this;
    }
    
    public final String getContributors_url() {
        return contributors_url;
    }
    
    public final Repository setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
        return this;
    }
    
    public final String getSubscribers_url() {
        return subscribers_url;
    }
    
    public final Repository setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
        return this;
    }
    
    public final String getSubscription_url() {
        return subscription_url;
    }
    
    public final Repository setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
        return this;
    }
    
    public final String getCommits_url() {
        return commits_url;
    }
    
    public final Repository setCommits_url(String commits_url) {
        this.commits_url = commits_url;
        return this;
    }
    
    public final String getGit_commits_url() {
        return git_commits_url;
    }
    
    public final Repository setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
        return this;
    }
    
    public final String getComments_url() {
        return comments_url;
    }
    
    public final Repository setComments_url(String comments_url) {
        this.comments_url = comments_url;
        return this;
    }
    
    public final String getIssue_comment_url() {
        return issue_comment_url;
    }
    
    public final Repository setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
        return this;
    }
    
    public final String getContents_url() {
        return contents_url;
    }
    
    public final Repository setContents_url(String contents_url) {
        this.contents_url = contents_url;
        return this;
    }
    
    public final String getCompare_url() {
        return compare_url;
    }
    
    public final Repository setCompare_url(String compare_url) {
        this.compare_url = compare_url;
        return this;
    }
    
    public final String getMerges_url() {
        return merges_url;
    }
    
    public final Repository setMerges_url(String merges_url) {
        this.merges_url = merges_url;
        return this;
    }
    
    public final String getArchive_url() {
        return archive_url;
    }
    
    public final Repository setArchive_url(String archive_url) {
        this.archive_url = archive_url;
        return this;
    }
    
    public final String getDownloads_url() {
        return downloads_url;
    }
    
    public final Repository setDownloads_url(String downloads_url) {
        this.downloads_url = downloads_url;
        return this;
    }
    
    public final String getIssues_url() {
        return issues_url;
    }
    
    public final Repository setIssues_url(String issues_url) {
        this.issues_url = issues_url;
        return this;
    }
    
    public final String getPulls_url() {
        return pulls_url;
    }
    
    public final Repository setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
        return this;
    }
    
    public final String getMilestones_url() {
        return milestones_url;
    }
    
    public final Repository setMilestones_url(String milestones_url) {
        this.milestones_url = milestones_url;
        return this;
    }
    
    public final String getNotifications_url() {
        return notifications_url;
    }
    
    public final Repository setNotifications_url(String notifications_url) {
        this.notifications_url = notifications_url;
        return this;
    }
    
    public final String getLabels_url() {
        return labels_url;
    }
    
    public final Repository setLabels_url(String labels_url) {
        this.labels_url = labels_url;
        return this;
    }
    
    public final String getReleases_url() {
        return releases_url;
    }
    
    public final Repository setReleases_url(String releases_url) {
        this.releases_url = releases_url;
        return this;
    }
    
    public final String getDeployments_url() {
        return deployments_url;
    }
    
    public final Repository setDeployments_url(String deployments_url) {
        this.deployments_url = deployments_url;
        return this;
    }
    
    public final String getCreated_at() {
        return created_at;
    }
    
    public final Repository setCreated_at(String created_at) {
        this.created_at = created_at;
        return this;
    }
    
    public final String getUpdated_at() {
        return updated_at;
    }
    
    public final Repository setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
        return this;
    }
    
    public final String getPushed_at() {
        return pushed_at;
    }
    
    public final Repository setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
        return this;
    }
    
    public final String getGit_url() {
        return git_url;
    }
    
    public final Repository setGit_url(String git_url) {
        this.git_url = git_url;
        return this;
    }
    
    public final String getSsh_url() {
        return ssh_url;
    }
    
    public final Repository setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
        return this;
    }
    
    public final String getClone_url() {
        return clone_url;
    }
    
    public final Repository setClone_url(String clone_url) {
        this.clone_url = clone_url;
        return this;
    }
    
    public final String getSvn_url() {
        return svn_url;
    }
    
    public final Repository setSvn_url(String svn_url) {
        this.svn_url = svn_url;
        return this;
    }
    
    public final String getHomepage() {
        return homepage;
    }
    
    public final Repository setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }
    
    public final long getSize() {
        return size;
    }
    
    public final Repository setSize(long size) {
        this.size = size;
        return this;
    }
    
    public final long getStargazers_count() {
        return stargazers_count;
    }
    
    public final Repository setStargazers_count(long stargazers_count) {
        this.stargazers_count = stargazers_count;
        return this;
    }
    
    public final long getWatchers_count() {
        return watchers_count;
    }
    
    public final Repository setWatchers_count(long watchers_count) {
        this.watchers_count = watchers_count;
        return this;
    }
    
    public final String getLanguage() {
        return language;
    }
    
    public final Repository setLanguage(String language) {
        this.language = language;
        return this;
    }
    
    public final boolean isHas_issues() {
        return has_issues;
    }
    
    public final Repository setHas_issues(boolean has_issues) {
        this.has_issues = has_issues;
        return this;
    }
    
    public final boolean isHas_projects() {
        return has_projects;
    }
    
    public final Repository setHas_projects(boolean has_projects) {
        this.has_projects = has_projects;
        return this;
    }
    
    public final boolean isHas_downloads() {
        return has_downloads;
    }
    
    public final Repository setHas_downloads(boolean has_downloads) {
        this.has_downloads = has_downloads;
        return this;
    }
    
    public final boolean isHas_wiki() {
        return has_wiki;
    }
    
    public final Repository setHas_wiki(boolean has_wiki) {
        this.has_wiki = has_wiki;
        return this;
    }
    
    public final boolean isHas_pages() {
        return has_pages;
    }
    
    public final Repository setHas_pages(boolean has_pages) {
        this.has_pages = has_pages;
        return this;
    }
    
    public final long getForks_count() {
        return forks_count;
    }
    
    public final Repository setForks_count(long forks_count) {
        this.forks_count = forks_count;
        return this;
    }
    
    public final String getMirror_url() {
        return mirror_url;
    }
    
    public final Repository setMirror_url(String mirror_url) {
        this.mirror_url = mirror_url;
        return this;
    }
    
    public final boolean isArchived() {
        return archived;
    }
    
    public final Repository setArchived(boolean archived) {
        this.archived = archived;
        return this;
    }
    
    public final long getOpen_issues_count() {
        return open_issues_count;
    }
    
    public final Repository setOpen_issues_count(long open_issues_count) {
        this.open_issues_count = open_issues_count;
        return this;
    }
    
    public final License getLicense() {
        return license;
    }
    
    public final Repository setLicense(License license) {
        this.license = license;
        return this;
    }
    
    public final long getForks() {
        return forks;
    }
    
    public final Repository setForks(long forks) {
        this.forks = forks;
        return this;
    }
    
    public final long getOpen_issues() {
        return open_issues;
    }
    
    public final Repository setOpen_issues(long open_issues) {
        this.open_issues = open_issues;
        return this;
    }
    
    public final long getWatchers() {
        return watchers;
    }
    
    public final Repository setWatchers(long watchers) {
        this.watchers = watchers;
        return this;
    }
    
    public final String getDefault_branch() {
        return default_branch;
    }
    
    public final Repository setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
        return this;
    }
    
    public final long getNetwork_count() {
        return network_count;
    }
    
    public final Repository setNetwork_count(long network_count) {
        this.network_count = network_count;
        return this;
    }
    
    public final long getSubscribers_count() {
        return subscribers_count;
    }
    
    public final Repository setSubscribers_count(long subscribers_count) {
        this.subscribers_count = subscribers_count;
        return this;
    }
    
    public final CompleteCommit getCommit(String sha) throws IOException {
        return gitHubClient.getCommit(owner.getLogin(), name, sha);
    }
    
    public final CompleteCommit[] listCommits() throws IOException {
        return gitHubClient.listCommits(owner.getLogin(), name);
    }
    
    @Override
    public final String toString() {
        return "Repository{" + "id=" + id + ", node_id='" + node_id + '\'' + ", name='" + name + '\'' + ", full_name='" + full_name + '\'' + ", owner=" + owner + ", private_=" + private_ + ", html_url='" + html_url + '\'' + ", description='" + description + '\'' + ", fork=" + fork + ", url='" + url + '\'' + ", forks_url='" + forks_url + '\'' + ", keys_url='" + keys_url + '\'' + ", collaborators_url='" + collaborators_url + '\'' + ", teams_url='" + teams_url + '\'' + ", hooks_url='" + hooks_url + '\'' + ", issue_events_url='" + issue_events_url + '\'' + ", events_url='" + events_url + '\'' + ", assignees_url='" + assignees_url + '\'' + ", branches_url='" + branches_url + '\'' + ", tags_url='" + tags_url + '\'' + ", blobs_url='" + blobs_url + '\'' + ", git_tags_url='" + git_tags_url + '\'' + ", git_refs_url='" + git_refs_url + '\'' + ", trees_url='" + trees_url + '\'' + ", statuses_url='" + statuses_url + '\'' + ", languages_url='" + languages_url + '\'' + ", stargazers_url='" + stargazers_url + '\'' + ", contributors_url='" + contributors_url + '\'' + ", subscribers_url='" + subscribers_url + '\'' + ", subscription_url='" + subscription_url + '\'' + ", commits_url='" + commits_url + '\'' + ", git_commits_url='" + git_commits_url + '\'' + ", comments_url='" + comments_url + '\'' + ", issue_comment_url='" + issue_comment_url + '\'' + ", contents_url='" + contents_url + '\'' + ", compare_url='" + compare_url + '\'' + ", merges_url='" + merges_url + '\'' + ", archive_url='" + archive_url + '\'' + ", downloads_url='" + downloads_url + '\'' + ", issues_url='" + issues_url + '\'' + ", pulls_url='" + pulls_url + '\'' + ", milestones_url='" + milestones_url + '\'' + ", notifications_url='" + notifications_url + '\'' + ", labels_url='" + labels_url + '\'' + ", releases_url='" + releases_url + '\'' + ", deployments_url='" + deployments_url + '\'' + ", created_at='" + created_at + '\'' + ", updated_at='" + updated_at + '\'' + ", pushed_at='" + pushed_at + '\'' + ", git_url='" + git_url + '\'' + ", ssh_url='" + ssh_url + '\'' + ", clone_url='" + clone_url + '\'' + ", svn_url='" + svn_url + '\'' + ", homepage='" + homepage + '\'' + ", size=" + size + ", stargazers_count=" + stargazers_count + ", watchers_count=" + watchers_count + ", language='" + language + '\'' + ", has_issues=" + has_issues + ", has_projects=" + has_projects + ", has_downloads=" + has_downloads + ", has_wiki=" + has_wiki + ", has_pages=" + has_pages + ", forks_count=" + forks_count + ", mirror_url='" + mirror_url + '\'' + ", archived=" + archived + ", open_issues_count=" + open_issues_count + ", license=" + license + ", forks=" + forks + ", open_issues=" + open_issues + ", watchers=" + watchers + ", default_branch='" + default_branch + '\'' + ", network_count=" + network_count + ", subscribers_count=" + subscribers_count + '}';
    }
    
    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Repository that = (Repository) o;
        return id == that.id && private_ == that.private_ && fork == that.fork && size == that.size && stargazers_count == that.stargazers_count && watchers_count == that.watchers_count && has_issues == that.has_issues && has_projects == that.has_projects && has_downloads == that.has_downloads && has_wiki == that.has_wiki && has_pages == that.has_pages && forks_count == that.forks_count && archived == that.archived && open_issues_count == that.open_issues_count && forks == that.forks && open_issues == that.open_issues && watchers == that.watchers && network_count == that.network_count && subscribers_count == that.subscribers_count && Objects.equals(node_id, that.node_id) && Objects.equals(name, that.name) && Objects.equals(full_name, that.full_name) && Objects.equals(owner, that.owner) && Objects.equals(html_url, that.html_url) && Objects.equals(description, that.description) && Objects.equals(url, that.url) && Objects.equals(forks_url, that.forks_url) && Objects.equals(keys_url, that.keys_url) && Objects.equals(collaborators_url, that.collaborators_url) && Objects.equals(teams_url, that.teams_url) && Objects.equals(hooks_url, that.hooks_url) && Objects.equals(issue_events_url, that.issue_events_url) && Objects.equals(events_url, that.events_url) && Objects.equals(assignees_url, that.assignees_url) && Objects.equals(branches_url, that.branches_url) && Objects.equals(tags_url, that.tags_url) && Objects.equals(blobs_url, that.blobs_url) && Objects.equals(git_tags_url, that.git_tags_url) && Objects.equals(git_refs_url, that.git_refs_url) && Objects.equals(trees_url, that.trees_url) && Objects.equals(statuses_url, that.statuses_url) && Objects.equals(languages_url, that.languages_url) && Objects.equals(stargazers_url, that.stargazers_url) && Objects.equals(contributors_url, that.contributors_url) && Objects.equals(subscribers_url, that.subscribers_url) && Objects.equals(subscription_url, that.subscription_url) && Objects.equals(commits_url, that.commits_url) && Objects.equals(git_commits_url, that.git_commits_url) && Objects.equals(comments_url, that.comments_url) && Objects.equals(issue_comment_url, that.issue_comment_url) && Objects.equals(contents_url, that.contents_url) && Objects.equals(compare_url, that.compare_url) && Objects.equals(merges_url, that.merges_url) && Objects.equals(archive_url, that.archive_url) && Objects.equals(downloads_url, that.downloads_url) && Objects.equals(issues_url, that.issues_url) && Objects.equals(pulls_url, that.pulls_url) && Objects.equals(milestones_url, that.milestones_url) && Objects.equals(notifications_url, that.notifications_url) && Objects.equals(labels_url, that.labels_url) && Objects.equals(releases_url, that.releases_url) && Objects.equals(deployments_url, that.deployments_url) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(pushed_at, that.pushed_at) && Objects.equals(git_url, that.git_url) && Objects.equals(ssh_url, that.ssh_url) && Objects.equals(clone_url, that.clone_url) && Objects.equals(svn_url, that.svn_url) && Objects.equals(homepage, that.homepage) && Objects.equals(language, that.language) && Objects.equals(mirror_url, that.mirror_url) && Objects.equals(license, that.license) && Objects.equals(default_branch, that.default_branch);
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(id, node_id, name, full_name, owner, private_, html_url, description, fork, url, forks_url, keys_url, collaborators_url, teams_url, hooks_url, issue_events_url, events_url, assignees_url, branches_url, tags_url, blobs_url, git_tags_url, git_refs_url, trees_url, statuses_url, languages_url, stargazers_url, contributors_url, subscribers_url, subscription_url, commits_url, git_commits_url, comments_url, issue_comment_url, contents_url, compare_url, merges_url, archive_url, downloads_url, issues_url, pulls_url, milestones_url, notifications_url, labels_url, releases_url, deployments_url, created_at, updated_at, pushed_at, git_url, ssh_url, clone_url, svn_url, homepage, size, stargazers_count, watchers_count, language, has_issues, has_projects, has_downloads, has_wiki, has_pages, forks_count, mirror_url, archived, open_issues_count, license, forks, open_issues, watchers, default_branch, network_count, subscribers_count);
    }
    
}
