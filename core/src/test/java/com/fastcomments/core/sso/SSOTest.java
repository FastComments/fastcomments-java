package com.fastcomments.core.sso;

import org.junit.jupiter.api.Test;

import java.security.GeneralSecurityException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for SSO token / verification hash generation. No network or credentials required.
 */
public class SSOTest {

    private static final String API_KEY = "test-api-key-12345";

    @Test
    public void testCreateSecureSSOProducesToken() throws GeneralSecurityException {
        SecureSSOUserData user = new SecureSSOUserData(
                "user-1", "user@example.com", "tester", "https://example.com/avatar.jpg");
        FastCommentsSSO sso = FastCommentsSSO.createSecure(API_KEY, user);

        String token = sso.prepareToSend();
        assertNotNull(token);
        assertFalse(token.isEmpty());

        SecureSSOPayload payload = sso.getSecureSSOPayload();
        assertNotNull(payload);
        assertNotNull(payload.userDataJSONBase64);
        assertNotNull(payload.verificationHash);
        assertTrue(payload.timestamp != null && payload.timestamp > 0);
    }

    @Test
    public void testCreateSimpleSSOProducesToken() {
        SimpleSSOUserData user = new SimpleSSOUserData(
                "tester", "user@example.com", "https://example.com/avatar.jpg");
        FastCommentsSSO sso = new FastCommentsSSO(user);

        String token = sso.prepareToSend();
        assertNotNull(token);
        assertFalse(token.isEmpty());
    }

    @Test
    public void testVerificationHashIsDeterministic() throws GeneralSecurityException {
        long timestamp = 1700000000000L;
        String userData = "dGVzdA=="; // base64("test")

        String hashA = SecureSSOPayload.createVerificationHash(API_KEY, timestamp, userData);
        String hashB = SecureSSOPayload.createVerificationHash(API_KEY, timestamp, userData);

        assertNotNull(hashA);
        assertFalse(hashA.isEmpty());
        assertEquals(hashA, hashB);
        assertNotEquals(hashA, SecureSSOPayload.createVerificationHash(API_KEY, timestamp + 1, userData));
    }
}
