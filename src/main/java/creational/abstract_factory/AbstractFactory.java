package creational.abstract_factory;

import creational.bean.Animal;

/**
 * Created by zhuyanan on 17/7/20.
 */
public interface AbstractFactory {

    Animal produce(String name);

}
