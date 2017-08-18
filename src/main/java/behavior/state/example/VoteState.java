package behavior.state.example;

/**
 * Created by zhuyanan on 17/8/15.
 */
public interface VoteState {

    void vote(String user, String voteItem, VoteManager voteManager);

}
