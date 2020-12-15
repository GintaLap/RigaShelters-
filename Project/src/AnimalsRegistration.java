import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AnimalsRegistration {



        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Dzīvnieku reģistrs");
            System.out.println("Dzīvnieka vārds: ");
            String name = scan.nextLine();
            System.out.println("Dzīvnieka tips(suns, ķaķis, cits): ");
            String type = scan.nextLine();
            System.out.println("Dzīvnieka vecums: ");
            int age = scan.nextInt();
            System.out.println("Dzīvnieka lielums (mazs, vidējs, liels): ");
            String size = scan.next();
            System.out.println("Pavadītais laiks patversmē (nedēļas): ");
            int timeInShelter = scan.nextInt();
            System.out.println("Patversme(ulubele, dzīvnieku draugs, labās mājas): ");
            String assignedShelter = scan.next();
            System.out.println("Īpašas vajadzības: ");
            boolean needsSpecialTreatment = scan.nextBoolean();
            System.out.println("Adoptēts: ");
            boolean isAdopted = scan.nextBoolean();
            System.out.println("Piemērots brīvprātīgajiem: ");
            boolean isWalkable = scan.nextBoolean();

            int id = 1;



            FileWriter myFile = new FileWriter("Dzīvnieku_reģistrs.txt", true);
            PrintWriter writeIntoFile = new PrintWriter(myFile);
            writeIntoFile.printf("%s %s %s %s %s %s %s %s %s \n", name, type, age, size, timeInShelter, assignedShelter, needsSpecialTreatment, isAdopted, isWalkable );
            myFile.close();
            System.out.println("Dzīvnieks ir reģistrēts!");
            scan.close();
        }
    }

