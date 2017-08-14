package behavior.command.example;

/**
 * Created by zhuyanan on 17/8/14.
 */
public interface MacroCommand extends Command {

    void add(Command command);

    void remove(Command command);

}
