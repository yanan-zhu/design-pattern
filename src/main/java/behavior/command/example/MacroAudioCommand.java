package behavior.command.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class MacroAudioCommand implements MacroCommand {

    private List<Command> commandList = new ArrayList<>();

    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {

        commandList.forEach(Command::execute);

    }
}
