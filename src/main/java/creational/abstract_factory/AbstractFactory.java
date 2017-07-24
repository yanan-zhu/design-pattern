package creational.abstract_factory;

import bean.Animal;

/**
 * Created by zhuyanan on 17/7/20.
 */
public interface AbstractFactory {

    Animal produce(String name);

}
