public class Shelters {
    private String shelterName;
    private String address;
    private int number;
    private String email;
    public int maxAmountOfAnimals;
    private String bankDetails;
    private int shelterId;


    public int getShelterId() {
        return shelterId;
    }

    public void setShelterId(int shelterId) {
        this.shelterId = shelterId;
    }

    public Shelters(String shelterName, String address, int number, String email, int maxAmountOfAnimals,  String bankDetails, int shelterId) {
        this.shelterName = shelterName;
        this.address = address;
        this.number = number;
        this.email = email;
        this.maxAmountOfAnimals = maxAmountOfAnimals;
        this.bankDetails = bankDetails;
        this.shelterId = shelterId;
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


    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public void getShelterDetails(){
        System.out.println("Shelter \"" + shelterName + "\". Address: " + address + ". Phone number: " + number + ". Email: " +email +
                ". Bank account: " + bankDetails + ". Maximum amount of animals: " + maxAmountOfAnimals + ". ");
    }

}