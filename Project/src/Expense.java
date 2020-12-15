import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Expense {

    private LocalDateTime localDateTime;

    private String purpose; // food, electricity, salary, medicalTreatment (animal ID. pass as attribute somehow.)
    private double amount;

    public Expense(String purpose, double amount) {
        this.purpose = purpose;
        this.amount = amount;
        this.localDateTime = LocalDateTime.now();
    }

    public String getPurpose() {
        return purpose;
    }

    public double getAmount() {
        return amount;
    }

    public String getLocalDateTime() { // getting local time, when method was called
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:m", Locale.ENGLISH);
        String formatted = dateFormat.format(localDateTime);
        return formatted;
    }
    //CREATING OLGA BRANCH 21:55
}
