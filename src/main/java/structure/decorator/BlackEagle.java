package structure.decorator;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class BlackEagle implements Animal {


    private Eagle eagle;

    public BlackEagle(Eagle eagle) {
        this.eagle = eagle;
    }

    @Override
    public void speak() {

        this.speak("black black,i love black!");

        eagle.speak();
    }

    @Override
    public void hello() {
        eagle.hello();
    }

    @Override
    public void speak(String sth) {
        eagle.speak(sth);
    }
}
