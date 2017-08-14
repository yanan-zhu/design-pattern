package behavior.memento;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Caretaker {

    private Memento memento;

    public Memento retrieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

}
