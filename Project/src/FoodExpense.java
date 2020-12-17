import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FoodExpense {


    double catFoodPrice = 4; // eur per kilo
    double catSpecialNeedsFoodPrice = 5;
    double dogFoodPrice = 3;
    double dogSpecialNeedsFoodPrice = 4;

    double foodQuantitySmallCat = 0.08; // grams per day
    double foodQuantityBigCat = 0.1; //
    double foodQuantitySmallDog = 0.15;
    double foodQuantityBigDog = 0.4;

    double foodExpenseSmallCat = foodQuantitySmallCat * catFoodPrice * 30;
    double foodExpenseSmallCatSpecial = foodQuantitySmallCat * catSpecialNeedsFoodPrice * 30;
    double foodExpenseBigCat = foodQuantityBigCat * catFoodPrice * 30;
    double foodExpenseBigCatSpecial = foodQuantityBigCat * catSpecialNeedsFoodPrice * 30;

    double foodExpenseSmallDog = foodQuantitySmallDog * dogFoodPrice * 30;
    double foodExpenseSmallDogSpecial = foodQuantitySmallDog * dogSpecialNeedsFoodPrice * 30;
    double foodExpenseBigDog = foodQuantityBigDog * dogFoodPrice * 30;
    double foodExpenseBigDogSpecial = foodQuantityBigDog * dogSpecialNeedsFoodPrice * 30;

    int smallCatCount = 0; // counters of cats
    int smallCatSpecialCount = 0;
    int bigCatCount = 0;
    int bigCatSpecialCount = 0;

    int smallDogCount = 0; // counters of dogs
    int smallDogSpecialCount = 0;
    int bigDogCount = 0;
    int bigDogSpecialCount = 0;

    // then Code based on arrays follows
}
