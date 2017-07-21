package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class TestSingleton {

    public static void main(String[] args) {

        EagerSingleton.getInstance().doSth();

        StaticBlockSingleton.getInstance().doSth();

        LazyInitializedSingleton.getInstance().doSth();

        ThreadSafeSingleton.getInstance().doSth();

        BillPughSingleton.getInstance().doSth();

        DoubleCheckSingleton.getInstance().doSth();

        EnumSingleton.INSTANCE.doSth();

    }

}
