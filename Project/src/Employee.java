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

