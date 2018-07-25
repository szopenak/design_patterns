package builder;

import builder.impl.BigSetDirector;
import builder.impl.DoubleMealDirector;
import builder.impl.SmallSetDirector;
import builder.impl.meals.burger.BurgerMealBuilder;
import builder.impl.meals.kids.KidsMealBuilder;

import java.util.Scanner;

public class FastFoodWindow {

    public static void main(String... args){
        while (true) {
            System.out.println("Hello in our fast food. Please choose meal: B - BurgerMenu, KidsMenu - T");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();
            MealBuilder mb;
            if ("B".equals(choice)) {
                mb = new BurgerMealBuilder();
            }
            else if ("K".equals(choice)) {
                mb = new KidsMealBuilder();
            } else {
                System.out.println("Wrong choice!");
                continue;
            }

            System.out.println("Choose set: D - double, S - small, B - big");
            choice = scanner.next();
            MealDirector md;
            if ("B".equals(choice)) {
                md = new BigSetDirector(mb);
            }
            else if ("D".equals(choice)) {
                md = new DoubleMealDirector(mb);
            }
            else if ("S".equals(choice)) {
                md = new SmallSetDirector(mb);
            }
            else {
                System.out.println("Wrong choice!");
                continue;
            }

            System.out.println("Meal is prepared");
            md.prepareMeal();

            System.out.println("Enjoy your meal: " + mb.getMeal().toString());
        }
    }
}
