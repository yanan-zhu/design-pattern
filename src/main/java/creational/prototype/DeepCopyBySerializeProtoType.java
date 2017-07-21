package creational.prototype;

import java.io.*;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class DeepCopyBySerializeProtoType implements Serializable {
    private String id;

    private Prototype prototype;

    public Object deepClone() {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
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
