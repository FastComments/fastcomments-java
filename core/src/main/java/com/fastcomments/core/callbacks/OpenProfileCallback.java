package com.fastcomments.core.callbacks;

import com.fastcomments.core.OnOpenProfileRequest;

@FunctionalInterface
public interface OpenProfileCallback {
    boolean onOpenProfile(OnOpenProfileRequest context);
}
