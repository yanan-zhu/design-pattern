package behavior.strategy;

/**
 * Created by zhuyanan on 17/8/1.
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public void calculate(int x, int y) {

        System.out.println(String.format("calculate:%s %s,result=%s", x, y, strategy.calculate(x, y)));

    }
}
