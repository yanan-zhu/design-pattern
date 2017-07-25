package structure.bridge;

/**
 * Created by zhuyanan on 17/7/25.
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor implementor) {
        super(implementor);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "Urgency[" + message + "]";
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        return null;
    }
}
