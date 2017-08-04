package behavior.template_method;

/**
 * Created by zhuyanan on 17/8/3.
 */
public abstract class Account {

    /**
     * template method
     */
    public final double calculateInterest() {

        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        double rate = doCalculateInterestRate();

        return amount * rate;
    }


    /**
     * hook method
     *
     * @return accountType
     */
    protected abstract String doCalculateAccountType();

    protected abstract double doCalculateInterestRate();

    /**
     * concrete method
     *
     * @param accountType accountType
     * @return amount
     */
    private double calculateAmount(String accountType) {

        return 4835;

    }


}
