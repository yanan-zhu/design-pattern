package structure.bridge;

/**
 * Created by zhuyanan on 17/7/25.
 */
public abstract class AbstractMessage {

    private MessageImplementor implementor;

    public AbstractMessage(MessageImplementor implementor) {
        this.implementor = implementor;
    }

    public void sendMessage(String message, String toUser) {
        implementor.send(message, toUser);
    }
}
