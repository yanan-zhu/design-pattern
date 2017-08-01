package behavior.strategy;

/**
 * Created by zhuyanan on 17/8/1.
 */
public class TestStrategy {
    public static void main(String[] args) {

        Strategy add = new Add();
        Strategy divide = new Divide();
        Strategy multiply = new Multiply();
        Strategy subtract = new Subtract();


        Context context = new Context(divide);

        context.calculate(1, 2);


    }
}
