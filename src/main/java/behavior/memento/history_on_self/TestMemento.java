package behavior.memento.history_on_self;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class TestMemento {

    public static void main(String[] args) {

        Originator originator = new Originator();

        originator.setState("start!");

        System.out.println(originator.getState());

        MementoInterface memento = originator.createMemento();

        originator.setState("stop!");

        System.out.println(originator.getState());


        originator.restoreMemento(memento);

        System.out.println(originator.getState());


    }
}
