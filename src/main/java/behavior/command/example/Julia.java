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
        Command remindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        //invoker
        Keyboard keyboard = new Keyboard();

        keyboard.setPlayCommand(playCommand);
        keyboard.setRewindCommand(remindCommand);
        keyboard.setStopCommand(stopCommand);

        keyboard.play();
        keyboard.rewind();
        keyboard.stop();


    }


}
