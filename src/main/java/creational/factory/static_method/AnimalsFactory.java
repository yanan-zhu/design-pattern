package creational.factory.static_method;

import bean.Animal;
import bean.Cat;
import bean.Dog;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class AnimalsFactory {


    public static Animal produceDog() {
        return new Dog();
    }

    public static Animal produceCat() {
        return new Cat();
    }

}
