package structure.component.better_type;

/**
 * Created by zhuyanan on 17/7/26.
 */
public class Leaf extends Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void printStruct(String preStr) {
        System.out.println(preStr + "-" + name);
    }
}
