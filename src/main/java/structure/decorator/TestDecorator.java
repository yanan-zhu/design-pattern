package structure.decorator;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class TestDecorator {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Eagle eagle = new Eagle(bird);

        BlackEagle blackEagle = new BlackEagle(eagle);
        WhiteEagle whiteEagle = new WhiteEagle(eagle);

        System.out.println("bird speak start:");
        bird.speak();

        System.out.println("eagle speak start:");

        eagle.speak();

        System.out.println("whiteEagle speak start:");

        whiteEagle.speak();

        System.out.println("blackEagle speak start:");

        blackEagle.speak();

    }
}
