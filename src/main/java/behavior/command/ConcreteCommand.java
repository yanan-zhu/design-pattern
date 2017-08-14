package behavior.command;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class ConcreteCommand implements Command {


    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
