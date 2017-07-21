package creational.prototype;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class DeepCopyPrototype implements Cloneable {

    private String id;

    private Prototype prototype;

    public Object clone() {

        DeepCopyPrototype deepCopyPrototype;

        try {

            deepCopyPrototype = (DeepCopyPrototype) super.clone();

            deepCopyPrototype.prototype = (Prototype) this.prototype.clone();

            return deepCopyPrototype;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Prototype getPrototype() {
        return prototype;
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    @Override
    public String toString() {
        return "DeepCopyPrototype{" +
                "id='" + id + '\'' +
                ", prototype=" + prototype +
                '}';
    }
}
