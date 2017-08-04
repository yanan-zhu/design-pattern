package behavior.template_method;

/**
 * Created by zhuyanan on 17/8/4.
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "moneyMarket";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.03;
    }
}
