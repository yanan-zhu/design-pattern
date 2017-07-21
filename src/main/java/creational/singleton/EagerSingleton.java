package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 * <p>
 * thread safe
 */
public class EagerSingleton extends AbstractSingleton {

    private EagerSingleton() {

    }

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }

}
