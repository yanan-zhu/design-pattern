package behavior.memento.better_one;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class TestMemento {

    public static void main(String[] args) {


        Originator originator = new Originator();
        originator.setState("start!");


        MementoInterface memento = originator.createMemento();

        System.out.println(originator.getState());

        originator.setState("stop");
        System.out.println(originator.getState());

        originator.restoreMemento(memento);
        System.out.println(originator.getState());


    }

}
