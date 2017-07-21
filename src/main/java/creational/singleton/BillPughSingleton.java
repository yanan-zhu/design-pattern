package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class BillPughSingleton extends AbstractSingleton {

    private BillPughSingleton() {

    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

}
