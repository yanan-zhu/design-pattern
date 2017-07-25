package structure.bridge;

/**
 * Created by zhuyanan on 17/7/25.
 */
public class TestBridge {
    public static void main(String[] args) {

        sendCommonMessageByEmail("test", "jim");
        sendUrgencyMessageByEmail("test", "jim");
        sendUrgencyMessageBySms("test", "jim");
        sendUrgencyMessageByMobile("test", "jim");

    }


    public static void sendCommonMessageByEmail(String message, String toUser) {


        MessageImplementor messageByEmail = new MessageByEmail();

        AbstractMessage commonMessage = new CommonMessage(messageByEmail);


        commonMessage.sendMessage(message, toUser);


    }

    public static void sendUrgencyMessageByEmail(String message, String toUser) {


        MessageImplementor emailMessage = new MessageByEmail();

        AbstractMessage urgencyMessage = new UrgencyMessage(emailMessage);


        urgencyMessage.sendMessage(message, toUser);


    }

    public static void sendUrgencyMessageBySms(String message, String toUser) {


        MessageImplementor messageBySms = new MessageBySms();

        AbstractMessage urgencyMessage = new UrgencyMessage(messageBySms);


        urgencyMessage.sendMessage(message, toUser);


    }


    public static void sendUrgencyMessageByMobile(String message, String toUser) {


        MessageImplementor messageByMobile = new MessageByMobile();

        AbstractMessage urgencyMessage = new UrgencyMessage(messageByMobile);


        urgencyMessage.sendMessage(message, toUser);


    }


}
