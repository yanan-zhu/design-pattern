package behavior.memento;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Originator {

    private String state;


    public Memento createMemento() {

        return new Memento(state);

    }

    public void restoreMemento(Memento memento) {

        this.state = memento.getState();

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
