package structure.adapter.class_adapter;

import bean.Cat;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class TestClassAdapter {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.hello();

        TomCat tomCat = new TomCat();
        tomCat.goodbye();
    }
}
