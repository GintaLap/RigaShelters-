public class Shelters {
    private String shelterName;
    private String address;
    private int number;
    private String email;
    private int maxAmountOfAnimals;
    private int currentAmountOfAnimals;
    private String bankDetails;

    public Shelters(String shelterName, String address, int number, String email, int maxAmountOfAnimals, int currentAmountOfAnimals, String bankDetails) {
        this.shelterName = shelterName;
        this.address = address;
        this.number = number;
        this.email = email;
        this.maxAmountOfAnimals = maxAmountOfAnimals;
        this.currentAmountOfAnimals = currentAmountOfAnimals;
        this.bankDetails = bankDetails;
    }

    public int getMaxAmountOfAnimals() {
        return maxAmountOfAnimals;
    }

    public void setMaxAmountOfAnimals(int maxAmountOfAnimals) {
        this.maxAmountOfAnimals = maxAmountOfAnimals;
    }

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
