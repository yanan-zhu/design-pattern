package creational.abstract_factory;

import bean.Animal;
import bean.Fish;

/**
 * Created by zhuyanan on 17/7/20.
 */
public class FishFactory implements AbstractFactory {
    @Override
    public Animal produce(String name) {
        if ("fish".equals(name))
            return new Fish();
        else
            return null;
    }
}
