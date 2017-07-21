package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 * thread unsafe
 */
public class LazyInitializedSingleton extends AbstractSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {

        if (instance == null)
            instance = new LazyInitializedSingleton();

        return instance;
    }
}
