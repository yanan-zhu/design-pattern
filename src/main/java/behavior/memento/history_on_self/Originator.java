package behavior.memento.history_on_self;

/**
 * Created by zhuyanan on 17/8/14.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MementoInterface createMemento() {
        return new Memento(this);
    }

    public void restoreMemento(MementoInterface memento) {
        this.state = memento.getState();
    }


    private class Memento implements MementoInterface {

        private String state;

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Memento(Originator originator) {
            this.state = originator.getState();
        }
    }
}
