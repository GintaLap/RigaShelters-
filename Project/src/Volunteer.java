import java.util.Random;
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

    // need to assign Volunteer to animal that needs walking
}
