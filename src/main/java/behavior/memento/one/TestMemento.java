package behavior.memento.one;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class TestMemento {

    public static void main(String[] args) {


        Originator originator = new Originator();

        originator.setState("start!");

        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(originator.createMemento());


        originator.setState("stop!");

        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.retrieveMemento());

        System.out.println(originator.getState());


    }

}
