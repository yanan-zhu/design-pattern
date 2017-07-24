package creational.factory.multi_method;

import bean.Animal;
import bean.Cat;
import bean.Dog;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class AnimalsFactory {


    public Animal produceDog() {
        return new Dog();
    }

    public Animal produceCat() {
        return new Cat();
    }

}
