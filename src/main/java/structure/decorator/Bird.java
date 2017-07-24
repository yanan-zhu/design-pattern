package structure.decorator;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class Bird implements Animal {

    @Override
    public void speak() {
        this.speak("my name is bird!");
    }

    @Override
    public void hello() {
        this.speak("hello,it is bird please!");
    }

    @Override
    public void speak(String sth) {
        System.out.println(this.getClass().getName() + " speak:" + sth);
    }
}
