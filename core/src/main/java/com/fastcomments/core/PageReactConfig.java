package com.fastcomments.core;

public class PageReactConfig {
    /** A short id that represents the reaction (unique to your account). */
    public String id;
    /** Image source path. Must be absolute. */
    public String src;
    /** Optional selected image source path. Must be absolute. */
    public String selectedSrc;

    public PageReactConfig(String id, String src, String selectedSrc) {
        this.id = id;
        this.src = src;
        this.selectedSrc = selectedSrc;
    }
}