package behavior.command.example;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class RewindCommand implements Command {

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {

        audioPlayer.rewind();
    }
}
