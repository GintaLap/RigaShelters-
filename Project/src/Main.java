
public class Main {
    public static void main(String[] args) {
        Shelters ulubele = new Shelters("Ulubele", "Ozolaine", 20203333, "ulubele@ulubele.org", 200, 87, "LV97HABA0551028353893");
        Shelters dzīvniekuDraugs = new Shelters("Dzīvnieku Draugs", "Fridriha Candera iela 4", 67500491
                , "DZD@LATNET.LV", 150, 100, "LV71HABA0551039535066");
        Shelters labāsMājas = new Shelters("Labās Mājas", "Mežapurva iela 2", 26617636, "info@patversme.lv", 110, 100, "LV95HABA0551003865018");


        BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893", 2000.0);
        BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018", 1000.0);
        BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066", 500.0);

        ulubeleAccount.deposit(10.5);
        System.out.println(ulubeleAccount.getBalance());
        ulubeleAccount.deposit(200);
        System.out.println(ulubeleAccount.getBalance());

        ulubeleAccount.newExpense("Food", 200);
        ulubeleAccount.newExpense("Electricity", 10.5);



    }
}




