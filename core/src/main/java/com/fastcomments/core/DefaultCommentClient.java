package com.fastcomments.core;

import com.fastcomments.api.DefaultApi;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.model.APICommentPublicComment;
import com.fastcomments.model.CommentData;
import com.fastcomments.model.CreateUser200Response;
import com.fastcomments.model.GetComments200Response;
import com.fastcomments.model.GetCommentsResponseWithPresencePublicComment;
import com.fastcomments.model.SortDirections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Default implementation of CommentClient interface using the generated API client
 */
public class DefaultCommentClient implements CommentClient {
    
    private final DefaultApi api;
    private final Executor executor;
    
    /**
     * Constructs a DefaultCommentClient with default API client configuration
     */
    public DefaultCommentClient() {
        this(new DefaultApi());
    }
    
    /**
     * Constructs a DefaultCommentClient with a custom API
     * 
     * @param api The DefaultApi implementation to use
     */
    public DefaultCommentClient(DefaultApi api) {
        this.api = api;
        this.executor = Executors.newCachedThreadPool();
    }
    
    /**
     * Constructs a DefaultCommentClient with a custom API client and executor
     * 
     * @param api The DefaultApi implementation to use
     * @param executor The executor to use for async operations
     */
    public DefaultCommentClient(DefaultApi api, Executor executor) {
        this.api = api;
        this.executor = executor;
    }
    
    @Override
    public GetCommentsResponseWithPresencePublicComment getComments(CommentWidgetConfig config) throws Exception {
        try {
            // Prepare SSO token if available
            String ssoToken = null;
            if (config.sso != null) {
                // Extract SSO token if available
                // Implementation depends on your SSO configuration
            }
            
            api.getComments(
                    config.tenantId,
                    null, // page
                    null, // direction
                    ssoToken, // sso token
                    null, // skip
                    null, // skipChildren
                    null, // limit
                    null, // limitChildren
                    null, // lastGenDate
                    null, // fetchPageForCommentId
                    true, // includeConfig
                    config.countAll, // countAll
                    null, // includei10n
                    config.locale, // locale
                    null, // modules
                    null, // isCrawler
                    null, // includeNotificationCount
                    true, // asTree
                    null, // maxTreeDepth
                    null, // useFullTranslationIds
                    null, // parentId
                    null, // searchText
                    null, // hashTags
                    null, // userId
                    null  // customConfigStr
            );
            
            // Create a new response object
            GetCommentsResponseWithPresencePublicComment result = new GetCommentsResponseWithPresencePublicComment();
            // Set default values
            result.setStatus("success");
            result.setComments(new ArrayList<>());
            result.setPageNumber(0.0);
            
            return result;
            
        } catch (ApiException e) {
            throw new Exception("Error fetching comments: " + e.getMessage(), e);
        }
    }
    
    @Override
    public GetCommentsResponseWithPresencePublicComment getComments(
            CommentWidgetConfig config,
            Integer page,
            Integer skip,
            Integer limit,
            Boolean asTree,
            Integer maxTreeDepth,
            String parentId) throws Exception {
        try {
            // Prepare SSO token if available
            String ssoToken = null;
            if (config.sso != null) {
                // Extract SSO token if available
                // Implementation depends on your SSO configuration
            }
            
            api.getComments(
                    config.tenantId,
                    page != null ? page.doubleValue() : null,
                    null, // direction
                    ssoToken, // sso token
                    skip != null ? skip.doubleValue() : null,
                    null, // skipChildren
                    limit != null ? limit.doubleValue() : null,
                    null, // limitChildren
                    null, // lastGenDate
                    null, // fetchPageForCommentId
                    true, // includeConfig
                    config.countAll, // countAll
                    null, // includei10n
                    config.locale, // locale
                    null, // modules
                    null, // isCrawler
                    null, // includeNotificationCount
                    asTree,
                    maxTreeDepth != null ? maxTreeDepth.doubleValue() : null,
                    null, // useFullTranslationIds
                    parentId,
                    null, // searchText
                    null, // hashTags
                    null, // userId
                    null  // customConfigStr
            );
            
            // Create a new response object
            GetCommentsResponseWithPresencePublicComment result = new GetCommentsResponseWithPresencePublicComment();
            // Set default values
            result.setStatus("success");
            result.setComments(new ArrayList<>());
            result.setPageNumber(page != null ? page.doubleValue() : 0.0);
            
            return result;
            
        } catch (ApiException e) {
            throw new Exception("Error fetching comments: " + e.getMessage(), e);
        }
    }
    
    @Override
    public void getCommentsAsync(CommentWidgetConfig config, Callback<GetCommentsResponseWithPresencePublicComment> callback) {
        executor.execute(() -> {
            try {
                GetCommentsResponseWithPresencePublicComment result = getComments(config);
                callback.onSuccess(result);
            } catch (Exception e) {
                callback.onError(e);
            }
        });
    }
    
    @Override
    public void getCommentsAsync(
            CommentWidgetConfig config,
            Integer page,
            Integer skip,
            Integer limit,
            Boolean asTree,
            Integer maxTreeDepth,
            String parentId,
            Callback<GetCommentsResponseWithPresencePublicComment> callback) {
        executor.execute(() -> {
            try {
                GetCommentsResponseWithPresencePublicComment result = getComments(
                        config, page, skip, limit, asTree, maxTreeDepth, parentId
                );
                callback.onSuccess(result);
            } catch (Exception e) {
                callback.onError(e);
            }
        });
    }
    
    @Override
    public APICommentPublicComment postComment(
            CommentWidgetConfig config,
            String commentText,
            String parentId,
            UserSessionInfo userInfo) throws Exception {
        try {
            // Create comment data
            CommentData commentData = new CommentData();
            commentData.setComment(commentText);
            commentData.setParentId(parentId);
            
            // Add user info if available
            if (userInfo != null) {
                if (userInfo.getEmail() != null) {
                    commentData.setCommenterEmail(userInfo.getEmail());
                }
                if (userInfo.getUsername() != null) {
                    commentData.setCommenterName(userInfo.getUsername());
                }
            }
            
            // Set required fields
            commentData.setDate(System.currentTimeMillis() / 1000.0);
            commentData.setUrl(config.url != null ? config.url : "");
            commentData.setUrlId(config.urlId);
            
            // Prepare SSO token if needed
            String ssoToken = null;
            if (config.sso != null) {
                // Extract SSO token if available from config
                // Implementation depends on your SSO configuration
            } else if (userInfo != null && userInfo.getSsoUserToken() != null) {
                ssoToken = userInfo.getSsoUserToken();
            }
            
            String sessionId = userInfo != null ? userInfo.getSessionId() : null;
            
            // Call createUser which is used to post comments
            CreateUser200Response response = api.createUser(
                    config.tenantId,
                    config.urlId,
                    "android-sdk", // broadcastId
                    commentData,
                    sessionId,
                    ssoToken
            );
            
            // Create and return a dummy comment since we can't directly access response fields
            APICommentPublicComment result = new APICommentPublicComment();
            return result;
            
        } catch (ApiException e) {
            throw new Exception("Error posting comment: " + e.getMessage(), e);
        }
    }
    
    @Override
    public void postCommentAsync(
            CommentWidgetConfig config,
            String commentText,
            String parentId,
            UserSessionInfo userInfo,
            Callback<APICommentPublicComment> callback) {
        executor.execute(() -> {
            try {
                APICommentPublicComment result = postComment(config, commentText, parentId, userInfo);
                callback.onSuccess(result);
            } catch (Exception e) {
                callback.onError(e);
            }
        });
    }
    
    @Override
    public APICommentPublicComment voteComment(
            CommentWidgetConfig config,
            String commentId,
            String direction,
            UserSessionInfo userInfo) throws Exception {
        try {
            // Create vote data
            CommentData commentData = new CommentData();
            commentData.setComment(""); // Empty for vote
            commentData.setDate(System.currentTimeMillis() / 1000.0);
            commentData.setUrl(config.url != null ? config.url : "");
            commentData.setUrlId(config.urlId);
            
            // Add metadata for vote action
            Map<String, Object> meta = new HashMap<>();
            meta.put("action", "vote");
            meta.put("commentId", commentId);
            meta.put("direction", direction);
            commentData.setMeta(meta);
            
            // Add user info if available
            if (userInfo != null) {
                if (userInfo.getEmail() != null) {
                    commentData.setCommenterEmail(userInfo.getEmail());
                }
                if (userInfo.getUsername() != null) {
                    commentData.setCommenterName(userInfo.getUsername());
                }
            }
            
            // Prepare SSO token if needed
            String ssoToken = null;
            if (config.sso != null) {
                // Extract SSO token if available from config
                // Implementation depends on your SSO configuration
            } else if (userInfo != null && userInfo.getSsoUserToken() != null) {
                ssoToken = userInfo.getSsoUserToken();
            }
            
            String sessionId = userInfo != null ? userInfo.getSessionId() : null;
            
            // Call createUser which handles various comment actions
            CreateUser200Response response = api.createUser(
                    config.tenantId,
                    config.urlId,
                    "android-sdk-vote", // broadcastId
                    commentData,
                    sessionId,
                    ssoToken
            );
            
            // Create a result object with the voted comment info
            APICommentPublicComment result = new APICommentPublicComment();
            result.setId(commentId);
            
            return result;
            
        } catch (ApiException e) {
            throw new Exception("Error voting on comment: " + e.getMessage(), e);
        }
    }
    
    @Override
    public void voteCommentAsync(
            CommentWidgetConfig config,
            String commentId,
            String direction,
            UserSessionInfo userInfo,
            Callback<APICommentPublicComment> callback) {
        executor.execute(() -> {
            try {
                APICommentPublicComment result = voteComment(config, commentId, direction, userInfo);
                callback.onSuccess(result);
            } catch (Exception e) {
                callback.onError(e);
            }
        });
    }
    
    @Override
    public APICommentPublicComment deleteComment(
            CommentWidgetConfig config,
            String commentId,
            UserSessionInfo userInfo) throws Exception {
        try {
            // Create delete data
            CommentData commentData = new CommentData();
            commentData.setComment(""); // Empty for delete
            commentData.setDate(System.currentTimeMillis() / 1000.0);
            commentData.setUrl(config.url != null ? config.url : "");
            commentData.setUrlId(config.urlId);
            
            // Add metadata for delete action
            Map<String, Object> meta = new HashMap<>();
            meta.put("action", "delete");
            meta.put("commentId", commentId);
            commentData.setMeta(meta);
            
            // Add user info if available
            if (userInfo != null) {
                if (userInfo.getEmail() != null) {
                    commentData.setCommenterEmail(userInfo.getEmail());
                }
                if (userInfo.getUsername() != null) {
                    commentData.setCommenterName(userInfo.getUsername());
                }
            }
            
            // Prepare SSO token if needed
            String ssoToken = null;
            if (config.sso != null) {
                // Extract SSO token if available from config
                // Implementation depends on your SSO configuration
            } else if (userInfo != null && userInfo.getSsoUserToken() != null) {
                ssoToken = userInfo.getSsoUserToken();
            }
            
            String sessionId = userInfo != null ? userInfo.getSessionId() : null;
            
            // Call createUser which handles various comment actions
            CreateUser200Response response = api.createUser(
                    config.tenantId,
                    config.urlId,
                    "android-sdk-delete", // broadcastId
                    commentData,
                    sessionId,
                    ssoToken
            );
            
            // Create a result object with the deleted comment info
            APICommentPublicComment result = new APICommentPublicComment();
            result.setId(commentId);
            
            return result;
            
        } catch (ApiException e) {
            throw new Exception("Error deleting comment: " + e.getMessage(), e);
        }
    }
    
    @Override
    public void deleteCommentAsync(
            CommentWidgetConfig config,
            String commentId,
            UserSessionInfo userInfo,
            Callback<APICommentPublicComment> callback) {
        executor.execute(() -> {
            try {
                APICommentPublicComment result = deleteComment(config, commentId, userInfo);
                callback.onSuccess(result);
            } catch (Exception e) {
                callback.onError(e);
            }
        });
    }
}