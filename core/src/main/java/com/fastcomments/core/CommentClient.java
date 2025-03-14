package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;
import com.fastcomments.model.GetCommentsResponseWithPresencePublicComment;

/**
 * Interface for interacting with FastComments API
 */
public interface CommentClient {
    
    /**
     * Callback interface for asynchronous comment operations
     */
    interface Callback<T> {
        void onSuccess(T result);
        void onError(Exception e);
    }
    
    /**
     * Get comments for a page or thread using default parameters (synchronous)
     * 
     * @param config The widget configuration
     * @return Response containing comments and additional context
     * @throws Exception If an error occurs during the API call
     */
    GetCommentsResponseWithPresencePublicComment getComments(CommentWidgetConfig config) throws Exception;
    
    /**
     * Get comments for a page or thread with pagination and threading support (synchronous)
     * 
     * @param config The widget configuration
     * @param page The page number (starting from 0)
     * @param skip Number of comments to skip
     * @param limit Maximum number of comments to return
     * @param asTree Whether to return comments in tree structure
     * @param maxTreeDepth Maximum depth of reply tree
     * @param parentId Parent comment ID to fetch replies for
     * @return Response containing comments and additional context
     * @throws Exception If an error occurs during the API call
     */
    GetCommentsResponseWithPresencePublicComment getComments(
            CommentWidgetConfig config,
            Integer page,
            Integer skip,
            Integer limit,
            Boolean asTree,
            Integer maxTreeDepth,
            String parentId) throws Exception;
    
    /**
     * Get comments for a page or thread using default parameters (asynchronous)
     * 
     * @param config The widget configuration
     * @param callback The callback to be executed when the API call finishes
     */
    void getCommentsAsync(CommentWidgetConfig config, Callback<GetCommentsResponseWithPresencePublicComment> callback);
    
    /**
     * Get comments for a page or thread with pagination and threading support (asynchronous)
     * 
     * @param config The widget configuration
     * @param page The page number (starting from 0)
     * @param skip Number of comments to skip
     * @param limit Maximum number of comments to return
     * @param asTree Whether to return comments in tree structure
     * @param maxTreeDepth Maximum depth of reply tree
     * @param parentId Parent comment ID to fetch replies for
     * @param callback The callback to be executed when the API call finishes
     */
    void getCommentsAsync(
            CommentWidgetConfig config,
            Integer page,
            Integer skip,
            Integer limit,
            Boolean asTree,
            Integer maxTreeDepth,
            String parentId,
            Callback<GetCommentsResponseWithPresencePublicComment> callback);
    
    /**
     * Post a new comment (synchronous)
     * 
     * @param config The widget configuration
     * @param commentText The text content of the comment
     * @param parentId The parent comment ID for replies (null for top-level comments)
     * @param userInfo The user session information
     * @return The posted comment
     * @throws Exception If an error occurs during the API call
     */
    APICommentPublicComment postComment(CommentWidgetConfig config, String commentText, String parentId, UserSessionInfo userInfo) throws Exception;
    
    /**
     * Post a new comment (asynchronous)
     * 
     * @param config The widget configuration
     * @param commentText The text content of the comment
     * @param parentId The parent comment ID for replies (null for top-level comments)
     * @param userInfo The user session information
     * @param callback The callback to be executed when the API call finishes
     */
    void postCommentAsync(CommentWidgetConfig config, String commentText, String parentId, UserSessionInfo userInfo, Callback<APICommentPublicComment> callback);
    
    /**
     * Vote on a comment (synchronous)
     * 
     * @param config The widget configuration
     * @param commentId The ID of the comment to vote on
     * @param direction The direction of vote ("up", "down")
     * @param userInfo The user session information
     * @return The updated comment
     * @throws Exception If an error occurs during the API call
     */
    APICommentPublicComment voteComment(CommentWidgetConfig config, String commentId, String direction, UserSessionInfo userInfo) throws Exception;
    
    /**
     * Vote on a comment (asynchronous)
     * 
     * @param config The widget configuration
     * @param commentId The ID of the comment to vote on
     * @param direction The direction of vote ("up", "down")
     * @param userInfo The user session information
     * @param callback The callback to be executed when the API call finishes
     */
    void voteCommentAsync(CommentWidgetConfig config, String commentId, String direction, UserSessionInfo userInfo, Callback<APICommentPublicComment> callback);
    
    /**
     * Delete a comment (synchronous)
     * 
     * @param config The widget configuration
     * @param commentId The ID of the comment to delete
     * @param userInfo The user session information
     * @return The deleted comment
     * @throws Exception If an error occurs during the API call
     */
    APICommentPublicComment deleteComment(CommentWidgetConfig config, String commentId, UserSessionInfo userInfo) throws Exception;
    
    /**
     * Delete a comment (asynchronous)
     * 
     * @param config The widget configuration
     * @param commentId The ID of the comment to delete
     * @param userInfo The user session information
     * @param callback The callback to be executed when the API call finishes
     */
    void deleteCommentAsync(CommentWidgetConfig config, String commentId, UserSessionInfo userInfo, Callback<APICommentPublicComment> callback);
}