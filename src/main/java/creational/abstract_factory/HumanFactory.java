package creational.abstract_factory;

import bean.Animal;
import bean.Human;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class HumanFactory implements AbstractFactory {
    @Override
    public Animal produce(String name) {
        if ("human".equals(name))
            return new Human();
        else
            return null;
    }
}
