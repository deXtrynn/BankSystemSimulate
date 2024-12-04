package Comp1112.SecondComp1112Project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FinancialPortfolio {

    ArrayList<InstitutionalCustomer> InstitutionalCustomer = new ArrayList<>();
    ArrayList<CheckingAccount> checkingAccounts = new ArrayList<>();
    ArrayList<SavingsAccount> savingsAccountsTL = new ArrayList<>();
    ArrayList<SavingsAccount> savingsAccountsUSD = new ArrayList<>();
    ArrayList<Account> accounts = new ArrayList<>();
    SavingsAccount d = new SavingsAccount();
    Transaction a = new Transaction();
    CheckingAccount c = new CheckingAccount();

    public void addNewAccount() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the name that you want to add: ");
        String nameAccount = scan.nextLine();
        nameAccount = nameAccount.substring(0, 1).toUpperCase() + nameAccount.substring(1).toLowerCase();
        System.out.println("Enter the adress like (061orthTR): ");
        String adress = scan.nextLine();
        System.out.println("Enter the accesible number like (555-011): ");
        String accesableNum = scan.nextLine();
        System.out.println("Enter the gender (Male / Female / Other): ");
        String gender = scan.nextLine();
        gender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
        System.out.println("Enter the occupation: ");
        String occupation = scan.nextLine();
        occupation = occupation.substring(0, 1).toUpperCase() + occupation.substring(1).toLowerCase();
        System.out.println("Create a password for your account:(Password must be exactly 6 digits) ");
        String password = scan.nextLine();
        while (password.length() != 6) {
            System.out.println("Password must be exactly 6 digits. Please try again.");
            password = scan.nextLine();
        }

        IndividualCustomer newAccount = new IndividualCustomer(nameAccount, adress, accesableNum, gender, a.generateTransactionID(), occupation);
        Account accountnew = new Account(Account.accountNum(), accountBalance(), newAccount, password) {
        };
        CheckingAccount newCheckingAccount = new CheckingAccount(Account.accountNum(), accountBalance(), newAccount, c.hasDebitCard(), c.hasAtmAccess(), c.hasOnlineBankingAccess(), password);
        checkingAccounts.add(newCheckingAccount);
        SavingsAccount SavingAccountTL = new SavingsAccount(Account.accountNum(), accountBalance(), newAccount, d.getInterestRate(), d.getAccountStatus(), password);
        SavingsAccount SavingAccountUSD = new SavingsAccount(Account.accountNum(), accountBalance(), newAccount, d.getInterestRate(), d.getAccountStatus(), password);
        savingsAccountsTL.add(SavingAccountTL);
        savingsAccountsUSD.add(SavingAccountUSD);

        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Please re-enter your password to confirm and add your account: ");
            String Password = scan.nextLine();
            if (Password.equals(accountnew.getPassword())) {
                accounts.add(accountnew);
                System.out.println("");
                System.out.println("Account added successfully!\n");
                System.out.println(accountnew);
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
                attempts++;
            }
        }

        if (attempts >= 3) {
            System.out.println("Too many failed attempts. You were denied to add an account");
        }

    }

    public void addInstitutionalCustomer(int index) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the type Of Institution: ");
        String typeInstitution = scn.nextLine();
        System.out.println("Enter the Industry Sector: ");
        String ındustrySector = scn.nextLine();
        System.out.println("Enter the annual Revenue: ");
        double annualRevenue = scn.nextDouble();

        InstitutionalCustomer newInstItutionalCustomer = new InstitutionalCustomer(typeInstitution, ındustrySector, annualRevenue, accounts.get(index).owner.name, accounts.get(index).owner.address, accounts.get(index).owner.accessableNum);
        InstitutionalCustomer.add(newInstItutionalCustomer);
        System.out.println("\nNew InstItutional Customer account created.\n");
    }

    public void printAccountList() {
        System.out.println("List of Accounts:");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + accounts.get(i));
        }
    }

    public void deleteAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number that you want to delete: ");
        int numOfAccount = scan.nextInt();

        accounts.remove(numOfAccount - 1);
        checkingAccounts.remove(numOfAccount - 1);
        savingsAccountsTL.remove(numOfAccount - 1);
        savingsAccountsUSD.remove(numOfAccount - 1);

    }

    public void addFirstAccount(Account account) {
        if (account != null) {
            accounts.add(account);
        }
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public double calculatingTotalValue() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }

    public void printAccounts(ArrayList accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("[" + (i + 1) + "]" + accounts.get(i) + "\n");
        }
    }

    public void printCheckingAccounts() {
        System.out.println("Checking Accounts:");
        for (CheckingAccount account1 : checkingAccounts) {
            System.out.println(account1);
        }
    }

    public static double accountBalance() {
        Random rnd = new Random();
        int num = rnd.nextInt(20000);
        return num;
    }

    public void printAllTransactions() {
        for (Account account : accounts) {
            account.printTransactions();

        }
    }

}
