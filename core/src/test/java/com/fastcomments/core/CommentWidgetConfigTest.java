package com.fastcomments.core;

import com.fastcomments.model.CustomConfigParameters;
import com.fastcomments.model.PollCreationMode;
import com.fastcomments.model.PollVotingMode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommentWidgetConfigTest {

    @Test
    public void testMergeWithCopiesPollSettings() {
        CommentWidgetConfig config = new CommentWidgetConfig("tenant", "page");
        CustomConfigParameters parameters = new CustomConfigParameters()
                .pollCreation(PollCreationMode.NUMBER_2)
                .pollVoting(PollVotingMode.NUMBER_1);

        config.mergeWith(parameters);

        assertEquals(PollCreationMode.NUMBER_2, config.pollCreation);
        assertEquals(PollVotingMode.NUMBER_1, config.pollVoting);
    }

    @Test
    public void testMergeWithKeepsExplicitPollSettings() {
        CommentWidgetConfig config = new CommentWidgetConfig("tenant", "page");
        config.pollCreation = PollCreationMode.NUMBER_0;
        config.pollVoting = PollVotingMode.NUMBER_0;
        CustomConfigParameters parameters = new CustomConfigParameters()
                .pollCreation(PollCreationMode.NUMBER_2)
                .pollVoting(PollVotingMode.NUMBER_1);

        config.mergeWith(parameters);

        assertEquals(PollCreationMode.NUMBER_0, config.pollCreation);
        assertEquals(PollVotingMode.NUMBER_0, config.pollVoting);
    }

    @Test
    public void testMergeWithLeavesPollSettingsUnsetWhenServerHasNone() {
        CommentWidgetConfig config = new CommentWidgetConfig("tenant", "page");

        config.mergeWith(new CustomConfigParameters());

        assertNull(config.pollCreation);
        assertNull(config.pollVoting);
    }
}
