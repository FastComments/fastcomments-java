package com.fastcomments.core;

@FunctionalInterface
public interface OpenProfileCallback {
    boolean onOpenProfile(OnOpenProfileRequest context);
}
