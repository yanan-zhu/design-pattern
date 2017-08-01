package behavior.strategy;

/**
 * Created by zhuyanan on 17/8/1.
 */
public class Multiply implements Strategy {
    @Override
    public int calculate(int x, int y) {
        return x * y;
    }
}
