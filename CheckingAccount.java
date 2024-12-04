package Comp1112.SecondComp1112Project;

public class CheckingAccount extends Account {

    private static final double InterestRate = 0.03;
    private boolean debitCard;
    private boolean atmAccess;
    private boolean onlineBankingAccess;

    public CheckingAccount(String accountNumber, double balance, Customer owner, boolean debitCard, boolean atmAccess, boolean onlineBankingAccess, String password) {
        super(accountNumber, balance, owner, password);
        this.debitCard = debitCard;
        this.onlineBankingAccess = onlineBankingAccess;
        this.atmAccess = atmAccess;
    }

    public CheckingAccount() {

    }

    public boolean hasDebitCard() {
        return debitCard;
    }

    public boolean hasAtmAccess() {
        return atmAccess;
    }

    public boolean hasOnlineBankingAccess() {
        return onlineBankingAccess;
    }

    public void setHasdebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public void setAtmAccess(boolean atmAccess) {
        this.atmAccess = atmAccess;
    }

    public void setOnlineBankingAccess(boolean OnlineBankingAccess) {
        this.onlineBankingAccess = OnlineBankingAccess;
    }

    @Override
    public String toString() {
        return super.toString() + "Debit Card: " + debitCard + "\nATM Access: " + atmAccess + "\nOnline Banking: " + onlineBankingAccess;
    }
}
