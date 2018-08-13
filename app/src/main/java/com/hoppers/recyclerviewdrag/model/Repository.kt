package com.hoppers.recyclerviewdrag.model


import com.google.gson.annotations.SerializedName

data class Owner(@SerializedName("gists_url")
                 val gistsUrl: String,
                 @SerializedName("repos_url")
                 val reposUrl: String,
                 @SerializedName("following_url")
                 val followingUrl: String,
                 @SerializedName("starred_url")
                 val starredUrl: String,
                 val login: String,
                 @SerializedName("followers_url")
                 val followersUrl: String,
                 val type: String,
                 val url: String,
                 @SerializedName("subscriptions_url")
                 val subscriptionsUrl: String,
                 @SerializedName("received_events_url")
                 val receivedEventsUrl: String,
                 @SerializedName("avatar_url")
                 val avatarUrl: String,
                 @SerializedName("events_url")
                 val eventsUrl: String,
                 @SerializedName("html_url")
                 val htmlUrl: String,
                 @SerializedName("site_admin")
                 val siteAdmin: Boolean,
                 val id: Int,
                 @SerializedName("gravatar_id")
                 val gravatarId: String,
                 @SerializedName("organizations_url")
                 val organizationsUrl: String)


data class Repo(@SerializedName("stargazers_count")
                val stargazersCount: Int,
                @SerializedName("pushed_at")
                val pushedAt: String,
                @SerializedName("subscription_url")
                val subscriptionUrl: String,
                val language: String?,
                @SerializedName("branches_url")
                val branchesUrl: String,
                @SerializedName("issue_comment_url")
                val issueCommentUrl: String,
                @SerializedName("labels_url")
                val labelsUrl: String,
                @SerializedName("subscribers_url")
                val subscribersUrl: String,
                val permissions: Permissions?,
                @SerializedName("releases_url")
                val releasesUrl: String,
                @SerializedName("svn_url")
                val svnUrl: String,
                val id: Int,
                val forks: Int,
                @SerializedName("archive_url")
                val archiveUrl: String,
                @SerializedName("git_refs_url")
                val gitRefsUrl: String,
                @SerializedName("forks_url")
                val forksUrl: String,
                @SerializedName("statuses_url")
                val statusesUrl: String,
                @SerializedName("ssh_url")
                val sshUrl: String,
                val license: License,
                @SerializedName("full_name")
                val fullName: String,
                val size: Int,
                @SerializedName("languages_url")
                val languagesUrl: String,
                @SerializedName("html_url")
                val htmlUrl: String,
                @SerializedName("collaborators_url")
                val collaboratorsUrl: String,
                @SerializedName("clone_url")
                val cloneUrl: String,
                val name: String,
                @SerializedName("pulls_url")
                val pullsUrl: String,
                @SerializedName("default_branch")
                val defaultBranch: String,
                @SerializedName("hooks_url")
                val hooksUrl: String,
                @SerializedName("trees_url")
                val treesUrl: String,
                @SerializedName("tags_url")
                val tagsUrl: String,
                val private: Boolean,
                @SerializedName("contributors_url")
                val contributorsUrl: String,
                @SerializedName("has_downloads")
                val hasDownloads: Boolean,
                @SerializedName("notifications_url")
                val notificationsUrl: String,
                @SerializedName("open_issues_count")
                val openIssuesCount: Int,
                val description: String?,
                @SerializedName("created_at")
                val createdAt: String,
                val watchers: Int,
                @SerializedName("keys_url")
                val keysUrl: String,
                @SerializedName("deployments_url")
                val deploymentsUrl: String,
                @SerializedName("has_projects")
                val hasProjects: Boolean,
                val archived: Boolean,
                @SerializedName("has_wiki")
                val hasWiki: Boolean,
                @SerializedName("updated_at")
                val updatedAt: String,
                @SerializedName("comments_url")
                val commentsUrl: String,
                @SerializedName("stargazers_url")
                val stargazersUrl: String,
                @SerializedName("git_url")
                val gitUrl: String,
                @SerializedName("has_pages")
                val hasPages: Boolean,
                val owner: Owner,
                @SerializedName("commits_url")
                val commitsUrl: String,
                @SerializedName("compare_url")
                val compareUrl: String,
                @SerializedName("git_commits_url")
                val gitCommitsUrl: String,
                @SerializedName("blobs_url")
                val blobsUrl: String,
                @SerializedName("git_tags_url")
                val gitTagsUrl: String,
                @SerializedName("merges_url")
                val mergesUrl: String,
                @SerializedName("downloads_url")
                val downloadsUrl: String,
                @SerializedName("has_issues")
                val hasIssues: Boolean,
                val url: String,
                @SerializedName("contents_url")
                val contentsUrl: String,
                @SerializedName("mirror_url")
                val mirrorUrl: String,
                @SerializedName("milestones_url")
                val milestonesUrl: String,
                @SerializedName("teams_url")
                val teamsUrl: String,
                val fork: Boolean,
                @SerializedName("issues_url")
                val issuesUrl: String,
                @SerializedName("events_url")
                val eventsUrl: String,
                @SerializedName("issue_events_url")
                val issueEventsUrl: String,
                @SerializedName("assignees_url")
                val assigneesUrl: String,
                @SerializedName("open_issues")
                val openIssues: Int,
                @SerializedName("watchers_count")
                val watchersCount: Int,
                val homepage: String,
                @SerializedName("forks_count")
                val forksCount: Int)


data class Permissions(val pull: Boolean,
                       val admin: Boolean,
                       val push: Boolean)

data class License(val key: String,
                   val name: String,
                   val spdx_id: String,
                   val url: String)


