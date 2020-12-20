import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Animal {
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

    public static void AnimalsRegistration() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Animal Registration");
        System.out.println("Animal name: ");
        String name = scan.nextLine();
        String[] type = new String[]{"Dog", "Cat"};
        System.out.println("Animal type:");
        for (byte i = 0; i < type.length; i++) {
            System.out.println(i + 1 + " - " + type[i]);
        }
        System.out.print("Enter number accordingly (1 or 2): ");
        byte t = scan.nextByte();
        while (t != 2 && t != 1) {
            System.out.print("Incorrect entry. Please enter number accordingly (1 or 2): ");
            t = scan.nextByte();
        }
        System.out.println("Animal age (in whole years): ");
        int age = scan.nextInt();
        while (age < 0 || age > 30) {
            System.out.println("Invalid entry. Please enter age of the animal (in whole years): ");
            age = scan.nextInt();
        }
        String[] size = new String[]{"Large", "Medium", "Small"};
        System.out.println("Animal size:");
        for (byte i = 0; i < size.length; i++) {
            System.out.println(i + 1 + " - " + size[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte s = scan.nextByte();
        while (s <= 0 || s > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            s = scan.nextByte();
        }
        System.out.println("Time in shelter (in whole weeks): ");
        int timeInShelter = scan.nextInt();
        while (timeInShelter < 0) {
            System.out.println("Invalid entry. Please enter age of the animal (in whole weeks):");
            timeInShelter = scan.nextInt();
        }
        String[] assignedShelter = new String[]{"Ulubele", "Dzīvnieku_Draugs", "Labās_Mājas"};
        System.out.println("Shelter:");
        for (byte i = 0; i < assignedShelter.length; i++) {
            System.out.println(i + 1 + " - " + assignedShelter[i]);
        }
        System.out.print("Enter number accordingly: ");
        byte a = scan.nextByte();
        while (a <= 0 || a > 3) {
            System.out.print("Incorrect entry. Please enter number accordingly (1-3): ");
            a = scan.nextByte();
        }
        System.out.println("Special needs (True/False): ");
        boolean needsSpecialTreatment = scan.nextBoolean();
        System.out.println("Adopted (True/False): ");
        boolean isAdopted = scan.nextBoolean();
        System.out.println("Appropriate for volunteers (True/False): ");
        boolean isWalkable = scan.nextBoolean();
        Random id_animal = new Random();
        int id = id_animal.nextInt(10000);


        String DzīvniekuReģistrs = "Dzīvnieku_reģistrs";
        try (FileWriter fileWriter = new FileWriter("Dzīvnieku_reģistrs.txt", true)) {
            PrintWriter writeIntoFile = new PrintWriter(fileWriter);
            writeIntoFile.printf("%s %s %s %s %s %s %s %s %s %s \n", name, type[t - 1], age, size[s - 1], timeInShelter, assignedShelter[a - 1], needsSpecialTreatment, isAdopted, isWalkable, id);
            fileWriter.close();
            System.out.println("Animal is registered!");
            scan.close();
        } catch (IOException e) {
            System.out.println("Connection failed!");
        }
    }

    public static void animalStatusChange() {
        Scanner scan = new Scanner(System.in);

        String[] action = new String[]{"Adopted", "Deceased"};
        for (byte i = 0; i < action.length; i++) {
            System.out.println(i + 1 + " - " + action[i]);
        }
        int userInput = scan.nextInt();
        System.out.println("Please choose action: ");
        if (userInput == 1) {
            try {
                File myObj = new File("Dzīvnieku_reģistrs.txt");
                Scanner myReader = new Scanner(myObj);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] fields = data.split(" ");
                    System.out.println("Please provide animal ID number: ");
                    String userInput2 = scan.next();
                    if (fields[9].equals(userInput2)) {
                        fields[7] = "true";
                    }
                }
                myReader.close();
            } catch (
                    FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}

