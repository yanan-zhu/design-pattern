package bean;

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

    @Override
    public void speak(String sth) {
        System.out.println(this.getClass().getName() + " speak:" + sth);
    }
}
