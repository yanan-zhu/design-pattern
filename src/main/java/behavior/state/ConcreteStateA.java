package behavior.state;

/**
 * Created by zhuyanan on 17/8/15.
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(String param) {
        System.out.println("ConcreteStateA handle:" + param);
    }
}
