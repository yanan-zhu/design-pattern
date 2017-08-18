package behavior.state;

/**
 * Created by zhuyanan on 17/8/15.
 */
public class TestState {

    public static void main(String[] args) {

        Context context=new Context();

        State stateA=new ConcreteStateA();
        context.setState(stateA);
        context.request("A");

        State stateB=new ConcreteStateB();
        context.setState(stateB);
        context.request("B");




    }

}
