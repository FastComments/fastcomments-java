package com.fastcomments;

import com.fastcomments.api.PublicApi;
import com.fastcomments.core.sso.FastCommentsSSO;
import com.fastcomments.core.sso.SecureSSOUserData;
import com.fastcomments.invoker.ApiClient;
import com.fastcomments.invoker.ApiException;
import com.fastcomments.model.APIStatus;
import com.fastcomments.model.CommentData;
import com.fastcomments.model.GetCommentsResponseWithPresencePublicComment;
import com.fastcomments.model.SaveCommentsResponseWithPresence;
import org.junit.jupiter.api.Test;

import java.security.GeneralSecurityException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Integration tests that hit the live FastComments API. Requires FASTCOMMENTS_API_KEY and
 * FASTCOMMENTS_TENANT_ID; skipped when they are not set.
 */
public class SSOIntegrationTest {

    private static final String API_KEY = System.getenv("FASTCOMMENTS_API_KEY");
    private static final String TENANT_ID = System.getenv("FASTCOMMENTS_TENANT_ID");
    private static final String BASE_URL =
            System.getenv().getOrDefault("FASTCOMMENTS_BASE_URL", "https://fastcomments.com");

    private PublicApi publicApi() {
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(BASE_URL);
        return new PublicApi(apiClient);
    }

    @Test
    public void testCreateAndFetchCommentWithSecureSSO() throws GeneralSecurityException, ApiException {
        assumeTrue(API_KEY != null && !API_KEY.isEmpty(), "FASTCOMMENTS_API_KEY is required");
        assumeTrue(TENANT_ID != null && !TENANT_ID.isEmpty(), "FASTCOMMENTS_TENANT_ID is required");

        long timestamp = System.currentTimeMillis();
        String urlId = "sdk-test-java-" + timestamp;
        String commentText = "Test from Java SDK at " + timestamp;

        SecureSSOUserData user = new SecureSSOUserData(
                "java-user-" + timestamp,
                "java-" + timestamp + "@example.com",
                "javatester" + timestamp,
                "https://example.com/avatar.jpg");
        FastCommentsSSO sso = FastCommentsSSO.createSecure(API_KEY, user);
        String token = sso.prepareToSend();

        CommentData commentData = new CommentData()
                .commenterName(user.username)
                .comment(commentText)
                .url("https://example.com/java-test")
                .urlId(urlId);

        SaveCommentsResponseWithPresence createResponse = publicApi()
                .createCommentPublic(TENANT_ID, urlId, "java-test-" + timestamp, commentData)
                .sso(token)
                .execute();

        assertEquals(APIStatus.SUCCESS, createResponse.getStatus(), "Create comment should succeed");
        assertNotNull(createResponse.getComment(), "Response should include the created comment");
        assertEquals(user.username, createResponse.getComment().getCommenterName());
        assertTrue(createResponse.getComment().getCommentHTML().contains(commentText));

        GetCommentsResponseWithPresencePublicComment getResponse = publicApi()
                .getCommentsPublic(TENANT_ID, urlId)
                .sso(token)
                .execute();

        assertEquals("success", getResponse.getStatus(), "Get comments should succeed");
        assertNotNull(getResponse.getComments());
        assertTrue(getResponse.getComments().size() >= 1, "Should have at least one comment");
        assertEquals(user.username, getResponse.getComments().get(0).getCommenterName());
    }
}
