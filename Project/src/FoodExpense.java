import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FoodExpense {
    public static final double catFoodPrice = 4; // eur per kilo
    double catSpecialNeedsFoodPrice = 5;
    double dogFoodPrice = 3;
    double dogSpecialNeedsFoodPrice = 4;

    double foodQuantitySmallCat = 0.08; // grams per day
    double foodQuantityMediumCat = 0.95;
    double foodQuantityBigCat = 0.1; //
    double foodQuantitySmallDog = 0.15;
    double foodQuantityMediumDog = 0.25;
    double foodQuantityBigDog = 0.4;

    public void read() { // method from AnimalsCount class, which returns amount of animals
        AnimalsCount count = new AnimalsCount();
        count.countAnimals();
    }

    public double foodExpenseCatsUlubele() { // counts total monthly expenses on cat food
        double foodExpenseSmallCatU = foodQuantitySmallCat * catFoodPrice * 30 * AnimalsCount.smallCatCountU;
        double foodExpenseSmallCatSpecialU = foodQuantitySmallCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.smallCatSpecialCountU;
        double foodExpenseMediumCatU = foodQuantityMediumCat * catFoodPrice * 30 * AnimalsCount.mediumCatCountU;
        double foodExpenseMediumCatSpecialU = foodQuantityMediumCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumCatSpecialCountU;
        double foodExpenseBigCatU = foodQuantityBigCat * catFoodPrice * 30 * AnimalsCount.bigCatCountU;
        double foodExpenseBigCatSpecialU = foodQuantityBigCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.bigCatSpecialCountU;
        double foodExpenseCatsUlubele = foodExpenseSmallCatU + foodExpenseSmallCatSpecialU + foodExpenseMediumCatU + foodExpenseMediumCatSpecialU +
                foodExpenseBigCatU + foodExpenseBigCatSpecialU;
        return foodExpenseCatsUlubele;
    }

    public double foodExpenseDogsUlubele() { // counts total monthly expenses on dog food for Ulubele
        double foodExpenseSmallDogU = foodQuantitySmallDog * dogFoodPrice * 30 * AnimalsCount.smallDogCountU;
        double foodExpenseSmallDogSpecialU = foodQuantitySmallDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.smallDogSpecialCountU;
        double foodExpenseMediumDogU = foodQuantityMediumDog * dogFoodPrice * 30 * AnimalsCount.mediumDogCountU;
        double foodExpenseMediumDogSpecialU = foodQuantityMediumDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumDogCountU;
        double foodExpenseBigDogU = foodQuantityBigDog * dogFoodPrice * 30 * AnimalsCount.bigDogCountU;
        double foodExpenseBigDogSpecialU = foodQuantityBigDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.bigDogSpecialCountU;
        double foodExpenseDogsUlubele = foodExpenseSmallDogU + foodExpenseSmallDogSpecialU + foodExpenseMediumDogU + foodExpenseMediumDogSpecialU +
                foodExpenseBigDogU + foodExpenseBigDogSpecialU;
        return foodExpenseDogsUlubele;
    }

    public double foodExpenseTotalUlubele() { // count total monthly expenses on all animals
        return foodExpenseCatsUlubele() + foodExpenseDogsUlubele();
    }


    public double foodExpenseCatsDzivniekuDraugs() { // counts total monthly expenses on cat food for Dzivnieku Draugs
        double foodExpenseSmallCatDD = foodQuantitySmallCat * catFoodPrice * 30 * AnimalsCount.smallCatCountDD;
        double foodExpenseSmallCatSpecialDD = foodQuantitySmallCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.smallCatSpecialCountDD;
        double foodExpenseMediumCatDD = foodQuantityMediumCat * catFoodPrice * 30 * AnimalsCount.mediumCatCountDD;
        double foodExpenseMediumCatSpecialDD = foodQuantityMediumCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumCatSpecialCountDD;
        double foodExpenseBigCatDD = foodQuantityBigCat * catFoodPrice * 30 * AnimalsCount.bigCatCountDD;
        double foodExpenseBigCatSpecialDD = foodQuantityBigCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.bigCatSpecialCountDD;
        double foodExpenseCatsDzivniekuDraugs = foodExpenseSmallCatDD + foodExpenseSmallCatSpecialDD + foodExpenseMediumCatDD + foodExpenseMediumCatSpecialDD +
                foodExpenseBigCatDD + foodExpenseBigCatSpecialDD;
        return foodExpenseCatsDzivniekuDraugs;
    }

    public double foodExpenseDogsDzivniekuDraugs() { // counts total monthly expenses on dog food for Dzivnieku Draugs
        double foodExpenseSmallDogDD = foodQuantitySmallDog * dogFoodPrice * 30 * AnimalsCount.smallDogCountDD;
        double foodExpenseSmallDogSpecialDD = foodQuantitySmallDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.smallDogSpecialCountDD;
        double foodExpenseMediumDogDD = foodQuantityMediumDog * dogFoodPrice * 30 * AnimalsCount.mediumDogCountDD;
        double foodExpenseMediumDogSpecialDD = foodQuantityMediumDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumDogCountDD;
        double foodExpenseBigDogDD = foodQuantityBigDog * dogFoodPrice * 30 * AnimalsCount.bigDogCountDD;
        double foodExpenseBigDogSpecialDD = foodQuantityBigDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.bigDogSpecialCountDD;
        double foodExpenseDogsDzivniekuDraugs = foodExpenseSmallDogDD + foodExpenseSmallDogSpecialDD + foodExpenseMediumDogDD + foodExpenseMediumDogSpecialDD +
                foodExpenseBigDogDD + foodExpenseBigDogSpecialDD;
        return foodExpenseDogsDzivniekuDraugs;
    }
    public double foodExpenseTotalDzivniekuDraugs() { // count total monthly expenses on all animals for Dzivnieku Draugs
        return foodExpenseCatsDzivniekuDraugs() + foodExpenseDogsDzivniekuDraugs();
    }


    public double foodExpenseCatsLabasMajas() { // counts total monthly expenses on cat food for Labas Majas
        double foodExpenseSmallCatLM = foodQuantitySmallCat * catFoodPrice * 30 * AnimalsCount.smallCatCountLM;
        double foodExpenseSmallCatSpecialLM = foodQuantitySmallCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.smallCatSpecialCountLM;
        double foodExpenseMediumCatLM = foodQuantityMediumCat * catFoodPrice * 30 * AnimalsCount.mediumCatCountLM;
        double foodExpenseMediumCatSpecialLM = foodQuantityMediumCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumCatSpecialCountLM;
        double foodExpenseBigCatLM = foodQuantityBigCat * catFoodPrice * 30 * AnimalsCount.bigCatCountLM;
        double foodExpenseBigCatSpecialLM = foodQuantityBigCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.bigCatSpecialCountLM;
        double foodExpenseCatsLabasMajas = foodExpenseSmallCatLM + foodExpenseSmallCatSpecialLM + foodExpenseMediumCatLM + foodExpenseMediumCatSpecialLM +
                foodExpenseBigCatLM + foodExpenseBigCatSpecialLM;
        return foodExpenseCatsLabasMajas;

    }

    public double foodExpenseDogsLabasMajas() { // counts total monthly expenses on dog food for Labās Mājas
        double foodExpenseSmallDogLM = foodQuantitySmallDog * dogFoodPrice * 30 * AnimalsCount.smallDogCountLM;
        double foodExpenseSmallDogSpecialLM = foodQuantitySmallDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.smallDogSpecialCountLM;
        double foodExpenseMediumDogLM = foodQuantityMediumDog * dogFoodPrice * 30 * AnimalsCount.mediumDogCountLM;
        double foodExpenseMediumDogSpecialLM = foodQuantityMediumDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumDogCountLM;
        double foodExpenseBigDogLM = foodQuantityBigDog * dogFoodPrice * 30 * AnimalsCount.bigDogCountLM;
        double foodExpenseBigDogSpecialLM = foodQuantityBigDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.bigDogSpecialCountLM;
        double foodExpenseDogsLabasMajas = foodExpenseSmallDogLM + foodExpenseSmallDogSpecialLM + foodExpenseMediumDogLM + foodExpenseMediumDogSpecialLM +
                foodExpenseBigDogLM + foodExpenseBigDogSpecialLM;
        return foodExpenseDogsLabasMajas;
    }
public double foodExpenseTotalLabasMajas() { // count total monthly expenses on all animals for Labās Mājas
        return foodExpenseCatsLabasMajas() + foodExpenseDogsLabasMajas();
        }
}


