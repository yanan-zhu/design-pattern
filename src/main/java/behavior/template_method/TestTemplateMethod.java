package behavior.template_method;

/**
 * Created by zhuyanan on 17/8/4.
 */
public class TestTemplateMethod {
    public static void main(String[] args) {

        Account cdAccount = new CDAccount();
        System.out.println("CDAccount interestRate:" + cdAccount.calculateInterest());

        Account moneyMarketAccount = new MoneyMarketAccount();
        System.out.println("MoneyMarketAccount interestRate:" + moneyMarketAccount.calculateInterest());


    }
}
