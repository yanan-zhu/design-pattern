package behavior.chain_of_responsibility;

/**
 * Created by zhuyanan on 17/8/12.
 */
public class TestChainOfResponsibility {

    public static void main(String[] args) {


        Handler handler1=new ConcreteHandler();
        Handler handler2=new ConcreteHandler();
        Handler handler3=new ConcreteHandler();


        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);
        handler3.setSuccessor(handler1);

        handler1.handleRequest();



    }

}
