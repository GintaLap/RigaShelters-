import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shelters ulubele = new Shelters("Ulubele", "Ozolaine", 20203333, "ulubele@ulubele.org", 200, 87, "LV97HABA0551028353893",1 );
        Shelters dzīvniekuDraugs = new Shelters("Dzīvnieku Draugs", "Fridriha Candera iela 4", 67500491
                , "DZD@LATNET.LV", 150, 100, "LV71HABA0551039535066", 1);
        Shelters labāsMājas = new Shelters("Labās Mājas", "Mežapurva iela 2", 26617636, "info@patversme.lv", 110, 100, "LV95HABA0551003865018", 1);

        BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893", 10000.0);
        BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018", 9000.0);
        BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066", 5000.0);

        System.out.println(ulubeleAccount.getBalance());
        Employee employee1 = new Employee("Janis", "Roze", "200000000", "LV97HABA0505728564893","manager");
        employee1.paySalary(ulubeleAccount);
        System.out.println(ulubeleAccount.getBalance());

        Volunteer volunteer1 = new Volunteer("Arturs","Berzins","20202020");
        System.out.println(volunteer1.getId());
        Volunteer volunteer2 = new Volunteer ("Antonio", "Banderas", "28833445");
        System.out.println(volunteer2.getId());

        dzīvniekuDraugs.getShelterDetails();

        ulubeleAccount.deposit(10.5);
        System.out.println(ulubeleAccount.getBalance());
        ulubeleAccount.deposit(200);
        System.out.println(ulubeleAccount.getBalance());
        labasMajasAccount.deposit(500);

        ulubeleAccount.addExpense("Food", 200);
        ulubeleAccount.addExpense("Electricity", 10.5);

        Animal.readFile();












    }
}




