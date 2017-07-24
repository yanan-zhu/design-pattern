package structure.adapter.class_adapter;

import bean.Cat;
import structure.adapter.TomCatTarget;

/**
 * Created by zhuyanan on 17/7/24.
 */
public class TomCat extends Cat implements TomCatTarget {
    @Override
    public void goodbye() {
        System.out.println("tomCat say: goodbye!");
    }
}
