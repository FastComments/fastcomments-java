/*
 * fastcomments
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: support@fastcomments.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fastcomments.invoker;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APICreateUserBadgeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIEmptyResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIEmptySuccessResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIGetCommentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIGetCommentsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIGetUserBadgeProgressListResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIGetUserBadgeProgressResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIGetUserBadgeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.APIGetUserBadgesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AddDomainConfig200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AddDomainConfig200ResponseAnyOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AddDomainConfigParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregateQuestionResults200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregateQuestionResultsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationOperation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationRequestSort.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationResponseStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.AggregationValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BlockFromCommentParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BlockFromCommentPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BlockSuccess.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BulkAggregateQuestionItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BulkAggregateQuestionResults200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BulkAggregateQuestionResultsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.BulkAggregateQuestionResultsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.ChangeCommentPinStatusResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CheckBlockedCommentsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CheckedCommentsForBlocked200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CombineCommentsWithQuestionResults200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CombineQuestionResultsWithCommentsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CommentData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CommentTextUpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CommentUserBadgeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CommentUserHashTagInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CommentUserMentionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateCommentParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateCommentPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateFeedPost200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateFeedPostParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateFeedPostPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateFeedPostResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateFeedPostsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateUserBadge200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CreateUserBadgeParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.CustomConfigParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteCommentPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteCommentResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteCommentVote200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteDomainConfig200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteFeedPostPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.DeleteFeedPostPublic200ResponseAnyOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.EventLogEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FComment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FCommentMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FeedPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FeedPostLink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FeedPostMediaItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FeedPostMediaItemAsset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FeedPostStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FeedPostsStatsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FindCommentsByRangeItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FindCommentsByRangeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FlagComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FlagCommentPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.FlagCommentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetAuditLogs200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetAuditLogsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetCommentText200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetCommentVoteUserNames200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetCommentVoteUserNamesSuccessResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetComments200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetCommentsPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetCommentsResponsePublicComment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetCommentsResponseWithPresencePublicComment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetDomainConfig200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetDomainConfigs200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetDomainConfigs200ResponseAnyOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetDomainConfigs200ResponseAnyOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetEventLog200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetEventLogResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetFeedPosts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetFeedPostsPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetFeedPostsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetFeedPostsStats200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetMyNotificationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetPublicFeedPostsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserBadge200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserBadgeProgressById200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserBadgeProgressList200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserBadges200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserNotificationCount200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserNotificationCountResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserNotifications200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserPresenceStatuses200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserPresenceStatusesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.GetUserReactsPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.HeaderState.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.IgnoredResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.LiveEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.LiveEventExtraInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.LockComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.MediaAsset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.MetaItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.NotificationAndCount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PatchDomainConfigParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickAPICommentUpdatableCommentFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickFCommentAPICommentFieldsKeys.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickFCommentAPICommentFieldsKeysMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickFCommentApprovedOrCommentHTML.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickFCommentIsDeletedOrCommentHTMLOrCommenterNameOrUserId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickFCommentPublicCommentFieldsKeys.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickOmitFCommentDatePublicCommentPubSubFieldsKeys.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PickTenantAuditLogTenantAuditLogKeys.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PinComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PubSubComment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PubSubVote.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PublicAPIDeleteCommentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PublicAPIGetCommentTextResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PublicAPISetCommentTextResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PublicBlockFromCommentParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PublicComment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.PublicFeedPostsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.QueryPredicate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.QueryPredicateValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.QuestionDatum.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.QuestionResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.QuestionResultAggregationOverall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.ReactBodyParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.ReactFeedPostPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.ReactFeedPostResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.RecordStringBeforeStringOrNullAfterStringOrNullValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.RecordStringStringOrNumberValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.RenderableUserNotification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.ResetUserNotifications200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.ResetUserNotificationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SaveComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SaveCommentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SaveCommentResponseOptimized.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SaveCommentsResponseWithPresence.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SearchUsers200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SearchUsersResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SetCommentText200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.SpamRule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UnBlockCommentPublic200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UnBlockFromCommentParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UnblockSuccess.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UpdateDomainConfigParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UpdateFeedPostParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UpdateUserBadge200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UpdateUserBadgeParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UpdateUserNotificationStatus200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UploadImageResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserBadge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserBadgeProgress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserNotification.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserNotificationWriteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserPresenceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserReactsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserSearchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.UserSessionInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteBodyParams.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteComment200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteDeleteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteDeleteResponseStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteResponseStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fastcomments.model.VoteResponseUser.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
