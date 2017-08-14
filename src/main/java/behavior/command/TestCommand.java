package behavior.command;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class TestCommand {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker(command);

        invoker.action();

    }

}
