package creational.factory.multi_method;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class TestMultiMethodFactory {

    public static void main(String[] args) {

        AnimalsFactory animalsFactory = new AnimalsFactory();

        Animal dog = animalsFactory.produceDog();
        Animal cat = animalsFactory.produceCat();

        dog.hello();
        cat.speak();

    }

}
