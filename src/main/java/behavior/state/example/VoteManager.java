package behavior.state.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhuyanan on 17/8/15.
 */
public class VoteManager {

    private VoteState state;

    //<user,voteItem>
    private Map<String, String> voteMap = new HashMap<>();

    //<user,voteCount>
    private Map<String, Integer> voteCountMap = new HashMap<>();


    public Map<String, String> getVoteMap() {
        return voteMap;
    }

    public Map<String, Integer> getVoteCountMap() {
        return voteCountMap;
    }

    public void vote(String user, String voteItem) {

        if (!voteCountMap.containsKey(user)) {
            state = new NormalVoteState();
        } else {

            Integer count = voteCountMap.get(user);

            if (count >= 1 && count < 5)
                state = new RepeatVoteState();
            else if (count >= 5 && count < 8)
                state = new SpiteVoteState();
            else
                state = new BlackVoteState();

        }

        state.vote(user, voteItem, this);

        voteCountIncrease(user);

    }

    private void voteCountIncrease(String user) {

        if (!voteCountMap.containsKey(user))
            voteCountMap.put(user, 1);
        else {
            Integer oldCount = voteCountMap.get(user);

            Integer newCount = ++oldCount;

            voteCountMap.replace(user, newCount);
        }

    }


}
