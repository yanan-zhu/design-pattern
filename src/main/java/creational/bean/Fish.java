package creational.bean;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class Fish implements Animal {
    @Override
    public void speak() {
        System.out.println("my name is fish!");
    }

    @Override
    public void hello() {
        System.out.println("hello,it's fish please!");
    }
}
