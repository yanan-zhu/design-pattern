package creational.factory.multi_method;

import creational.bean.Animal;
import creational.bean.Cat;
import creational.bean.Dog;

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
