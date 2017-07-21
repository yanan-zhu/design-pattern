package creational.prototype;

import java.io.Serializable;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class Prototype implements Cloneable, Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                '}';
    }
}
