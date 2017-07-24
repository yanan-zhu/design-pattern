package structure.decorator;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class Eagle implements Animal {

    private Bird bird;

    public Eagle(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void speak() {

        this.speak("my name is Eagle!");

        bird.speak();

        this.speak("hello everyone!");

    }

    @Override
    public void hello() {
        bird.hello();
    }

    @Override
    public void speak(String sth) {
        bird.speak(sth);
    }
}
