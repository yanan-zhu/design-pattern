package creational.factory.ordinary;


import creational.factory.bean.Animal;
import creational.factory.bean.Cat;
import creational.factory.bean.Dog;

/**
 * Created by zhuyanan on 17/7/19.
 */
public class AnimalsFactory {

    public Animal produce(String name) {

        if ("cat".equals(name))
            return new Cat();
        else if ("dog".equals(name))
            return new Dog();
        else
            return null;

    }


}
