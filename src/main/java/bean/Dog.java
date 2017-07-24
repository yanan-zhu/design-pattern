package bean;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("my name is dog!");
    }

    @Override
    public void hello() {
        System.out.println("hello,it's dog please!");
    }

    @Override
    public void speak(String sth) {
        System.out.println(this.getClass().getName() + " speak:" + sth);
    }
}
