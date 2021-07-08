package com.jmhreif.sdnvenmosocial;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.time.ZonedDateTime;
import java.util.List;

@Node
public class User {
    @Id
    private final String userId;

    private String about, displayName, firstName, lastName, profilePicURL, username;
    private ZonedDateTime dateJoined;
    private String isActive, isBlocked, isGroup;

    public User(String userId, String about, String displayName, String firstName, String lastName, String profilePicURL, String username, ZonedDateTime dateJoined, String isActive, String isBlocked, String isGroup) {
        this.userId = userId;
        this.about = about;
        this.displayName = displayName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profilePicURL = profilePicURL;
        this.username = username;
        this.dateJoined = dateJoined;
        this.isActive = isActive;
        this.isBlocked = isBlocked;
        this.isGroup = isGroup;
    }

    public String getUserId() {
        return userId;
    }

    public String getAbout() {
        return about;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProfilePicURL() {
        return profilePicURL;
    }

    public String getUsername() {
        return username;
    }

    public ZonedDateTime getDateJoined() {
        return dateJoined;
    }

    public String getIsActive() {
        return isActive;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public String getIsGroup() {
        return isGroup;
    }
}
