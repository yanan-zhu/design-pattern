package creational.factory.multi_method;

import creational.factory.bean.Animal;
import creational.factory.bean.Cat;
import creational.factory.bean.Dog;

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
