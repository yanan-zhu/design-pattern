package creational.singleton;

/**
 * Created by zhuyanan on 17/7/21.
 * thread safe
 * best one
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSth() {
        System.out.println("do sth!");
    }

}
