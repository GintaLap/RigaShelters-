import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Volunteer extends Person {

    static AtomicInteger nextId = new AtomicInteger();
    private int id;
    private String animalToVisit;

    public static AtomicInteger getNextId() {
        return nextId;
    }

    public static void setNextId(AtomicInteger nextId) {
        Volunteer.nextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnimalToVisit() {
        return animalToVisit;
    }

    public void setAnimalToVisit(String animalToVisit) {
        this.animalToVisit = animalToVisit;
    }

    public Volunteer(String personName, String personSurname, String phoneNumber, String animalToVisit) {
        super(personName, personSurname, phoneNumber);
        this.animalToVisit = animalToVisit;
    }

    public Volunteer(String personName, String personSurname, String phoneNumber) {
        super(personName, personSurname, phoneNumber);
        this.id = nextId.incrementAndGet(); // assigning ID to volunteer
    }

    public int getId() {
        return id;
    }

    public void assignAnimalToVolunteer(){
        getId();

    }
 public static void volunteerRegistration(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Volunteer Registration");
        System.out.println("Volunteer's name: ");
        String personName = scan.nextLine();
        System.out.println("Volunteer's surname: ");
        String personSurname = scan.nextLine();
        System.out.println("Volunteer's phone number: ");
        int phoneNumber = scan.nextInt();
        String[] preferredType = new String[]{"Dog", "Cat", "Both"};
        System.out.println("Preferred animal type:");
        for (byte i = 0; i < preferredType.length; i++) {
            System.out.println(i + 1 + " - " + preferredType[i]);
        }
        System.out.print("Enter number accordingly (1 till 3): ");
        byte p = scan.nextByte();
        while (p <= 0 || p > 3){
            System.out.print("Incorrect entry. Please enter number accordingly (1 till 3): ");
            p = scan.nextByte();
        }
        System.out.println("Can foster animals (True/False): ");
        boolean canFoster = scan.nextBoolean();
        Random id_animal = new Random();
        int id = id_animal.nextInt(10000);


        String VolunteerRegistration = "Volunteer_Registration";
        try (FileWriter fileWriter = new FileWriter("Volunteer_Registration.txt", true)) {
            PrintWriter writeIntoFile = new PrintWriter(fileWriter);
            writeIntoFile.printf("%s %s %s %s %s %s \n", personName, personSurname,phoneNumber, preferredType[p - 1], canFoster, id);
            fileWriter.close();
            System.out.println("Volunteer is registered!");
            scan.close();
        } catch (IOException e) {
            System.out.println("Connection failed!");
        }scan.close();

    }
    // need to assign Volunteer to animal that needs walking
}
