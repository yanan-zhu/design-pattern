package structure.adapter.object_adapter;

import bean.Cat;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class TestObjectAdapter {
    public static void main(String[] args) {


        Cat cat = new Cat();

        LilyCat lilyCat = new LilyCat(cat);

        lilyCat.goodbye();
        lilyCat.hello();
    }
}
