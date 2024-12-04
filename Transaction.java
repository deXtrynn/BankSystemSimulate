package Comp1112.SecondComp1112Project;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {

    protected ArrayList<Transaction> transactionHistory = new ArrayList<>();
    private String transactionID;
    private double amount;
    private Date date;
    private String type;

    public Transaction(String transactionID, double amount, Date date, String type) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    public Transaction() {

    }

    public String gettransactionID() {
        return transactionID;
    }

    public double getamount() {
        return amount;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public String generateTransactionID() {
        return "VK" + (int) (Math.random() * 10000000);
    }

    @Override
    public String toString() {
        return "Transaction ID: " + transactionID + " Date: " + date + " Type: " + type + " Amount: " + amount + "";
    }

}
