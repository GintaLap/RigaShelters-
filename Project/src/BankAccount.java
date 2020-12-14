public class BankAccount {

    private String accountNumber;
    private double balance;

    //Array list of Expense (objects of expense class)

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;      // implement REGEX
    }

    public double getBalance() {
        return balance;
    }

    public double depositDonation (double amount){
        balance += amount;
        return balance;
    }

    public double depositGovernmentSubsidy (double amount){
        balance += amount;
        return balance;
    }


}
