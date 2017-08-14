package behavior.memento.better_one;

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
        return new Memento(state);
    }

    public void restoreMemento(MementoInterface memento) {
        this.state = memento.getState();
    }


    private class Memento implements MementoInterface {

        private String state;


        public Memento(String state) {
            this.state = state;
        }


        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }


}
