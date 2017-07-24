package creational.factory.ordinary;


import bean.Animal;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class TestOrdinaryFactory {

    public static void main(String[] args) {


        AnimalsFactory animalsFactory = new AnimalsFactory();

        Animal cat = animalsFactory.produce("cat");
        Animal dog = animalsFactory.produce("dog");


        cat.speak();
        dog.hello();

    }

}
