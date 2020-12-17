import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class AnimalsRegistration {

        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Dzīvnieku reģistrs");
            System.out.println("Dzīvnieka vārds: ");
            String name = scan.nextLine();
            String[] type = new String[] {"Suns", "Kaķis", "Cits"};
            System.out.println("Dzīvnieka tips:");
            for (byte i = 0; i < type.length; i ++) {
                System.out.println(i + 1 + " - " + type[i]);
            }
            System.out.print("Ievadiet atbilstošo numuru: ");
            byte t = scan.nextByte();
            System.out.println("Dzīvnieka vecums: ");
            int age = scan.nextInt();
            String[] size = new String[] {"Liels", "Vidējs", "Mazs"};
            System.out.println("Dzīvnieka lielums:");
            for (byte i = 0; i < size.length; i ++) {
                System.out.println(i + 1 + " - " + size[i]);
            }
            System.out.print("Ievadiet atbilstošo numuru: ");
            byte s = scan.nextByte();
            System.out.println("Pavadītais laiks patversmē (nedēļas): ");
            int timeInShelter = scan.nextInt();
            String[] assignedShelter = new String[] {"Ulubele", "Dzīvnieku Draugs", "Labās Mājas"};
            System.out.println("Patversme:");
            for (byte i = 0; i < assignedShelter.length; i ++) {
                System.out.println(i + 1 + " - " + assignedShelter[i]);
            }
            System.out.print("Ievadiet atbilstošo numuru: ");
            byte a = scan.nextByte();
            System.out.println("Īpašas vajadzības: ");
            boolean needsSpecialTreatment = scan.nextBoolean();
            System.out.println("Adoptēts: ");
            boolean isAdopted = scan.nextBoolean();
            System.out.println("Piemērots brīvprātīgajiem: ");
            boolean isWalkable = scan.nextBoolean();
            Random id_animal = new Random();
            int id = id_animal.nextInt();


            String DzīvniekuReģistrs = "Dzīvnieku_reģistrs";
            try (FileWriter fileWriter = new FileWriter("Dzīvnieku_reģistrs.txt", true)) {
                PrintWriter writeIntoFile = new PrintWriter(fileWriter);
                writeIntoFile.printf("%s %s %s %s %s %s %s %s %s %s \n", name, type[t - 1], age, size[s - 1], timeInShelter, assignedShelter[a - 1], needsSpecialTreatment, isAdopted, isWalkable, id);
                fileWriter.close();
                System.out.println("Dzīvnieks ir reģistrēts!");
                scan.close();
            }catch (IOException e){
                System.out.println("Savienojums neizdevās!");
            }
        }
    }

