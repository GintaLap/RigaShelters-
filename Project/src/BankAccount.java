import java.util.ArrayList;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private ArrayList<Expense> expenseList = new ArrayList<>();

    //Array list of Expense (objects of expense class)

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;      // implement REGEX
    }

    public double getBalance() {
        return balance;
    }

    public double deposit (double amount){ // donation or government subsidies
        balance += amount;
        return balance;
    }

    public void newExpense (String purpose, double amount){     // creating an instance of Expense object
        // check if purpose is food/etc, if not then not create expense?
        Expense expense = new Expense(purpose, amount);
        expenseList.add(expense); // adding particular expense to expence list
        balance = balance - amount; // updating balance
        System.out.println("Expense on " + purpose + ": " + amount + " EUR. Remaining balance: " + balance + " EUR. ");
    }
}
