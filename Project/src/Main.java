import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BankAccount ulubeleAccount = new BankAccount("LV97HABA0551028353893", 2000.0);
        BankAccount labasMajasAccount = new BankAccount("LV95HABA0551003865018", 1000.0);
        BankAccount dzivniekuDraugsAccount = new BankAccount("LV71HABA0551039535066", 500.0);

        ulubeleAccount.deposit(10.5);
        System.out.println(ulubeleAccount.getBalance());
        ulubeleAccount.deposit(200);
        System.out.println(ulubeleAccount.getBalance());

        ulubeleAccount.newExpense("Food", 200);
        ulubeleAccount.newExpense("Electricity", 10.5);

        Shelters ulubele = new Shelters("Ulubele", "Ozolaine", 20203333, "ulubele@ulubele.org", 200, 87, "LV97HABA0551028353893");
        Shelters dzīvniekuDraugs = new Shelters("Dzīvnieku Draugs", "Fridriha Candera iela 4", 67500491
                , "DZD@LATNET.LV", 150, 100, "LV71HABA0551039535066");
        Shelters labāsMājas = new Shelters("Labās Mājas", "Mežapurva iela 2", 26617636, "info@patversme.lv", 110, 100, "LV95HABA0551003865018");

        try {
            List<String> strings = Files.readAllLines(Paths.get("Dzīvnieku_reģistrs.txt"));
            List<Animal> animals = new ArrayList<>();
            for (String line : strings) {
                String[] split = line.split(",");
                String types = split[0];
                String name = split[1];
                float age = Integer.parseInt(split[2]);
                String size = split[3];
                int timeInShelter = Integer.parseInt(split[4]);
                String assignedShelter = split[5];
                boolean needsSpecialTreatment = Boolean.parseBoolean(split[6]);
                boolean isAdopted = Boolean.parseBoolean(split[7]);
                boolean isWalkable = Boolean.parseBoolean(split[8]);
                int id = Integer.parseInt(split[9]);

                System.out.println(name + " " + age);
            }

        }catch(Exception e){
            System.out.println("Connection failed!");
        }
    }
}




