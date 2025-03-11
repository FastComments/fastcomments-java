package com.fastcomments.core;

import java.util.List;

public class PageReactsConfig {
    public List<PageReactConfig> reacts;
    public Boolean showUsers;

    public PageReactsConfig(List<PageReactConfig> reacts, Boolean showUsers) {
        this.reacts = reacts;
        this.showUsers = showUsers;
    }
}
