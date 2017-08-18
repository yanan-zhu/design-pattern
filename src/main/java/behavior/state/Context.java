package behavior.state;

/**
 * Created by zhuyanan on 17/8/15.
 */
public class Context {


    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void request(String param) {
        state.handle(param);
    }

}
