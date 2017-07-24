package structure.decorator;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class WhiteEagle implements Animal {
    private Eagle eagle;

    public WhiteEagle(Eagle eagle) {
        this.eagle = eagle;
    }

    @Override
    public void speak() {

        this.speak("white white,i love white!");

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
