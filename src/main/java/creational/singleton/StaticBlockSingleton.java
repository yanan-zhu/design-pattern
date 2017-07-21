package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 * thread safe
 */
public class StaticBlockSingleton extends AbstractSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("StaticBlockSingleton create error!");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

}
