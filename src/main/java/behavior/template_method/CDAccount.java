package behavior.template_method;

/**
 * Created by zhuyanan on 17/8/4.
 */
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.05;
    }
}
