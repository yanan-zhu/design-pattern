package behavior.state;

/**
 * Created by zhuyanan on 17/8/15.
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(String param) {
        System.out.println("ConcreteStateB handle:" + param);
    }
}
