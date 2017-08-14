package behavior.command.example;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Julia {

    public static void main(String[] args) {


        //receiver
        AudioPlayer audioPlayer = new AudioPlayer();

        //command
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        //invoker
        Keyboard keyboard = new Keyboard();

        keyboard.setPlayCommand(playCommand);
        keyboard.setRewindCommand(rewindCommand);
        keyboard.setStopCommand(stopCommand);

        keyboard.play();
        keyboard.rewind();
        keyboard.stop();

        MacroAudioCommand macroAudioCommand = new MacroAudioCommand();
        macroAudioCommand.add(playCommand);
        macroAudioCommand.add(rewindCommand);
        macroAudioCommand.add(stopCommand);
        macroAudioCommand.execute();


    }


}
