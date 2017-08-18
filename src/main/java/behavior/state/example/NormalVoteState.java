package behavior.state.example;

/**
 * Created by zhuyanan on 17/8/15.
 */
public class NormalVoteState implements VoteState {


    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {

        System.out.println(String.format("%s voted to %s!", user, voteItem));

        voteManager.getVoteMap().put(user, voteItem);

    }
}
