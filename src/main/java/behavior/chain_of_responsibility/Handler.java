package behavior.chain_of_responsibility;

/**
 * Created by zhuyanan on 17/8/12.
 */
public abstract class Handler {

    private Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
