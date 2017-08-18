package behavior.state.example;

/**
 * Created by zhuyanan on 17/8/18.
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println(String.format("%s added to black!", user));
    }
}
