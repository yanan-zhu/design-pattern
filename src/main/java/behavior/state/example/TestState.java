package behavior.state.example;

import java.util.Scanner;

/**
 * Created by zhuyanan on 17/8/18.
 */
public class TestState {
    public static void main(String[] args) throws InterruptedException {

        VoteManager voteManager = new VoteManager();
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {

            String input = scanner.next();

            voteManager.vote("admin", input);

        }
    }
}
