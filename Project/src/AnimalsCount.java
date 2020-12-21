import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnimalsCount {

    public static int catCountU = 0;
    public static int catCountDD = 0;
    public static int catCountLM = 0;

    public static int dogCountU = 0;
    public static int dogCountDD = 0;
    public static int dogCountLM = 0;

    public static int smallCatCountU = 0;
    public static int smallCatCountDD = 0;
    public static int smallCatCountLM = 0;

    public static int smallCatSpecialCountU = 0;
    public static int smallCatSpecialCountDD = 0;
    public static int smallCatSpecialCountLM = 0;

    public static int mediumCatCountU = 0;
    public static int mediumCatSpecialCountU = 0;
    public static int mediumCatCountDD = 0;
    public static int mediumCatSpecialCountDD = 0;
    public static int mediumCatCountLM = 0;
    public static int mediumCatSpecialCountLM = 0;

    public static int bigCatCountU = 0;
    public static int bigCatSpecialCountU = 0;
    public static int bigCatCountDD = 0;
    public static int bigCatSpecialCountDD = 0;
    public static int bigCatCountLM = 0;
    public static int bigCatSpecialCountLM = 0;

    public static int smallDogCountU = 0;
    public static int smallDogCountDD = 0;
    public static int smallDogCountLM = 0;
    public static int smallDogSpecialCountU = 0;
    public static int smallDogSpecialCountDD = 0;
    public static int smallDogSpecialCountLM = 0;

    public static int mediumDogCountU = 0;
    public static int mediumDogCountDD = 0;
    public static int mediumDogCountLM = 0;
    public static int mediumDogSpecialCountU = 0;
    public static int mediumDogSpecialCountDD = 0;
    public static int mediumDogSpecialCountLM = 0;
    public static int bigDogCountU = 0;
    public static int bigDogCountDD = 0;
    public static int bigDogCountLM = 0;

    public static int bigDogSpecialCountU = 0;
    public static int bigDogSpecialCountDD = 0;
    public static int bigDogSpecialCountLM = 0;

    public static int currentAnimalCountU = 0;
    public static int currentAnimalCountDD = 0;
    public static int currentAnimalCountLM = 0;

    public static int dogsForVolunteersU;
    public static int dogsForVolunteersDD;
    public static int dogsForVolunteersLM;
    public static int catsForVolunteersU;
    public static int catsForVolunteersDD;
    public static int catsForVolunteersLM;

    public static int dogsAdopted;
    public static int catsAdopted;
    public static int dogsInShelters;
    public static int catsInShelters;
    public static int totalAnimalsInShelters;
    public static int totalAdoptedAnimals;

    public static void countAnimals() {
        try {
            File myObj = new File("Dzīvnieku_reģistrs.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] fields = data.split(" ");
                // if fields [0] == .......for (int i = 0; i <data.length() ; i++) {
                if (fields[1].equalsIgnoreCase("Cat") && fields[5].equals("Ulubele") && fields[7].equals("false")) {
                    catCountU++;
                    if (fields[3].equalsIgnoreCase("Small")) {
                        smallCatCountU++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCountU++;
                    }
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[5].equals("Dzīvnieku_Draugs") && fields[7].equals("false")) {
                    catCountDD++;
                    if (fields[3].equalsIgnoreCase("Small")) {
                        smallCatCountDD++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCountDD++;
                    }
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[5].equals("Labās_Mājas") && fields[7].equals("false")) {
                    catCountLM++;
                    if (fields[3].equalsIgnoreCase("Small")) {
                        smallCatCountLM++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCountLM++;
                    }
                }

                if (fields[1].equalsIgnoreCase("Cat") && fields[3].equalsIgnoreCase("Medium") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    mediumCatCountU++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[3].equalsIgnoreCase("Medium") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    mediumCatCountDD++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[3].equalsIgnoreCase("Medium") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    mediumCatCountLM++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCountLM++;
                }

                if (fields[1].equalsIgnoreCase("Cat") && fields[3].equalsIgnoreCase("Large") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    bigCatCountU++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[3].equalsIgnoreCase("Large") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    bigCatCountDD++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[3].equalsIgnoreCase("Large") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    bigCatCountLM++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCountLM++;
                }


                if (fields[1].equalsIgnoreCase("Dog") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    dogCountU++;
                    if (fields[3].equalsIgnoreCase("Small")) {
                        smallDogCountU++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCountU++;
                    }
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    dogCountDD++;
                    if (fields[3].equalsIgnoreCase("Small")) {
                        smallDogCountDD++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCountDD++;
                    }
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    dogCountLM++;
                    if (fields[3].equalsIgnoreCase("Small")) {
                        smallDogCountLM++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCountLM++;
                    }
                }

                if (fields[1].equalsIgnoreCase("Dog") && fields[3].equalsIgnoreCase("Medium") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    mediumDogCountU++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[3].equalsIgnoreCase("Medium") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    mediumDogCountDD++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[3].equalsIgnoreCase("Medium") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    mediumDogCountLM++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCountLM++;
                }

                if (fields[1].equalsIgnoreCase("Dog") && fields[3].equalsIgnoreCase("Large") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    bigDogCountU++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[3].equalsIgnoreCase("Large") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    bigDogCountDD++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[3].equalsIgnoreCase("Large") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    bigDogCountLM++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCountLM++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[8].equalsIgnoreCase("true") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    dogsForVolunteersU++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[8].equalsIgnoreCase("true") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    dogsForVolunteersDD++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[8].equalsIgnoreCase("true") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    dogsForVolunteersLM++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[8].equalsIgnoreCase("true") && fields[5].equals("Ulubele")&& fields[7].equals("false")) {
                    catsForVolunteersU++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[8].equalsIgnoreCase("true") && fields[5].equals("Dzīvnieku_Draugs")&& fields[7].equals("false")) {
                    catsForVolunteersDD++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[8].equalsIgnoreCase("true") && fields[5].equals("Labās_Mājas")&& fields[7].equals("false")) {
                    catsForVolunteersLM++;
                }
                if (fields[1].equalsIgnoreCase("Cat") && fields[7].equalsIgnoreCase("true")) {
                    catsAdopted++;
                }
                if (fields[1].equalsIgnoreCase("Dog") && fields[7].equalsIgnoreCase("true")) {
                    dogsAdopted++;
                }
                if (fields[1].equalsIgnoreCase("Cat")) {
                    catsInShelters++;
                }
                if (fields[1].equalsIgnoreCase("Dog")) {
                    dogsInShelters++;
                }

            }
            currentAnimalCountU = dogCountU + catCountU;
            currentAnimalCountDD = dogCountDD + catCountDD;
            currentAnimalCountLM = dogCountLM + catCountLM;
            totalAdoptedAnimals = dogsAdopted+catsAdopted;
            totalAnimalsInShelters = dogsInShelters + catsInShelters;

            myReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public int currentAnimalCountUlubele() {
        return currentAnimalCountU;
    }

    public int currentCountDzivniekuDraugs() {
        return currentAnimalCountDD;
    }

    public int currentCountLabasMajas() {
        return currentAnimalCountLM;
    }

    public int dogsForVolunteersUlubele() {
        return dogsForVolunteersU;
    }

    public int dogsForVolunteersDzivniekuDraugs() {
        return dogsForVolunteersDD;
    }

    public int dogsForVolunteersLabasMajas() {
        return dogsForVolunteersLM;
    }

    public int catsForVolunteersUlubele() {
        return catsForVolunteersU;
    }

    public int catsForVolunteersDzivniekuDraugs() {
        return catsForVolunteersDD;
    }

    public int catsForVolunteersLabasMajas() {
        return catsForVolunteersLM;
    }

    public int AdoptedAnimals() {
        return totalAdoptedAnimals;
    }

    public int AnimalsInAllShelters() {
        return totalAnimalsInShelters;
    }

    public static void main(String[] args) {
        System.out.println(currentAnimalCountU);
    }
}
