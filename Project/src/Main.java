import java.util.Scanner;


public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        AnimalsCount.countAnimals();
        printInstructions();
        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("Please enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
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
        public static void employeeEntry () {
        printInstructionsEmployees();
            boolean quit2 = false;
            int choice2 = 0;
            while (!quit2) {
                System.out.println("Please enter your choice: ");
                choice2 = input.nextInt();
                input.nextLine();

                switch (choice2) {
                    case 0:
                        printInstructionsEmployees();
                        break;
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
                        shelterExpenses();// need to check if all needed info is in there
                        break;
                    case 5:
                        shelterBankAccount();// need to check if all needed info is in there
                        break;
                    case 6:
                        animalsForVolunteers();
                        break;
                    case 7:
                        employeeRegistration();
                        break;

                    case 8:
                        quit2 = true;
                        break;
                }
            }
        }
        public static void volunteerEntry () {
        printInstructionsVolunteers();
            boolean quit = false;
            int choice = 0;
            while (!quit) {
                System.out.println("Please enter your choice: ");
                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 0:
                        printInstructionsVolunteers();
                        break;
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
                        animalsToAdopt(); // need to make this still

                    case 5:
                        quit = true;
                        break;
                }
            }
        }

        public static void animalRegistration () {
            Animal.AnimalsRegistration();

        }
        public static void employeeRegistration() {
                Employee.employeeRegistration();
        }

        public static void shelterBankAccount () {
            BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893", 10000.0);
            BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018", 9000.0);
            BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066", 5000.0);
            /*ulubeleAccount.deposit(10.5);
            System.out.println( + ulubeleAccount.getBalance());
            ulubeleAccount.deposit(200);*/
            System.out.println("\"Ulubele\" bank account balance: " + ulubeleAccount.getBalance());
           // labasMajasAccount.deposit(500);
            System.out.println("\"Dzīvnieku draugs\" bank account balance: " + dzivniekuDraugsAccount.getBalance());
            System.out.println("\"Labās mājas\" bank account balance: " + labasMajasAccount.getBalance());
        }

        public static void volunteerRegistration () {

            Volunteer.volunteerRegistration();
        }
        public static void makeDonation() {
            System.out.println("Please make donation to following company details: ");
            shelterDetails();
        }


        private static void shelterExpenses () {
            FoodExpense foodExpenseOneMonth = new FoodExpense();
            foodExpenseOneMonth.read();
            System.out.println("Monthly expenses on dogs' food in Ulubele: " + foodExpenseOneMonth.foodExpenseDogsUlubele() + " EUR. ");
            System.out.println("Monthly expenses on cats' food in Ulubele: " + foodExpenseOneMonth.foodExpenseCatsUlubele() + " EUR. ");
            System.out.println("Total monthly expenses on animals' food in Ulubele: " + foodExpenseOneMonth.foodExpenseTotalUlubele() + " EUR. ");

            System.out.println("Monthly expenses on dogs' food in Dzīvnieku Draugs: " + foodExpenseOneMonth.foodExpenseDogsDzivniekuDraugs() + " EUR. ");
            System.out.println("Monthly expenses on cats' food in Dzīvnieku Draugs: " + foodExpenseOneMonth.foodExpenseCatsDzivniekuDraugs() + " EUR. ");
            System.out.println("Total monthly expenses on animals' food in Dzīvnieku Draugs: " + foodExpenseOneMonth.foodExpenseTotalDzivniekuDraugs() + " EUR. ");

            System.out.println("Monthly expenses on dogs' food in Labās Mājas: " + foodExpenseOneMonth.foodExpenseDogsLabasMajas() + " EUR. ");
            System.out.println("Monthly expenses on cats' food in Labās Mājas: " + foodExpenseOneMonth.foodExpenseCatsLabasMajas() + " EUR. ");
            System.out.println("Total monthly expenses on animals' food in Labās Mājas: " + foodExpenseOneMonth.foodExpenseTotalLabasMajas() + " EUR. ");

            FoodExpense currentFoodExpenses = new FoodExpense();

        }
        public static void animalsToAdopt(){
            animalsInShelters(); // how to print result of method, not count again?
            System.out.println("For adopting animals, please visit one of the shelters.");

        }

        public static void shelterDetails () {
            Shelters ulubele = new Shelters("Ulubele", "Ozolaine", 20203333, "ulubele@ulubele.org", 200, "LV97HABA0551028353893", 1);
            Shelters dzivniekuDraugs = new Shelters("Dzīvnieku Draugs", "Fridriha Candera iela 4", 67500491
                    , "DZD@LATNET.LV", 150, "LV71HABA0551039535066", 2);
            Shelters labasMajas = new Shelters("Labās Mājas", "Mežapurva iela 2", 26617636, "info@patversme.lv", 110, "LV95HABA0551003865018", 3);

            ulubele.getShelterDetails();
            dzivniekuDraugs.getShelterDetails();
            labasMajas.getShelterDetails();
        }

        public static void animalTransfer(){
        if (AnimalsCount.currentAnimalCountU > 200){
            System.out.println("Ulubele has reached it's max animal capacity. Animal Transfer/Volunteer fostering program needed. ");
        }else if(AnimalsCount.currentAnimalCountDD > 150){
            System.out.println("Dzīvnieku Draugs has reached it's max animal capacity. Animal Transfer/Volunteer fostering program needed. ");
        }else if (AnimalsCount.currentAnimalCountLM >110){
            System.out.println("Labās Mājas has reached it's max animal capacity. Animal Transfer/Volunteer fostering program needed. ");
            }
        }
        public static void animalsInShelters () {
            AnimalsCount.printAnimalStatistic();
            animalTransfer();
        }

        public static void animalsForVolunteers () {
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
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print Shelter details.");
        System.out.println("\t 2 - To assign animals to shelter.");
        System.out.println("\t 3 - To see animal statistics in shelters.");
        System.out.println("\t 4 - To see expenses for shelters.");
        System.out.println("\t 5 - To see shelter bank balance.");
        System.out.println("\t 6 - To see number of available animals for volunteers.");
        System.out.println("\t 7 - To register new employee.");
        System.out.println("\t 8 - To quit the application. And then press 3.");
    }
    private static void printInstructionsVolunteers() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To register for volunteering.");
        System.out.println("\t 2 - To make a donation.");
        System.out.println("\t 3 - To show animals for care/walking.");
        System.out.println("\t 4 - To adopt an animal.");
        System.out.println("\t 5 - To quit the application.And then press 3.");
    }
        private static void printInstructions () {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - Enter EMPLOYEE entry.");
            System.out.println("\t 2 - Enter VOLUNTEER entry.");
            System.out.println("\t 3 - To quit the application.");
        }
    }
