package structure.bridge;

/**
 * Created by zhuyanan on 17/7/25.
 */
public class MessageBySms implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("use system message,send message:" + message + " to:" + toUser);
    }
}
