package creational.prototype;

/**
 * Created by zhuyanan on 17/7/21.
 */
public class TestPrototype {

    public static void main(String[] args) {


        testPrototype();
        testSimpleCopyPrototype();
        testDeepCopyPrototype();
        testDeepCopyBySerializePrototype();

    }


    private static void testPrototype() {

        System.out.println("+++++++++++++++++++++++++testPrototype start+++++++++++++++++++++++++");

        Prototype based = new Prototype();
        based.setName("lily");

        Prototype cloned = (Prototype) based.clone();

        System.out.println("based:" + based);

        System.out.println("cloned:" + cloned);

        System.out.println("+++++++++++++++++++++++++testPrototype end+++++++++++++++++++++++++");

    }

    private static void testSimpleCopyPrototype() {
        System.out.println("+++++++++++++++++++++++++testSimpleCopyPrototype start+++++++++++++++++++++++++");

        Prototype prototype = new Prototype();
        prototype.setName("lily");

        SimpleCopyProtoType based = new SimpleCopyProtoType();

        based.setId("11");
        based.setPrototype(prototype);

        SimpleCopyProtoType cloned = (SimpleCopyProtoType) based.clone();

        System.out.println("based first:" + based);

        System.out.println("cloned first:" + cloned);


        based.getPrototype().setName("tom");

        System.out.println("based after modify:" + based);

        System.out.println("cloned after modify:" + cloned);

        System.out.println("+++++++++++++++++++++++++testSimpleCopyPrototype end+++++++++++++++++++++++++");

    }

    private static void testDeepCopyPrototype() {
        System.out.println("+++++++++++++++++++++++++testDeepCopyPrototype start+++++++++++++++++++++++++");

        Prototype prototype = new Prototype();
        prototype.setName("lily");

        DeepCopyPrototype based = new DeepCopyPrototype();

        based.setId("11");
        based.setPrototype(prototype);

        DeepCopyPrototype cloned = (DeepCopyPrototype) based.clone();

        System.out.println("based first:" + based);

        System.out.println("cloned first:" + cloned);


        based.getPrototype().setName("tom");

        System.out.println("based after modify:" + based);

        System.out.println("cloned after modify:" + cloned);

        System.out.println("+++++++++++++++++++++++++testDeepCopyPrototype end+++++++++++++++++++++++++");


    }

    private static void testDeepCopyBySerializePrototype() {
        System.out.println("+++++++++++++++++++++++++testDeepCopyBySerializePrototype start+++++++++++++++++++++++++");

        Prototype prototype = new Prototype();
        prototype.setName("lily");

        DeepCopyBySerializeProtoType based = new DeepCopyBySerializeProtoType();

        based.setId("11");
        based.setPrototype(prototype);

        DeepCopyBySerializeProtoType cloned = (DeepCopyBySerializeProtoType) based.deepClone();

        System.out.println("based first:" + based);

        System.out.println("cloned first:" + cloned);


        based.getPrototype().setName("tom");

        System.out.println("based after modify:" + based);

        System.out.println("cloned after modify:" + cloned);

        System.out.println("+++++++++++++++++++++++++testDeepCopyBySerializePrototype end+++++++++++++++++++++++++");


    }
}
