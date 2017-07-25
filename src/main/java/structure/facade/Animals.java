package structure.facade;

import bean.Cat;
import bean.Dog;
import bean.Fish;
import bean.Human;

/**
 * Created by zhuyanan on 17/7/25.
 */
public class Animals {

    private Cat cat;

    private Dog dog;

    private Fish fish;

    private Human human;

    public Animals() {

        cat = new Cat();
        dog = new Dog();
        fish = new Fish();
        human = new Human();
    }

    public void speak() {
        cat.speak();
        dog.speak();
        fish.speak();
        human.speak();
    }

    public void hello() {

        cat.hello();
        dog.hello();
        fish.hello();
        human.hello();
    }

}
