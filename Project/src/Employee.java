import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Employee extends Person{

    private String position;
    private String bankAccountDetails;
    private double salary;

    public Employee(String personName, String personSurname, String phoneNumber, String bankAccountDetails, String position) {
        super(personName, personSurname, phoneNumber);
        this.bankAccountDetails = bankAccountDetails;
        this.position = position;
        if (position.equalsIgnoreCase("manager")){
            this.salary = 1500;
        }
        else if (position.equalsIgnoreCase("worker")){
            this.salary = 2000;
        }
        else
            this.salary = 1000;

    }
    public static void employeeRegistration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Employee Registration");
        System.out.println("Employee's name: ");
        String personName = scan.nextLine();
        System.out.println("Employee's surname: ");
        String personSurname = scan.nextLine();
        System.out.println("Employee's bank account details: ");
        String bankAccountDetails = scan.nextLine();
        System.out.println("Employee's job position: ");
        String position = scan.nextLine();
        System.out.println("Employee's phone number: ");
        int phoneNumber = scan.nextInt();

        String employeeRegistration = "Employee_Registration";
        try (FileWriter fileWriter = new FileWriter("Employee_Registration", true)) {
            PrintWriter writeIntoFile = new PrintWriter(fileWriter);
            writeIntoFile.printf("%s %s %s %s %s \n", personName, personSurname, phoneNumber, bankAccountDetails, position);
            fileWriter.close();
            System.out.println("Employee is registered!");
        } catch (IOException e) {
            System.out.println("Connection failed!");
        }
    }

    public double paySalary(BankAccount shelterAccount){
        double balance = shelterAccount.getBalance();
         balance -= this.salary;
        System.out.println("Salary for " + super.getPersonName() + " " + super.getPersonSurname() + " : " + this.salary +
                " . Remaining balance: " + balance + " EUR. ");
        // try to add to expense
        shelterAccount.addExpense("salary",this.salary );
        return balance;
    }
}

