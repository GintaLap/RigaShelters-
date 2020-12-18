import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Volunteer extends Person{
    // id number?
    static AtomicInteger nextId = new AtomicInteger();
    private int id;
    public Volunteer(String personName, String personSurname, String phoneNumber) {
        super(personName, personSurname, phoneNumber);
        this.id = nextId.incrementAndGet();
    }

    public int getId() {
        return id;
    }
    // assign Volunteer to animal that needs walking
}
