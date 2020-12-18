import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnimalsCount {
    private int catCount = 0;
    private int dogCount = 0;

    private int smallCatCount = 0;
    private int smallCatSpecialCount = 0;
    private int mediumCatCount = 0;
    private int mediumCatSpecialCount = 0;
    private int bigCatCount = 0;
    private int bigCatSpecialCount = 0;

    private int smallDogCount = 0;
    private int smallDogSpecialCount = 0;
    private int mediumDogCount = 0;
    private int mediumDogSpecialCount = 0;
    private int bigDogCount = 0;
    private int bigDogSpecialCount = 0;

    public static void main(String[] args) {
        AnimalsCount a = new AnimalsCount();
        a.readFile();
    }

    public void readFile() {
        try {
            File myObj = new File("Dzīvnieku_reģistrs.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] fields = data.split(" ");
                // if fields [0] == .......for (int i = 0; i <data.length() ; i++) {
                if (fields[1].equalsIgnoreCase("kaķis")) {
                    catCount++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallCatCount++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCount++;
                    }
                }

                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("vidējs")) {
                    mediumCatCount++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCount++;
                }

                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("liels")) {
                    bigCatCount++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCount++;
                }


                if (fields[1].equalsIgnoreCase("suns")) {
                    dogCount++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallDogCount++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCount++;
                    }
                }

                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("vidējs")) {
                    mediumDogCount++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCount++;
                }

                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("liels")) {
                    bigDogCount++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCount++;
                }

            }
            /*System.out.println(catCount);
            System.out.println(dogCount);
            System.out.println();
            System.out.println(smallCatCount);
            System.out.println(smallCatSpecialCount);
            System.out.println(mediumCatCount);
            System.out.println(mediumCatSpecialCount);
            System.out.println(bigCatCount);
            System.out.println(bigCatSpecialCount);
            System.out.println();
            System.out.println(smallDogCount);
            System.out.println(smallDogSpecialCount);
            System.out.println(mediumDogCount);
            System.out.println(mediumDogSpecialCount);
            System.out.println(bigDogCount);
            System.out.println(bigDogSpecialCount);*/


            myReader.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
