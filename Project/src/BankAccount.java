import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private ArrayList<Expense> expenseList = new ArrayList<>();

    //Array list of Expense (objects of expense class)

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) { // donation or government subsidies
        balance += amount;
        return balance;
    }

    public void newExpense(String purpose, double amount) {     // creating an instance of Expense object
        // check if purpose is food/etc, if not then not create expense?
        Expense expense = new Expense(purpose, amount);
        expenseList.add(expense); // adding particular expense to expense list
        balance = balance - amount; // updating balance

        System.out.println(expense.getLocalDateTime() + ". Expense on " + purpose + ": " + amount + " EUR. Remaining balance: " + balance + " EUR. ");
    }

    public void showExpenses() {  // printing out full list of expenses
        System.out.println("Expenses of current selected shelter.");
        for (int i = 0; i < expenseList.size(); i++) {
            Expense expense = expenseList.get(i);
            System.out.println((i + 1) + ". " + expense.getLocalDateTime() + " . Expense on " + expense.getPurpose() + ": " + expense.getAmount() + " EUR.");
        }
    }
    // COMMIT 21.40
}

