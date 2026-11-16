package com.fastcomments;

import com.fastcomments.invoker.JSON;
import com.fastcomments.model.GetCommentsResponseWithPresencePublicComment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The server adds response fields over time, and apps stay on old SDK versions, so a field the client doesn't know
 * must be ignored, not rejected.
 */
public class UnknownResponseFieldsTest {

    @Test
    public void testIgnoresFieldsTheClientDoesNotKnow() {
        String body = "{\"status\":\"success\",\"comments\":[],\"user\":null,\"pageNumber\":0,"
                + "\"aFieldAddedLater\":1,"
                + "\"customConfig\":{\"pageSize\":30,\"aSettingAddedLater\":true}}";

        GetCommentsResponseWithPresencePublicComment response =
                JSON.deserialize(body, GetCommentsResponseWithPresencePublicComment.class);

        assertEquals("success", response.getStatus());
        assertEquals(30, response.getCustomConfig().getPageSize());
    }
}
