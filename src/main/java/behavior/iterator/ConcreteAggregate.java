package behavior.iterator;

/**
 * Created by zhuyanan on 17/8/8.
 */
public class ConcreteAggregate<T> extends Aggregate {

    private Object[] objects = null;

    private int index = 0;
    private int length = 0;
    private int default_length = 100;

    private int mod = 0;

    public ConcreteAggregate(T[] objects) {

        length = objects.length;
        this.objects = new Object[default_length];

        System.arraycopy(objects, 0, this.objects, 0, length);
    }

    @Override
    public Iterator createIterator() {

        return new ConcreteIterator();
    }


    /**
     * Capacity expansion is not considered
     *
     * @param e
     */
    public void add(T e) {
        objects[index++] = e;
        mod++;
    }


    private class ConcreteIterator implements Iterator<T> {

        private int currentMod = mod;

        @Override
        public T next() {

            check();

            if (hasNext()) {
                return (T) objects[index++];
            }

            return null;
        }

        @Override
        public boolean hasNext() {

            check();

            return index < length;
        }

        public void check() {
            if (currentMod != mod)
                throw new IllegalThreadStateException("not support multi-thread");
        }
    }

}
