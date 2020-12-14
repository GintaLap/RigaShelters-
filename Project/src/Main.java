public class Main {
    public static void main(String[] args) {
        BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893",2000.0);
        BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018",1000.0);
        BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066",500.0);

        ulubeleAccount.deposit(10.5);
        System.out.println(ulubeleAccount.getBalance());
        ulubeleAccount.deposit(200);
        System.out.println(ulubeleAccount.getBalance());

        ulubeleAccount.newExpense("Food",200);
        ulubeleAccount.newExpense("Electricity", 10.5);


    }
}
