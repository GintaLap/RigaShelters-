import java.util.Scanner;


public class Main {
    private static Scanner input = new Scanner(System.in);
    private static BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893", 10000.0);
    private static BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018", 9000.0);
    private static BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066", 5000.0);

    public static void main(String[] args) {
        AnimalsCount.countAnimals();
        boolean quit = false;
        int choice;
        while (!quit) {
            printInstructions();
            System.out.println("Please enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    employeeEntry();
                    break;
                case 2:
                    volunteerEntry();
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }

    public static void employeeEntry() {
        boolean quit2 = false;
        int choice2;
        while (!quit2) {
            printInstructionsEmployees();
            System.out.println("Please enter your choice: ");
            choice2 = input.nextInt();
            input.nextLine();

            switch (choice2) {

                case 1:
                    shelterDetails();
                    break;
                case 2:
                    animalRegistration();
                    break;
                case 3:
                    animalsInShelters();
                    break;
                case 4:
                    addExpense();
                    break;
                case 5:
                    shelterExpenses();
                    break;
                case 6:
                    shelterBankAccount();
                    break;
                case 7:
                    animalsForVolunteers();
                    break;
                case 8:
                    employeeRegistration();
                    break;
                case 9:
                    quit2 = true;
                    break;
            }
        }
    }

    public static void volunteerEntry() {
        boolean quit = false;
        int choice;
        while (!quit) {
            printInstructionsVolunteers();
            System.out.println("Please enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    volunteerRegistration();
                    break;
                case 2:
                    makeDonation();
                    break;
                case 3:
                    animalsForVolunteers();
                    break;
                case 4:
                    animalsToAdopt();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void animalRegistration() {
        Animal.AnimalsRegistration();

    }

    public static void employeeRegistration() {
        Employee.employeeRegistration();
    }

    public static void shelterBankAccount() {
        System.out.println("\"Ulubele\" bank account balance: " + ulubeleAccount.getBalance());
        // labasMajasAccount.deposit(500);
        System.out.println("\"Dzīvnieku draugs\" bank account balance: " + dzivniekuDraugsAccount.getBalance());
        System.out.println("\"Labās mājas\" bank account balance: " + labasMajasAccount.getBalance());
    }

    public static void volunteerRegistration() {
        Volunteer.volunteerRegistration();
    }

    public static void makeDonation() {

        System.out.println("Please choose shelter to donate to : ");
        String[] shelterToDonate = new String[]{"Ulubele", "Dzīvnieku_Draugs", "Labās_Mājas"};
        for (byte i = 0; i < shelterToDonate.length; i++) {
            System.out.println(i + 1 + " - " + shelterToDonate[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte d = input.nextByte();
        while (d <= 0 || d > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            d = input.nextByte();
        }
        System.out.println("Please enter amount of donation in EUR: ");
        int donation = input.nextInt();
        if (d == 1)
            ulubeleAccount.deposit(donation);
        if (d == 2)
            dzivniekuDraugsAccount.deposit(donation);
        if (d == 3)
            labasMajasAccount.deposit(donation);
        System.out.println(ulubeleAccount.getBalance());
        System.out.println(labasMajasAccount.getBalance());
        System.out.println(dzivniekuDraugsAccount.getBalance());

    }

    private static void addExpense() {
        FoodExpense foodExpenseOneMonth = new FoodExpense();
        foodExpenseOneMonth.read();
        String purpose;
        double amount;
        System.out.println("Please choose shelter: ");
        String[] shelter = new String[]{"Ulubele", "Dzīvnieku_Draugs", "Labās_Mājas"};
        for (byte i = 0; i < shelter.length; i++) {
            System.out.println(i + 1 + " - " + shelter[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte s = input.nextByte();
        while (s <= 0 || s > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            s = input.nextByte();
        }
        System.out.println("Please specify purpose of expense(food, electricity, salary, medicalTreatment)");
        purpose = input.next();
        if (s == 1 && purpose.equalsIgnoreCase("food")) {
            ulubeleAccount.addExpense("food for all cats and dogs ", foodExpenseOneMonth.foodExpenseTotalUlubele());
        }
        if (s == 2 && purpose.equalsIgnoreCase("food")) {
            dzivniekuDraugsAccount.addExpense("food for all cats and dogs ", foodExpenseOneMonth.foodExpenseTotalDzivniekuDraugs());
        }
        if (s == 3 && purpose.equalsIgnoreCase("food")) {
            labasMajasAccount.addExpense("food for all cats and dogs ", foodExpenseOneMonth.foodExpenseTotalLabasMajas());
        }
        if (!purpose.equalsIgnoreCase("food")) {
            System.out.println("Please specify expense amount in EUR: ");
            amount = input.nextDouble();

            if (s == 1) {
                ulubeleAccount.addExpense(purpose, amount);
                if (purpose.equalsIgnoreCase("food")) {
                    ulubeleAccount.addExpense("food for all cats and dogs ", foodExpenseOneMonth.foodExpenseTotalUlubele());
                }
            }
            if (s == 2) {
                dzivniekuDraugsAccount.addExpense(purpose, amount);
                if (purpose.equalsIgnoreCase("food")) {
                    dzivniekuDraugsAccount.addExpense("food for all cats and dogs ", foodExpenseOneMonth.foodExpenseTotalDzivniekuDraugs());
                }
            }
            if (s == 3) {
                labasMajasAccount.addExpense(purpose, amount);
                if (purpose.equalsIgnoreCase("food")) {
                    ulubeleAccount.addExpense("food for all cats and dogs ", foodExpenseOneMonth.foodExpenseTotalLabasMajas());
                }
            }
        }
    }

    private static void shelterExpenses() {
        FoodExpense foodExpenseOneMonth = new FoodExpense();
        foodExpenseOneMonth.read();
        System.out.println("Please choose expenses of which shelter you would like to see: ");
        String[] shelter = new String[]{"Ulubele", "Dzīvnieku_Draugs", "Labās_Mājas"};
        for (byte i = 0; i < shelter.length; i++) {
            System.out.println(i + 1 + " - " + shelter[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte s = input.nextByte();
        while (s <= 0 || s > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            s = input.nextByte();
        }
        if (s == 1) {
            System.out.println("Expenses of \" Ulubele \" shelter: ");
            ulubeleAccount.showExpenses();
        }
        if (s == 2) {
            System.out.println("Expenses of \" Dzīvnieku draugs \" shelter: ");
            dzivniekuDraugsAccount.showExpenses();
        }
        if (s == 3) {
            System.out.println("Expenses of \" Labās Mājas \" shelter: ");
            labasMajasAccount.showExpenses();
        }

    }

    public static void animalsToAdopt() {
        animalsInShelters();
        System.out.println("For adopting animals, please visit one of the shelters.");

    }

    public static void shelterDetails() {
        Shelters ulubele = new Shelters("Ulubele", "Ozolaine", 20203333, "ulubele@ulubele.org", 200, "LV97HABA0551028353893", 1);
        Shelters dzivniekuDraugs = new Shelters("Dzīvnieku Draugs", "Fridriha Candera iela 4", 67500491
                , "DZD@LATNET.LV", 150, "LV71HABA0551039535066", 2);
        Shelters labasMajas = new Shelters("Labās Mājas", "Mežapurva iela 2", 26617636, "info@patversme.lv", 110, "LV95HABA0551003865018", 3);

        ulubele.getShelterDetails();
        dzivniekuDraugs.getShelterDetails();
        labasMajas.getShelterDetails();
    }

    public static void animalTransfer() {
        if (AnimalsCount.currentAnimalCountU > 200) {
            System.out.println("Ulubele has reached it's max animal capacity. Animal Transfer/Volunteer fostering program needed. ");
        } else if (AnimalsCount.currentAnimalCountDD > 150) {
            System.out.println("Dzīvnieku Draugs has reached it's max animal capacity. Animal Transfer/Volunteer fostering program needed. ");
        } else if (AnimalsCount.currentAnimalCountLM > 110) {
            System.out.println("Labās Mājas has reached it's max animal capacity. Animal Transfer/Volunteer fostering program needed. ");
        }
    }

    public static void animalsInShelters() {
        AnimalsCount.printAnimalStatistic();
        animalTransfer();
    }

    public static void animalsForVolunteers() {
        System.out.println("Dogs for walking in Ulubele: " + AnimalsCount.dogsForVolunteersU);
        System.out.println("Cats for petting in Ulubele: " + AnimalsCount.catsForVolunteersU);
        System.out.println("Dogs for walking in Dzīvnieku Draugs: " + AnimalsCount.dogsForVolunteersDD);
        System.out.println("Cats for petting in Dzīvnieku Draugs: " + AnimalsCount.catsForVolunteersDD);
        System.out.println("Dogs for walking in Labās Mājas: " + AnimalsCount.dogsForVolunteersLM);
        System.out.println("Cats for petting in Labās Mājas: " + AnimalsCount.catsForVolunteersLM);
        System.out.println("Please apply for animal visit by calling certain shelter.");
    }

    private static void printInstructionsEmployees() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To print Shelter details.");
        System.out.println("\t 2 - To assign animals to shelter.");
        System.out.println("\t 3 - To see animal statistics in shelters.");
        System.out.println("\t 4 - To add shelter's expense.");
        System.out.println("\t 5 - To see shelter's expenses.");
        System.out.println("\t 6 - To see shelter bank balance.");
        System.out.println("\t 7 - To see number of available animals for volunteers.");
        System.out.println("\t 8 - To register new employee.");
        System.out.println("\t 9 - To quit the employee mode.");
    }

    private static void printInstructionsVolunteers() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To register for volunteering.");
        System.out.println("\t 2 - To make a donation.");
        System.out.println("\t 3 - To show animals for care/walking.");
        System.out.println("\t 4 - To adopt an animal.");
        System.out.println("\t 5 - To quit the volunteer mode.");
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To enter EMPLOYEE mode.");
        System.out.println("\t 2 - To enter VOLUNTEER mode.");
        System.out.println("\t 3 - To quit the application.");
    }
}
