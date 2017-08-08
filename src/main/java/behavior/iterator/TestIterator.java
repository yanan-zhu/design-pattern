package behavior.iterator;

/**
 * Created by zhuyanan on 17/8/8.
 */
public class TestIterator {

    public static void main(String[] args) {

        Object[] objects = new Object[]{"e1", "e2", "e3", "e4", "e5"};

        testCommon(objects);

        testModify(objects);

    }


    public static void testCommon(Object[] objects) {


        ConcreteAggregate<Object> concreteAggregate = new ConcreteAggregate<>(objects);

        Iterator iterator = concreteAggregate.createIterator();


        while (iterator.hasNext()) {
            Object current = iterator.next();
            System.out.println(current.toString());
        }
    }


    public static void testModify(Object[] objects) {

        ConcreteAggregate<Object> concreteAggregate = new ConcreteAggregate<>(objects);

        Iterator iterator = concreteAggregate.createIterator();

        //modify
        concreteAggregate.add("e6");

        while (iterator.hasNext()) {

            Object current = iterator.next();
            System.out.println(current.toString());

        }
    }

}
