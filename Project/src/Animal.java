import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Animal.AnimalsRegistration();
    }
    private String type;
    private String name;
    private float age;
    private String size;
    private int timeInShelter;
    private String assignedShelter;
    private boolean needsSpecialTreatment;
    private int id;
    private boolean isAdopted;
    private boolean isWalkable;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getTimeInShelter() {
        return timeInShelter;
    }

    public void setTimeInShelter(int timeInShelter) {
        this.timeInShelter = timeInShelter;
    }

    public String getAssignedShelter() {
        return assignedShelter;
    }

    public void setAssignedShelter(String assignedShelter) {
        this.assignedShelter = assignedShelter;
    }

    public boolean isNeedsSpecialTreatment() {
        return needsSpecialTreatment;
    }

    public void setNeedsSpecialTreatment(boolean needsSpecialTreatment) {
        this.needsSpecialTreatment = needsSpecialTreatment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    public boolean isWalkable() {
        return isWalkable;
    }

    public void setWalkable(boolean walkable) {
        isWalkable = walkable;
    }

    public Animal(String type, String name, float age, String size, int timeInShelter, String assignedShelter, boolean needsSpecialTreatment, int id, boolean isAdopted, boolean isWalkable) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.size = size;
        this.timeInShelter = timeInShelter;
        this.assignedShelter = assignedShelter;
        this.needsSpecialTreatment = needsSpecialTreatment;
        this.id = id;
        this.isAdopted = isAdopted;
        this.isWalkable = isWalkable;
    }

    public static void AnimalsRegistration () {

            Scanner scan = new Scanner(System.in);
            System.out.println("Dzīvnieku reģistrs");
            System.out.println("Dzīvnieka vārds: ");
            String name = scan.nextLine();
            String[] type = new String[] {"Suns", "Kaķis"};
            System.out.println("Dzīvnieka tips:");
            for (byte i = 0; i < type.length; i ++) {
                System.out.println(i + 1 + " - " + type[i]);
            }
            System.out.print("Ievadiet atbilstošo numuru (1 vai 2): ");
            byte t = scan.nextByte();
            while (t != 2 && t != 1){
            System.out.print("Neatbilstošs numurs. Ievadiet atbilstošo numuru (1 vai 2): ");
            t = scan.nextByte();
                    }
            System.out.println("Dzīvnieka vecums (pilnos gados): ");
            int age = scan.nextInt();
            while (age<0 || age>30){
                System.out.println("Neatbilstošs vecums. Ievadiet Dzīvnieka vecumu (pilnos gados)");
                age = scan.nextInt();
            }
            String[] size = new String[] {"Liels", "Vidējs", "Mazs"};
            System.out.println("Dzīvnieka lielums:");
            for (byte i = 0; i < size.length; i ++) {
                System.out.println(i + 1 + " - " + size[i]);
            }
            System.out.print("Ievadiet atbilstošo numuru: ");
            byte s = scan.nextByte();
        while (s<=0 || s>3){
            System.out.print("Neatbilstošs numurs. Ievadiet atbilstošo numuru (1-3): ");
            s = scan.nextByte();
        }
            System.out.println("Pavadītais laiks patversmē (pilnas nedēļas): ");
            int timeInShelter = scan.nextInt();
        while (age<0){
            System.out.println("Neatbilstošs laiks. Pavadītais laiks patversmē (pilnas nedēļas)");
            age = scan.nextInt();
        }
            String[] assignedShelter = new String[] {"Ulubele", "Dzīvnieku_Draugs", "Labās_Mājas"};
            System.out.println("Patversme:");
            for (byte i = 0; i < assignedShelter.length; i ++) {
                System.out.println(i + 1 + " - " + assignedShelter[i]);
            }
            System.out.print("Ievadiet atbilstošo numuru: ");
            byte a = scan.nextByte();
        while (a<=0 || a>3){
            System.out.print("Neatbilstošs numurs. Ievadiet atbilstošo numuru (1-3): ");
            a = scan.nextByte();
        }
            System.out.println("Īpašas vajadzības(True/False): ");
            boolean needsSpecialTreatment = scan.nextBoolean();
            System.out.println("Adoptēts (True/False): ");
            boolean isAdopted = scan.nextBoolean();
            System.out.println("Piemērots brīvprātīgajiem(True/False): ");
            boolean isWalkable = scan.nextBoolean();
            Random id_animal = new Random();
            int id = id_animal.nextInt(10000);


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

