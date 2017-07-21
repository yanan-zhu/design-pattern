package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 * thread safe
 */
public class ThreadSafeSingleton extends AbstractSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public synchronized static ThreadSafeSingleton getInstance() {

        if (instance == null)
            instance = new ThreadSafeSingleton();

        return instance;
    }
}
