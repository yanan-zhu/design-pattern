package behavior.memento.better_one;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Caretaker {

    private MementoInterface memento;

    public void saveMemento(MementoInterface memento) {
        this.memento = memento;
    }


}
