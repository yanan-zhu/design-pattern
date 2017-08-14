package behavior.command;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Invoker {

    private Command command = null;


    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {

        command.execute();

    }

}
