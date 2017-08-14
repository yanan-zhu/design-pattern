package behavior.command.example;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Keyboard {

    private Command playCommand;
    private Command rewindCommand;
    private Command stopCommand;

    public Command getPlayCommand() {
        return playCommand;
    }

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public Command getRewindCommand() {
        return rewindCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public Command getStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }

    public void play(){
        playCommand.execute();
    }
    /**
     * 执行倒带方法
     */
    public void rewind(){
        rewindCommand.execute();
    }
    /**
     * 执行播放方法
     */
    public void stop(){
        stopCommand.execute();
    }

}
