package com.snalopainen.stackview.models;

/**
 * Created by snajdan on 2016/12/27.
 */
public class User {

    // region Member Variables
    private String avatarUrl;
    private String displayName;
    private String username;
    // endregion

    // region Constructors
    public User(){

    }
    // endregion

    // region Getters
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getUsername() {
        return username;
    }
    // endregion

    // region Setters
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    // endregion

}
