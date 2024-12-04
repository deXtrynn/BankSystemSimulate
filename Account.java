package Comp1112.SecondComp1112Project;

import java.util.Date;
import java.util.Random;

public abstract class Account {

    Transaction a = new Transaction();
    protected String accountNumber;
    protected double balance;
    protected Customer owner;
    protected String password;
    protected int indexAccount;

    public Account(String accountNumber, double balance, Customer owner, String password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
        this.password = password;
    }
// İçinde parametre olan accountu çekemiyoruz içine yazmak gerekiyor o yüzden classı içi boş account oluşturarak bu yöntemle çekebiliyoruz.
    public Account() {

    }

    public boolean correctPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public Customer getOwner() {
        return this.owner;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double setbalance(double balance) {
        this.balance = balance;
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static String accountNum() {
        Random rnd = new Random();
        int num = rnd.nextInt(1000000000);
        return "" + num;
    }

    public void transfer(Account recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;

            Transaction transaction = new Transaction(a.generateTransactionID(), amount, new Date(), "Transfer to " + recipient.getAccountNumber());
            a.transactionHistory.add(transaction);
            System.out.println("");
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            Transaction depositTransaction = new Transaction(a.generateTransactionID(), amount, new Date(), "Deposit");
            a.transactionHistory.add(depositTransaction);
            System.out.println("Deposited " + amount + " into " + this.accountNumber + ". New balance: " + this.balance + "");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            this.balance -= amount;
            Transaction withdrawTransaction = new Transaction(a.generateTransactionID(), amount, new Date(), "Withdraw");
            a.transactionHistory.add(withdrawTransaction);
            System.out.println("Withdraw " + amount + " from " + this.accountNumber + ". Remaining balance: " + this.balance + "");
            System.out.println("");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void printTransactions() {

        for (int i = 0; i < a.transactionHistory.size(); i++) {
            System.out.println("[" + (i + 4) + "] " + a.transactionHistory.get(i) + "\n");
        }

    }

    @Override
    public String toString() {
        return owner + "\n" + "Account Number: " + accountNumber + "\nBalance: " + balance + "\n";
    }
}

interface Transactionable {

    void deposit(double amount);

    void withdraw(double amount);

    void transfer(Account recipient, double amount);
}
