package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 * after jdk 1.5 thread safe
 */
public class DoubleCheckSingleton extends AbstractSingleton {

    private DoubleCheckSingleton() {

    }

    private volatile static DoubleCheckSingleton instance = null;

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }

}
