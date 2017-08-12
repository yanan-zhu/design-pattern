package behavior.chain_of_responsibility;

/**
 * Created by zhuyanan on 17/8/12.
 */
public class ConcreteHandler extends Handler {


    @Override
    public void handleRequest() {


        if (getSuccessor() != null) {

            System.out.println("pass request!");

            getSuccessor().handleRequest();

        } else {

            System.out.println("handle!");

        }

    }
}
