package Comp1112.SecondComp1112Project;

public class SavingsAccount extends Account {

    private double InterestRate;
    private String accountStatus;

    public SavingsAccount(String accountNumber, double balance, Customer owner, double InterestRate, String accountStatus, String password) {
        super(accountNumber, balance, owner, password);
        this.InterestRate = InterestRate;
        this.accountStatus = accountStatus;
    }

    public SavingsAccount() {

    }

    public double getInterestRate() {
        return InterestRate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setaccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    @Override
    public String toString() {
        return super.toString() + "Interest Rate: " + InterestRate + "\nAccount Status: " + accountStatus;
    }
}
