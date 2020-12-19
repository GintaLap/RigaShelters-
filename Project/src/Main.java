public class Main {
    public static void main(String[] args) {

        Shelters ulubele = new Shelters("Ulubele", "Ozolaine", 20203333, "ulubele@ulubele.org", 200,"LV97HABA0551028353893",1 );
        Shelters dzīvniekuDraugs = new Shelters("Dzīvnieku Draugs", "Fridriha Candera iela 4", 67500491
                , "DZD@LATNET.LV", 150,"LV71HABA0551039535066", 2);
        Shelters labāsMājas = new Shelters("Labās Mājas", "Mežapurva iela 2", 26617636, "info@patversme.lv", 110, "LV95HABA0551003865018", 3);

        BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893", 10000.0);
        BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018", 9000.0);
        BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066", 5000.0);

        System.out.println("Initial balance test: " + ulubeleAccount.getBalance());

        System.out.println();

        Employee employee1 = new Employee("Janis", "Roze", "200000000", "LV97HABA0505728564893","manager");
        employee1.paySalary(ulubeleAccount);
        System.out.println("Balance test: " + ulubeleAccount.getBalance());

        System.out.println();

        Volunteer volunteer1 = new Volunteer("Arturs","Berzins","20202020");
        System.out.println("Volunteers1 ID: " + volunteer1.getId());
        Volunteer volunteer2 = new Volunteer ("Antonio", "Banderas", "28833445");
        System.out.println("Volunteers2 ID: " + volunteer2.getId());

        System.out.println();

        dzīvniekuDraugs.getShelterDetails();
        ulubele.getShelterDetails();
        labāsMājas.getShelterDetails();

        System.out.println();

        ulubeleAccount.deposit(10.5);
        System.out.println(ulubeleAccount.getBalance());
        ulubeleAccount.deposit(200);
        System.out.println(ulubeleAccount.getBalance());
        labasMajasAccount.deposit(500);

        ulubeleAccount.addExpense("Food", 200);
        ulubeleAccount.addExpense("Electricity", 10.5);

        System.out.println();

        FoodExpense foodExpenseOneMonth = new FoodExpense();
        foodExpenseOneMonth.read();
        System.out.println("Monthly expenses on dogs' food in Ulubele: " + foodExpenseOneMonth.foodExpenseDogsUlubele() +  " EUR. ");
        System.out.println("Monthly expenses on cats' food in Ulubele: " + foodExpenseOneMonth.foodExpenseCatsUlubele() + " EUR. ");
        System.out.println("Total monthly expenses on animals' food in Ulubele: " + foodExpenseOneMonth.foodExpenseTotalUlubele() + " EUR. ");

        System.out.println("Monthly expenses on dogs' food in Dzīvnieku Draugs: " + foodExpenseOneMonth.foodExpenseDogsDzivniekuDraugs()+  " EUR. ");
        System.out.println("Monthly expenses on cats' food in Dzīvnieku Draugs: " + foodExpenseOneMonth.foodExpenseCatsDzivniekuDraugs() + " EUR. ");
        System.out.println("Total monthly expenses on animals' food in Dzīvnieku Draugs: " + foodExpenseOneMonth.foodExpenseTotalDzivniekuDraugs() + " EUR. ");

        System.out.println("Monthly expenses on dogs' food in Labās Mājas: " + foodExpenseOneMonth.foodExpenseDogsLabasMajas()+  " EUR. ");
        System.out.println("Monthly expenses on cats' food in Labās Mājas: " + foodExpenseOneMonth.foodExpenseCatsLabasMajas() + " EUR. ");
        System.out.println("Total monthly expenses on animals' food in Labās Mājas: " + foodExpenseOneMonth.foodExpenseTotalLabasMajas() + " EUR. ");

        FoodExpense currentFoodExpenses = new FoodExpense();

        System.out.println();

        System.out.println("Current animal count in Ulubele: "+ AnimalsCount.currentAnimalCountU);
        System.out.println("Current animal count in Dzīvnieku Draugs: "+ AnimalsCount.currentAnimalCountDD);
        System.out.println("Current animal count in Labās Mājas: "+AnimalsCount.currentAnimalCountLM);

        System.out.println();

        System.out.println("Dogs for walking in Ulubele "+ AnimalsCount.dogsForVolunteersU);
        System.out.println("Dogs for walking in Dzīvnieku Draugs "+ AnimalsCount.dogsForVolunteersDD);
        System.out.println("Dogs for walking in Labās Mājas "+ AnimalsCount.dogsForVolunteersLM);

        System.out.println("Cats for petting in Ulubele "+ AnimalsCount.catsForVolunteersU);
        System.out.println("Cats for petting in Dzīvnieku Draugs "+ AnimalsCount.catsForVolunteersDD);
        System.out.println("Cats for petting in Labās Mājas "+ AnimalsCount.catsForVolunteersLM);

        System.out.println("Animals entered all shelters: "+ AnimalsCount.totalAnimalsInShelters +   ". Animals adopted : " + AnimalsCount.totalAdoptedAnimals);















    }
}




