package structure.proxy;

import bean.Animal;
import bean.Dog;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class TestProxy {
    public static void main(String[] args) {


        testStaticProxy();

        testDynamicProxy();

    }


    public static void testStaticProxy() {

        System.out.println("testStaticProxy start:");

        AnimalProxy proxy = new AnimalProxy(new Dog());


        proxy.speak();

        proxy.hello();
        System.out.println("testStaticProxy end");

    }

    public static void testDynamicProxy() {
        System.out.println("testDynamicProxy start:");


        AnimalProxyInvocationHandler handler = new AnimalProxyInvocationHandler(new Dog());


        Animal animalProxy = (Animal) handler.getProxy();

        animalProxy.hello();

        animalProxy.speak();


        System.out.println("testDynamicProxy end");
    }
}
