/*
 * fastcomments
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fastcomments.api;

import com.fastcomments.invoker.ApiException;
import com.fastcomments.model.BlockFromComment200Response;
import com.fastcomments.model.BlockFromCommentParams;
import com.fastcomments.model.BooleanQueryParam;
import com.fastcomments.model.CheckedCommentsForBlocked200Response;
import com.fastcomments.model.CommentData;
import com.fastcomments.model.CommentTextUpdateRequest;
import com.fastcomments.model.CreateComment200Response;
import com.fastcomments.model.DeleteComment200Response;
import com.fastcomments.model.DeleteCommentVote200Response;
import com.fastcomments.model.FlagComment200Response;
import com.fastcomments.model.GetCommentText200Response;
import com.fastcomments.model.GetCommentVoteUserNames200Response;
import com.fastcomments.model.GetComments200Response;
import com.fastcomments.model.GetUserNotificationCount200Response;
import com.fastcomments.model.GetUserNotifications200Response;
import com.fastcomments.model.LockComment200Response;
import com.fastcomments.model.PinComment200Response;
import com.fastcomments.model.ResetUserNotifications200Response;
import com.fastcomments.model.SetCommentText200Response;
import com.fastcomments.model.SortDirections;
import com.fastcomments.model.UnBlockComment200Response;
import com.fastcomments.model.UpdateUserNotificationStatus200Response;
import com.fastcomments.model.VoteBodyParams;
import com.fastcomments.model.VoteComment200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
@Disabled
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void blockFromCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        BlockFromCommentParams blockFromCommentParams = null;
        String sso = null;
        BlockFromComment200Response response = api.blockFromComment(tenantId, commentId, blockFromCommentParams, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkedCommentsForBlockedTest() throws ApiException {
        String tenantId = null;
        String commentIds = null;
        String sso = null;
        CheckedCommentsForBlocked200Response response = api.checkedCommentsForBlocked(tenantId, commentIds, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCommentTest() throws ApiException {
        String tenantId = null;
        String urlId = null;
        String broadcastId = null;
        CommentData commentData = null;
        String sessionId = null;
        String sso = null;
        CreateComment200Response response = api.createComment(tenantId, urlId, broadcastId, commentData, sessionId, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String broadcastId = null;
        String editKey = null;
        DeleteComment200Response response = api.deleteComment(tenantId, commentId, broadcastId, editKey);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCommentVoteTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String voteId = null;
        String urlId = null;
        String broadcastId = null;
        String editKey = null;
        String sso = null;
        DeleteCommentVote200Response response = api.deleteCommentVote(tenantId, commentId, voteId, urlId, broadcastId, editKey, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void flagCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        BooleanQueryParam isFlagged = null;
        String sso = null;
        FlagComment200Response response = api.flagComment(tenantId, commentId, isFlagged, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCommentTextTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String editKey = null;
        String sso = null;
        GetCommentText200Response response = api.getCommentText(tenantId, commentId, editKey, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCommentVoteUserNamesTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        Double direction = null;
        String sso = null;
        GetCommentVoteUserNames200Response response = api.getCommentVoteUserNames(tenantId, commentId, direction, sso);
        // TODO: test validations
    }

    /**
     *  req tenantId urlId
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCommentsTest() throws ApiException {
        String tenantId = null;
        String urlId = null;
        Integer page = null;
        SortDirections direction = null;
        String sso = null;
        Integer skip = null;
        Integer skipChildren = null;
        Integer limit = null;
        Integer limitChildren = null;
        Long lastGenDate = null;
        String fetchPageForCommentId = null;
        BooleanQueryParam includeConfig = null;
        BooleanQueryParam countAll = null;
        BooleanQueryParam includei10n = null;
        String locale = null;
        String modules = null;
        BooleanQueryParam isCrawler = null;
        BooleanQueryParam includeNotificationCount = null;
        BooleanQueryParam asTree = null;
        Integer maxTreeDepth = null;
        BooleanQueryParam useFullTranslationIds = null;
        String parentId = null;
        String searchText = null;
        List<String> hashTags = null;
        String userId = null;
        String customConfigStr = null;
        GetComments200Response response = api.getComments(tenantId, urlId, page, direction, sso, skip, skipChildren, limit, limitChildren, lastGenDate, fetchPageForCommentId, includeConfig, countAll, includei10n, locale, modules, isCrawler, includeNotificationCount, asTree, maxTreeDepth, useFullTranslationIds, parentId, searchText, hashTags, userId, customConfigStr);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserNotificationCountTest() throws ApiException {
        String tenantId = null;
        String sso = null;
        GetUserNotificationCount200Response response = api.getUserNotificationCount(tenantId, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserNotificationsTest() throws ApiException {
        String tenantId = null;
        Double pageSize = null;
        String afterId = null;
        BooleanQueryParam includeContext = null;
        Double afterCreatedAt = null;
        BooleanQueryParam unreadOnly = null;
        BooleanQueryParam dmOnly = null;
        BooleanQueryParam noDm = null;
        BooleanQueryParam includeTranslations = null;
        String sso = null;
        GetUserNotifications200Response response = api.getUserNotifications(tenantId, pageSize, afterId, includeContext, afterCreatedAt, unreadOnly, dmOnly, noDm, includeTranslations, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lockCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String broadcastId = null;
        String sso = null;
        LockComment200Response response = api.lockComment(tenantId, commentId, broadcastId, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void pinCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String broadcastId = null;
        String sso = null;
        PinComment200Response response = api.pinComment(tenantId, commentId, broadcastId, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetUserNotificationCountTest() throws ApiException {
        String tenantId = null;
        String sso = null;
        ResetUserNotifications200Response response = api.resetUserNotificationCount(tenantId, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetUserNotificationsTest() throws ApiException {
        String tenantId = null;
        String afterId = null;
        Double afterCreatedAt = null;
        BooleanQueryParam unreadOnly = null;
        BooleanQueryParam dmOnly = null;
        BooleanQueryParam noDm = null;
        String sso = null;
        ResetUserNotifications200Response response = api.resetUserNotifications(tenantId, afterId, afterCreatedAt, unreadOnly, dmOnly, noDm, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setCommentTextTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String broadcastId = null;
        String editKey = null;
        CommentTextUpdateRequest commentTextUpdateRequest = null;
        String sso = null;
        SetCommentText200Response response = api.setCommentText(tenantId, commentId, broadcastId, editKey, commentTextUpdateRequest, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unBlockCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        BlockFromCommentParams blockFromCommentParams = null;
        String sso = null;
        UnBlockComment200Response response = api.unBlockComment(tenantId, commentId, blockFromCommentParams, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unLockCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String broadcastId = null;
        String sso = null;
        LockComment200Response response = api.unLockComment(tenantId, commentId, broadcastId, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unPinCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String broadcastId = null;
        String sso = null;
        PinComment200Response response = api.unPinComment(tenantId, commentId, broadcastId, sso);
        // TODO: test validations
    }

    /**
     * Enable or disable notifications for a specific comment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserNotificationCommentSubscriptionStatusTest() throws ApiException {
        String tenantId = null;
        String notificationId = null;
        String optedInOrOut = null;
        String commentId = null;
        String sso = null;
        UpdateUserNotificationStatus200Response response = api.updateUserNotificationCommentSubscriptionStatus(tenantId, notificationId, optedInOrOut, commentId, sso);
        // TODO: test validations
    }

    /**
     * Enable or disable notifications for a page. When users are subscribed to a page, notifications are created for new root comments, and also
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserNotificationPageSubscriptionStatusTest() throws ApiException {
        String tenantId = null;
        String urlId = null;
        String url = null;
        String pageTitle = null;
        String subscribedOrUnsubscribed = null;
        String sso = null;
        UpdateUserNotificationStatus200Response response = api.updateUserNotificationPageSubscriptionStatus(tenantId, urlId, url, pageTitle, subscribedOrUnsubscribed, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserNotificationStatusTest() throws ApiException {
        String tenantId = null;
        String notificationId = null;
        String newStatus = null;
        String sso = null;
        UpdateUserNotificationStatus200Response response = api.updateUserNotificationStatus(tenantId, notificationId, newStatus, sso);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void voteCommentTest() throws ApiException {
        String tenantId = null;
        String commentId = null;
        String urlId = null;
        String broadcastId = null;
        VoteBodyParams voteBodyParams = null;
        String sessionId = null;
        String sso = null;
        VoteComment200Response response = api.voteComment(tenantId, commentId, urlId, broadcastId, voteBodyParams, sessionId, sso);
        // TODO: test validations
    }

}
