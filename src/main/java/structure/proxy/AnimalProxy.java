package structure.proxy;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class AnimalProxy implements AnimalProxyInterface {

    private Animal animal;

    public AnimalProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void speak() {

        System.out.println("animalProxy speak start:");

        animal.speak();

        System.out.println("animalProxy speak end");

    }

    @Override
    public void hello() {

        System.out.println("animalProxy hello start:");
        animal.hello();
        System.out.println("animalProxy hello end");
    }
}
