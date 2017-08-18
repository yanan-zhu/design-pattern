package behavior.state.example;

/**
 * Created by zhuyanan on 17/8/18.
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println(String.format("don't repeat vote,%s!", user));

        voteManager.getVoteMap().remove(user);
        voteManager.getVoteMap().put(user, voteItem);


    }
}
