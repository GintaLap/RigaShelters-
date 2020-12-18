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

    public double foodExpenseCats() { // counts total monthly expenses on cat food
        double foodExpenseSmallCat = foodQuantitySmallCat * catFoodPrice * 30 * AnimalsCount.smallCatCount;
        double foodExpenseSmallCatSpecial = foodQuantitySmallCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.smallCatSpecialCount;
        double foodExpenseMediumCat = foodQuantityMediumCat * catFoodPrice * 30 * AnimalsCount.mediumCatCount;
        double foodExpenseMediumCatSpecial = foodQuantityMediumCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumCatSpecialCount;
        double foodExpenseBigCat = foodQuantityBigCat * catFoodPrice * 30 * AnimalsCount.bigCatCount;
        double foodExpenseBigCatSpecial = foodQuantityBigCat * catSpecialNeedsFoodPrice * 30 * AnimalsCount.bigCatSpecialCount;
        double foodExpenseCats = foodExpenseSmallCat + foodExpenseSmallCatSpecial + foodExpenseMediumCat + foodExpenseMediumCatSpecial +
                foodExpenseBigCat + foodExpenseBigCatSpecial;
        return foodExpenseCats;

    }

    public double foodExpenseDogs() { // counts total monthly expenses on dog food
        double foodExpenseSmallDog = foodQuantitySmallDog * dogFoodPrice * 30 * AnimalsCount.smallDogCount;
        double foodExpenseSmallDogSpecial = foodQuantitySmallDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.smallDogSpecialCount;
        double foodExpenseMediumDog = foodQuantityMediumDog * dogFoodPrice * 30 * AnimalsCount.mediumDogCount;
        double foodExpenseMediumDogSpecial = foodQuantityMediumDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.mediumDogCount;
        double foodExpenseBigDog = foodQuantityBigDog * dogFoodPrice * 30 * AnimalsCount.bigDogCount;
        double foodExpenseBigDogSpecial = foodQuantityBigDog * dogSpecialNeedsFoodPrice * 30 * AnimalsCount.bigDogSpecialCount;
        double foodExpenseDogs = foodExpenseSmallDog + foodExpenseSmallDogSpecial + foodExpenseMediumDog + foodExpenseMediumDogSpecial +
                foodExpenseBigDog + foodExpenseBigDogSpecial;
        return foodExpenseDogs;
    }

    public double foodExpenseTotal() { // count total monthly expenses on all animals
        return foodExpenseCats() + foodExpenseDogs();
    }


}
