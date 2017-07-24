package structure.adapter.object_adapter;

import bean.Cat;
import structure.adapter.TomCatTarget;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class LilyCat implements TomCatTarget {

    private Cat cat;

    public LilyCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void hello() {
        cat.hello();
    }

    @Override
    public void goodbye() {
        System.out.println("lilyCat say: goodbye!");
    }
}
