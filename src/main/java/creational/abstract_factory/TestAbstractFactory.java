package creational.abstract_factory;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {

        AbstractFactory animalsFactory = new AnimalsFactory();
        AbstractFactory fishFactory = new FishFactory();
        AbstractFactory humanFactory = new HumanFactory();


        Animal cat = animalsFactory.produce("cat");
        Animal fish = fishFactory.produce("fish");
        Animal human = humanFactory.produce("human");


        cat.hello();
        fish.speak();
        human.hello();

    }
}
