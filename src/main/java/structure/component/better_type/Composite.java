package structure.component.better_type;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuyanan on 17/7/26.
 */
public class Composite extends Component {


    private List<Component> childComponents = new ArrayList<>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        childComponents.add(child);
    }

    @Override
    public void removeChild(int index) {
        childComponents.remove(index);
    }

    @Override
    public void printStruct(String preStr) {
        // 先把自己输出
        System.out.println(preStr + "+" + this.name);
        //如果还包含有子组件，那么就输出这些子组件对象
        if (this.childComponents != null) {
            //添加两个空格，表示向后缩进两个空格
            preStr += "  ";
            //输出当前对象的子对象
            for (Component c : childComponents) {
                //递归输出每个子对象
                c.printStruct(preStr);
            }
        }
    }
}
