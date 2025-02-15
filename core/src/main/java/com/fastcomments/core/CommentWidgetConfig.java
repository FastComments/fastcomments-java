package com.fastcomments.core;

import com.fastcomments.model.APICommentPublicComment;
import com.fastcomments.model.CustomConfigParameters;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class CommentWidgetConfig {
    /**
     * Id that represents you as a customer.
     */
    public String tenantId;
    /**
     * Id representing the page (could be a URL or an article id).
     */
    public String urlId;
    /**
     * URL that represents the page.
     */
    public String url;
    /**
     * The region your account is in (e.g., "eu").
     */
    public String region;
    /**
     * Default avatar image path.
     */
    public String defaultAvatarSrc;
    /**
     * Whether the comment widget is on a dark background.
     */
    public Boolean hasDarkBackground;
    /**
     * List of moderation group ids.
     */
    public List<String> moderationGroupIds;
    /**
     * The page we should render first. Defaults to 0.
     */
    public Integer startingPage;
    /**
     * Title of the page that the widget is on.
     */
    public String pageTitle;
    /**
     * String used to compose the comment count.
     * Use [count] to interpolate value.
     */
    public String commentCountFormat;
    /**
     * The original referrer.
     */
    public String originalReferrer;
    /**
     * Don't show avatars.
     */
    public Boolean hideAvatars;
    /**
     * Disable commenting for this page, but still show the comments.
     */
    public Boolean readonly;
    /**
     * Only disable adding new root comments.
     */
    public Boolean noNewRootComments;
    /**
     * Place the page-level comment reply at the bottom of the comment list.
     */
    public Boolean inputAfterComments;
    /**
     * Maximum character length for a comment.
     */
    public Integer maxCommentCharacterLength;
    /**
     * Don't use relative dates.
     */
    public Boolean absoluteDates;
    /**
     * Show both relative and absolute dates.
     */
    public Boolean absoluteAndRelativeDates;
    /**
     * Custom CSS.
     */
    public String customCSS;
    /**
     * Enables a "Show Comments" toggle button.
     */
    public Boolean useShowCommentsToggle;
    /**
     * Disables email requirement.
     */
    public Boolean allowAnon;
    /**
     * Disables email/username requirement for votes.
     */
    public Boolean allowAnonVotes;
    /**
     * Disables blocking.
     */
    public Boolean disableBlocking;
    /**
     * Disables email inputs.
     */
    public Boolean disableEmailInputs;
    /**
     * Disables the "Unverified Comment" label.
     */
    public Boolean disableUnverifiedLabel;
    /**
     * Disables support for @mentions.
     */
    public Boolean disableMentions;
    /**
     * The default value of the username field.
     */
    public String defaultUsername;
    /**
     * Disables adding images.
     */
    public Boolean noImageUploads;
    /**
     * Disables the WYSIWYG toolbar.
     */
    public Boolean disableToolbar;
    /**
     * Locale to render the widget for.
     */
    public String locale;
    /**
     * Whether the comment count should include all comments.
     */
    public Boolean countAll;
    /**
     * Whether to show comments right away.
     */
    public Boolean showLiveRightAway;
    /**
     * Whether to collect a link from the user when commenting.
     */
    public Boolean enableCommenterLinks;
    /**
     * Whether to track and show comment viewed counts on each comment.
     */
    public Boolean enableViewCounts;
    /**
     * The default sort direction. "MR" (most relevant), "NF" (newest first), or "OF" (oldest first).
     * Null indicates the default.
     */
    public String defaultSortDirection;
    /**
     * Changes the comment input field to be single line instead of a textarea.
     */
    public Boolean useSingleLineCommentInput;
    /**
     * Puts pagination before the list of comments.
     */
    public Boolean paginationBeforeComments;
    /**
     * Puts the date inline with the thumbs up/down toolbar.
     */
    public Boolean showDateInline;
    /**
     * SSO Configuration.
     */
    public FastCommentsSSO sso;
    /**
     * Simple SSO Configuration.
     */
    public SSOUserDataSimple simpleSSO;

    // Callbacks
    /**
     * Invoked when library initializes.
     */
    public Runnable onInit;
    /**
     * Invoked when user authentication changes.
     * The first parameter is an event type (e.g., "user-set", "logout"),
     * and the second is the related data.
     */
    public BiConsumer<String, Object> onAuthenticationChange;
    /**
     * Invoked when library renders content.
     */
    public Runnable onRender;
    /**
     * Invoked when library renders comments.
     */
    public Consumer<List<APICommentPublicComment>> onCommentsRendered;
    /**
     * Invoked when the comment count changes.
     */
    public Consumer<Integer> commentCountUpdated;
    /**
     * Invoked when replying is successful.
     */
    public Consumer<APICommentPublicComment> onReplySuccess;
    /**
     * Invoked when voting is successful.
     * Parameters: comment, voteId, direction ("up", "down", "deleted"), and status.
     */
    public VoteSuccessCallback onVoteSuccess;
    /**
     * Invoked when clicking an image inside a comment.
     */
    public Consumer<String> onImageClicked;
    /**
     * Invoked when trying to open a user's profile.
     * Return true to prevent loading spinner.
     */
    public OpenProfileCallback onOpenProfile;
    /**
     * Invoked when a user blocks or unblocks another user.
     * Parameters: userId, comment, and whether the user is blocked.
     */
    public UserBlockedCallback onUserBlocked;
    /**
     * Invoked when a user flags or un-flags a comment.
     */
    public CommentFlaggedCallback onCommentFlagged;
    /**
     * Invoked when a user edits a comment.
     */
    public BiConsumer<String, APICommentPublicComment> onCommentEdited;
    /**
     * Invoked when a user deletes a comment.
     */
    public BiConsumer<String, APICommentPublicComment> onCommentDeleted;
    /**
     * Invoked when a user submits a comment.
     * You must call either continueSubmitFn or cancelFn.
     */
    public CommentSubmitStartCallback onCommentSubmitStart;
    /**
     * The rating used for the gif picker. (e.g., "g", "pg", "pg-13", "r")
     */
    public String gifRating;
    /**
     * Add new comments to the bottom rather than the top.
     */
    public Boolean newCommentsToBottom;
    /**
     * Collapse all replies by default.
     */
    public Boolean collapseReplies;
    /**
     * The maximum depth of comment threads.
     */
    public Integer maxReplyDepth;
    /**
     * A list of group ids to use for @mentions autocomplete.
     */
    public List<String> mentionGroupIds;
    /**
     * Disables live commenting.
     */
    public Boolean disableLiveCommenting;
    /**
     * Disables the success message after commenting.
     */
    public Boolean disableSuccessMessage;
    /**
     * Disables the notification bell.
     */
    public Boolean disableNotificationBell;
    /**
     * Disables opening profiles when clicking the user's avatar.
     */
    public Boolean disableProfiles;
    /**
     * Disables voting and removes vote counts.
     */
    public Boolean disableVoting;
    /**
     * EXPERIMENTAL: A list of small images to use for reactions.
     */
    public List<String> inlineReactImages;
    /**
     * Clicking reply to a comment will re-use the root reply field.
     */
    public Boolean useSingleReplyField;
    /**
     * Enable infinite scrolling.
     */
    public Boolean enableInfiniteScrolling;
    /**
     * For user activity feeds ONLY.
     */
    public String userId;
    /**
     * For user activity feeds ONLY.
     */
    public String ssoTenantId;
    /**
     * Jump/scroll to a given comment by id.
     */
    public String jumpToId;
    /**
     * Custom API host.
     */
    public String apiHost;
    /**
     * Custom WS host.
     */
    public String wsHost;
    /**
     * Whether to use polling instead of WebSockets.
     */
    public Boolean usePolling;
    /**
     * Custom translations.
     */
    public Map<String, String> translations;
    /**
     * The product being used.
     */
    public Integer productId;
    /**
     * Meta data to tie to the comment.
     */
    public Map<String, Object> commentMeta;
    /**
     * Configuration for emoticons that show above the widget.
     */
    public PageReactsConfig pageReactConfig;
    /**
     * How to style voting.
     */
    public VoteStyle voteStyle;
    /**
     * Jump to a given hashtag.
     */
    public String jumpToHashTag;
    /**
     * Tell the library to not fetch the widget config from the server.
     */
    public Boolean noCustomConfig;
    /**
     * Show list of users that voted on a comment when hovering over the vote button.
     */
    public Boolean enableVoteList;
    /**
     * Enables a search box to search for comments on the current page.
     */
    public Boolean enableSearch;
    /**
     * Ignore the comment menu when determining the widget height.
     */
    public Boolean ignoreCommentMenuHeight;

    public CommentWidgetConfig(String tenantId, String urlId) {
        this.tenantId = tenantId;
        this.urlId = urlId;
    }

    /**
     * You probably don't want to use this. This is here for serialization etc. Use one of the constructors with args.
     */
    public CommentWidgetConfig() {

    }

    public void mergeWith(CustomConfigParameters parameters) {

    }
}
