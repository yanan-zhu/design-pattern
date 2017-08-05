package behavior.observer;

/**
 * Created by zhuyanan on 17/8/4.
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
