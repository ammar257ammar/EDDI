package ai.labs.channels.differ.model.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class CreateConversationCommand extends Command {
    public static final String CREATE_CONVERSATION_EXCHANGE = "conversation";
    public static final String CREATE_CONVERSATION_ROUTING_KEY = CREATE_CONVERSATION_EXCHANGE + ".create";
    private Payload payload;

    public CreateConversationCommand(AuthContext authContext, Date createdAt) {
        super(authContext, CREATE_CONVERSATION_ROUTING_KEY, createdAt);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    public static class Payload implements Serializable {
        private String id;
        private String name;
        private List<String> participantIds;

        public Payload(String name, List<String> participantIds) {
            this.id = String.valueOf(UUID.randomUUID());
            this.name = name;
            this.participantIds = participantIds;
        }
    }
}
