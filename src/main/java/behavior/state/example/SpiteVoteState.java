package behavior.state.example;

/**
 * Created by zhuyanan on 17/8/18.
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println(String.format("spite vote,cancel your vote,%s!", user));

        voteManager.getVoteMap().remove(user);

    }
}
