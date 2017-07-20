package creational.factory.bean;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class Cat implements Animal {

    @Override
    public void speak() {
        System.out.println("my name is cat!");
    }

    @Override
    public void hello() {
        System.out.println("hello,it's cat please!");
    }
}
