package com.fastcomments.core;

import com.fastcomments.core.callbacks.*;
import com.fastcomments.core.sso.FastCommentsSSO;
import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.GifRating;
import com.fastcomments.model.SortDirections;

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
     * Domain that represents the page.
     */
    public String domain;
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
    public SortDirections defaultSortDirection;
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
    public Consumer<List<Object>> onCommentsRendered;
    /**
     * Invoked when the comment count changes.
     */
    public Consumer<Integer> commentCountUpdated;
    /**
     * Invoked when replying is successful.
     */
    public Consumer<Object> onReplySuccess;
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
    public BiConsumer<String, Object> onCommentEdited;
    /**
     * Invoked when a user deletes a comment.
     */
    public BiConsumer<String, Object> onCommentDeleted;
    /**
     * Invoked when a user submits a comment.
     * You must call either continueSubmitFn or cancelFn.
     */
    public CommentSubmitStartCallback onCommentSubmitStart;
    /**
     * The rating used for the gif picker. (e.g., "g", "pg", "pg-13", "r")
     */
    public GifRating gifRating;
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
     * Basic construction of the widget configuration - we need your account (tenant) and page/article id (urlId).
     * However, you probably want to use the constructor that takes page title etc - this will provide a better experience.
     */
    public CommentWidgetConfig(String tenantId, String urlId) {
        this.tenantId = tenantId;
        this.urlId = urlId;
    }

    /**
     * Specifying the url, page title, etc, provides a better user experience for notifications and so on.
     */
    public CommentWidgetConfig(String tenantId, String urlId, String url, String domain, String pageTitle) {
        this.tenantId = tenantId;
        this.urlId = urlId;
        this.url = url;
        this.domain = domain;
        this.pageTitle = pageTitle;
    }

    /**
     * Gets the domain from the URL if domain is not set
     *
     * @return domain or extracted domain from URL
     */
    public String getDomain() {
        if (domain != null && !domain.isEmpty()) {
            return domain;
        }

        if (url != null && !url.isEmpty()) {
            try {
                java.net.URI uri = new java.net.URI(url);
                return uri.getHost();
            } catch (Exception e) {
                // If URL parsing fails, return null
                return null;
            }
        }

        return null;
    }

    /**
     * You probably don't want to use this. This is here for serialization etc. Use one of the constructors with args.
     */
    public CommentWidgetConfig() {

    }

    public String getSSOToken() {
        if (sso != null) {
            return sso.prepareToSend();
        }
        return null;
    }

    public void mergeWith(CustomConfigParameters parameters) {
        if (parameters.getDefaultAvatarSrc() != null && defaultAvatarSrc == null) {
            defaultAvatarSrc = parameters.getDefaultAvatarSrc();
        }
        if (parameters.getHasDarkBackground() != null && hasDarkBackground == null) {
            hasDarkBackground = parameters.getHasDarkBackground();
        }
        if (parameters.getCommentCountFormat() != null && commentCountFormat == null) {
            commentCountFormat = parameters.getCommentCountFormat();
        }
        if (parameters.getHideAvatars() != null && hideAvatars == null) {
            hideAvatars = parameters.getHideAvatars();
        }
        if (parameters.getReadonly() != null && readonly == null) {
            readonly = parameters.getReadonly();
        }
        if (parameters.getInputAfterComments() != null && inputAfterComments == null) {
            inputAfterComments = parameters.getInputAfterComments();
        }
        if (parameters.getMaxCommentCharacterLength() != null && maxCommentCharacterLength == null) {
            maxCommentCharacterLength = parameters.getMaxCommentCharacterLength().intValue();
        }
        if (parameters.getAbsoluteDates() != null && absoluteDates == null) {
            absoluteDates = parameters.getAbsoluteDates();
        }
        if (parameters.getAbsoluteAndRelativeDates() != null && absoluteAndRelativeDates == null) {
            absoluteAndRelativeDates = parameters.getAbsoluteAndRelativeDates();
        }
        if (parameters.getCustomCSS() != null && customCSS == null) {
            customCSS = parameters.getCustomCSS();
        }
        if (parameters.getUseShowCommentsToggle() != null && useShowCommentsToggle == null) {
            useShowCommentsToggle = parameters.getUseShowCommentsToggle();
        }
        if (parameters.getAllowAnon() != null && allowAnon == null) {
            allowAnon = parameters.getAllowAnon();
        }
        if (parameters.getAllowAnonVotes() != null && allowAnonVotes == null) {
            allowAnonVotes = parameters.getAllowAnonVotes();
        }
        if (parameters.getDisableBlocking() != null && disableBlocking == null) {
            disableBlocking = parameters.getDisableBlocking();
        }
        if (parameters.getDisableEmailInputs() != null && disableEmailInputs == null) {
            disableEmailInputs = parameters.getDisableEmailInputs();
        }
        if (parameters.getDisableUnverifiedLabel() != null && disableUnverifiedLabel == null) {
            disableUnverifiedLabel = parameters.getDisableUnverifiedLabel();
        }
        if (parameters.getDefaultUsername() != null && defaultUsername == null) {
            defaultUsername = parameters.getDefaultUsername();
        }
        if (parameters.getNoImageUploads() != null && noImageUploads == null) {
            noImageUploads = parameters.getNoImageUploads();
        }
        if (parameters.getDisableToolbar() != null && disableToolbar == null) {
            disableToolbar = parameters.getDisableToolbar();
        }
        if (parameters.getLocale() != null && locale == null) {
            locale = parameters.getLocale();
        }
        if (parameters.getShowLiveRightAway() != null && showLiveRightAway == null) {
            showLiveRightAway = parameters.getShowLiveRightAway();
        }
        if (parameters.getEnableCommenterLinks() != null && enableCommenterLinks == null) {
            enableCommenterLinks = parameters.getEnableCommenterLinks();
        }
        if (parameters.getEnableViewCounts() != null && enableViewCounts == null) {
            enableViewCounts = parameters.getEnableViewCounts();
        }
        if (parameters.getDefaultSortDirection() != null && defaultSortDirection == null) {
            defaultSortDirection = parameters.getDefaultSortDirection();
        }
        if (parameters.getUseSingleLineCommentInput() != null && useSingleLineCommentInput == null) {
            useSingleLineCommentInput = parameters.getUseSingleLineCommentInput();
        }
        if (parameters.getGifRating() != null && gifRating == null) {
            gifRating = parameters.getGifRating();
        }
        if (parameters.getCollapseReplies() != null && collapseReplies == null) {
            collapseReplies = parameters.getCollapseReplies();
        }
        if (parameters.getDisableLiveCommenting() != null && disableLiveCommenting == null) {
            disableLiveCommenting = parameters.getDisableLiveCommenting();
        }
        if (parameters.getDisableSuccessMessage() != null && disableSuccessMessage == null) {
            disableSuccessMessage = parameters.getDisableSuccessMessage();
        }
        if (parameters.getDisableNotificationBell() != null && disableNotificationBell == null) {
            disableNotificationBell = parameters.getDisableNotificationBell();
        }
        if (parameters.getDisableProfiles() != null && disableProfiles == null) {
            disableProfiles = parameters.getDisableProfiles();
        }
        if (parameters.getDisableVoting() != null && disableVoting == null) {
            disableVoting = parameters.getDisableVoting();
        }
        if (parameters.getTranslations() != null && translations == null) {
            translations = parameters.getTranslations();
        }
        if (parameters.getVoteStyle() != null && voteStyle == null) {
            switch (parameters.getVoteStyle()) {
                case NUMBER_0:
                    voteStyle = VoteStyle.UpDown;
                    break;
                case NUMBER_1:
                    voteStyle = VoteStyle.Heart;
                    break;
            }
        }
        if (parameters.getNoCustomConfig() != null && noCustomConfig == null) {
            noCustomConfig = parameters.getNoCustomConfig();
        }
        if (parameters.getEnableVoteList() != null && enableVoteList == null) {
            enableVoteList = parameters.getEnableVoteList();
        }
        if (parameters.getEnableSearch() != null && enableSearch == null) {
            enableSearch = parameters.getEnableSearch();
        }
    }
}
