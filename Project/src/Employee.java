import java.io.*;
import java.util.Scanner;

public class Employee extends Person{

    private String position;
    private String bankAccountDetails;
    private double salary;
    public static int employeeCountU = 0;
    public static int employeeCountUDD = 0;
    public static int employeeCountLM = 0;

    public Employee(String personName, String personSurname, String phoneNumber, String bankAccountDetails, String position) {
        super(personName, personSurname, phoneNumber);
        this.bankAccountDetails = bankAccountDetails;
        this.position = position;
        if (position.equalsIgnoreCase("manager")){
            this.salary = 1500;
        }
        else if (position.equalsIgnoreCase("worker")){
            this.salary = 1000;
        }
        else
            this.salary = 800;

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

        String[] jobPosition = new String[]{"worker", "manager", "cleaner"};
        System.out.println("Job position:");
        for (byte i = 0; i < jobPosition.length; i++) {
            System.out.println(i + 1 + " - " + jobPosition[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte j = scan.nextByte();
        while (j <= 0 || j > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            j = scan.nextByte();
        }

        String[] employeeAssignedShelter = new String[]{"Ulubele", "Dzīvnieku_Draugs", "Labās_Mājas"};
        System.out.println("Please choose assigned Shelter:");
        for (byte i = 0; i < employeeAssignedShelter.length; i++) {
            System.out.println(i + 1 + " - " + employeeAssignedShelter[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte s = scan.nextByte();
        while (s <= 0 || s > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            s = scan.nextByte();
        }
        System.out.println("Employee's phone number: ");
        int phoneNumber = scan.nextInt();

        try (FileWriter fileWriter = new FileWriter("Employee_Registration", true)) {
            PrintWriter writeIntoFile = new PrintWriter(fileWriter);
            writeIntoFile.printf("%s %s %s %s %s %s\n", personName, personSurname, phoneNumber, bankAccountDetails, employeeAssignedShelter[s - 1], jobPosition [j - 1]);
            fileWriter.close();
            System.out.println("Employee " + personName + " " + personSurname + " is registered!");
        } catch (IOException e) {
            System.out.println("Connection failed!");
        }
    }
    public  static void countEmployees () {
        try {
            File myObj = new File("Employee_Registration");
            Scanner employeeReader = new Scanner(myObj);
            while (employeeReader.hasNextLine()) {
                String employeeData = employeeReader.nextLine();
                String[] employeeFields = employeeData.split(" ");
                if (employeeFields [4].equals("Ulubele"))
                    employeeCountU++;
                if (employeeFields [4].equals("Dzīvnieku_Draugs"))
                    employeeCountUDD++;
                if (employeeFields[4].equals("Labās_Mājas"))
                    employeeCountLM++;
            }
            employeeReader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public double paySalary(BankAccount shelterAccount){
        double balance = shelterAccount.getBalance();
         balance -= this.salary;
        System.out.println("Salary for " + super.getPersonName() + " " + super.getPersonSurname() + " : " + this.salary +
                " . Remaining balance: " + balance + " EUR. ");
        shelterAccount.addExpense("salary",this.salary );
        return balance;
    }
}

