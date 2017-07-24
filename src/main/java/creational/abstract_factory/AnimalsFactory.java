package creational.abstract_factory;

import bean.Animal;
import bean.Cat;
import bean.Dog;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class AnimalsFactory implements AbstractFactory {

    @Override
    public Animal produce(String name) {

        if ("cat".equals(name))
            return new Cat();
        else if ("dog".equals(name))
            return new Dog();
        else
            return null;
    }
}
