public class Shelters {
    private String shelterName;
    private String address;
    private int number;
    private String email;
    private static int maxAmountOfAnimals;
    private int currentAmountOfAnimals;
    private String bankDetails;

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getMaxAmountOfAnimals() {
        return maxAmountOfAnimals;
    }

    public static void setMaxAmountOfAnimals(int maxAmountOfAnimals) {
        Shelters.maxAmountOfAnimals = maxAmountOfAnimals;
    }

    public int getCurrentAmountOfAnimals() {
        return currentAmountOfAnimals;
    }

    public void setCurrentAmountOfAnimals(int currentAmountOfAnimals) {
        this.currentAmountOfAnimals = currentAmountOfAnimals;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }
}
