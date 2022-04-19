package com.engagementForum.Forum.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "posts")
public class Post {
    public void setDescription(String description) {
        this.description = description;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @Id
    String _id;
    String description;
    List<String> comments;
    Date createdAt;
    String createdBy;
    String displayName;

    public String getDisplayName() {
        return displayName;
    }

    int likes;

    public String getId() {
        return _id;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getComments() {
        return comments;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public int getLikes() {
        return likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + _id + '\'' +
                ", description='" + description + '\'' +
                ", comments=" + comments +
                ", createdAt=" + createdAt +
                ", createdBy='" + createdBy + '\'' +
                ", likes=" + likes +
                '}';
    }
}
