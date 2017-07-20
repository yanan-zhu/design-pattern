package creational.factory.static_method;

import creational.factory.bean.Animal;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class TestStaticMethodFactory {

    public static void main(String[] args) {

        Animal dog = AnimalsFactory.produceDog();
        Animal cat = AnimalsFactory.produceCat();

        dog.hello();
        cat.speak();

    }
}
