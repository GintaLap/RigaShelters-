public class Person {

    private String personName;
    private String personSurname;
    private String phoneNumber;

    public Person(String personName, String personSurname, String phoneNumber) {
        this.personName = personName;
        this.personSurname = personSurname;
        this.phoneNumber = phoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
