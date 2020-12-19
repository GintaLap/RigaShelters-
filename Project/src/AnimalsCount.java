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

    public static void countAnimals() {
        try {
            File myObj = new File("Dzīvnieku_reģistrs.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] fields = data.split(" ");
                // if fields [0] == .......for (int i = 0; i <data.length() ; i++) {
                if (fields[1].equalsIgnoreCase("kaķis")&& fields[5].equals("Ulubele")) {
                    catCountU++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallCatCountU++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCountU++;
                    }
                }
                if (fields[1].equalsIgnoreCase("kaķis")&& fields[5].equals("Dzīvnieku Draugs")) {
                    catCountDD++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallCatCountDD++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCountDD++;
                    }
                }
                if (fields[1].equalsIgnoreCase("kaķis")&& fields[5].equals("Labās Mājas")) {
                    catCountLM++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallCatCountLM++;
                        if (fields[6].equals("true"))
                            smallCatSpecialCountLM++;
                    }
                }

                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("vidējs") && fields[5].equals("Ulubele")) {
                    mediumCatCountU++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("vidējs") && fields[5].equals("Dzīvnieku Draugs")) {
                    mediumCatCountDD++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("vidējs") && fields[5].equals("Labās Mājas")) {
                    mediumCatCountLM++;
                    if (fields[6].equals("true"))
                        mediumCatSpecialCountLM++;
                }

                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("liels")&&fields[5].equals("Ulubele")) {
                    bigCatCountU++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("liels")&&fields[5].equals("Dzīvnieku Draugs")) {
                    bigCatCountDD++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("kaķis") && fields[3].equalsIgnoreCase("liels")&&fields[5].equals("Labās Mājas")) {
                    bigCatCountLM++;
                    if (fields[6].equals("true"))
                        bigCatSpecialCountLM++;
                }


                if (fields[1].equalsIgnoreCase("suns")&& fields[5].equals("Ulubele")) {
                    dogCountU++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallDogCountU++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCountU++;
                    }
                }
                if (fields[1].equalsIgnoreCase("suns")&& fields[5].equals("Dzīvnieku Draugs")) {
                    dogCountDD++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallDogCountDD++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCountDD++;
                    }
                }
                if (fields[1].equalsIgnoreCase("suns")&& fields[5].equals("Labās Mājas")) {
                    dogCountLM++;
                    if (fields[3].equalsIgnoreCase("mazs")) {
                        smallDogCountLM++;
                        if (fields[6].equals("true"))
                            smallDogSpecialCountLM++;
                    }
                }

                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("vidējs")&& fields[5].equals("Ulubele")) {
                    mediumDogCountU++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("vidējs")&& fields[5].equals("Dzīvnieku Draugs")) {
                    mediumDogCountDD++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("vidējs")&& fields[5].equals("Labās Mājas")) {
                    mediumDogCountLM++;
                    if (fields[6].equals("true"))
                        mediumDogSpecialCountLM++;
                }

                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("liels")&& fields[5].equals("Ulubele")) {
                    bigDogCountU++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCountU++;
                }
                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("liels")&& fields[5].equals("Dzīvnieku Draugs")) {
                    bigDogCountDD++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCountDD++;
                }
                if (fields[1].equalsIgnoreCase("suns") && fields[3].equalsIgnoreCase("liels")&& fields[5].equals("Labās Mājas")) {
                    bigDogCountLM++;
                    if (fields[6].equals("true"))
                        bigDogSpecialCountLM++;
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
