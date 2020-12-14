import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AnimalRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dzīvnieku reģistrs:");
        System.out.println("Dzīvnieka vārds: ");
        String name = scan.next();
        System.out.print("Dzīvnieka tips: ");
        String numurs = scan.next();
        scan.nextLine();
        System.out.print("Lūdzu ievadiet vēlamo vizītes datumu un laiku: ");
        String datumsLaiks = scan.nextLine();
        String[] type = new String[] {"pirmreizēja konsultācija", "procedūra", "atkārtotā vizīte", "kontrole"};
        System.out.println("Lūdzu izvēlieties vizītes mērķi:");
        for (byte i = 0; i < merki.length; i ++) {
            System.out.println(i + 1 + " - " + merki[i]);
        }
        FileWriter myFile = new FileWriter("Dzīvnieku_reģistrs.txt", true);
        PrintWriter writeIntoFile = new PrintWriter(myFile);
        writeIntoFile.printf("%s %s %s %s\n", vards, numurs, datumsLaiks, merki[m-1]);
        myFile.close(); // Aizvert failu
        System.out.println("Paldies! Jūsu pieteikums ir saņemts!");

    }




}
