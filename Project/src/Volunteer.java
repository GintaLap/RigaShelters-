import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Volunteer extends Person {

    static AtomicInteger nextId = new AtomicInteger();
    private int id;

    public Volunteer(String personName, String personSurname, String phoneNumber) {
        super(personName, personSurname, phoneNumber);
        this.id = nextId.incrementAndGet(); // assigning ID to volunteer
    }

    public int getId() {
        return id;
    }
    // need to assign Volunteer to animal that needs walking
}
