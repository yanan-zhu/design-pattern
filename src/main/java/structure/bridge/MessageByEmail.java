package structure.bridge;

/**
 * Created by zhuyanan on 17/7/25.
 */
public class MessageByEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("use email message,send message:" + message + " to:" + toUser);
    }
}
