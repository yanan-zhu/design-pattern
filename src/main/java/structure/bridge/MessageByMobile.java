package structure.bridge;

/**
 * Created by zhuyanan on 17/7/25.
 */
public class MessageByMobile implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("use mobile message,send message:" + message + " to:" + toUser);
    }
}
