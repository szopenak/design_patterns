package builder.impl.meals.kids;

import builder.MealBuilder;
import builder.impl.meals.Drink;

public class KidsMealBuilder extends MealBuilder {
    private KidsMenu menu = new KidsMenu();

    @Override
    public void addDessert() {
        menu.iceCreams.add(new IceCream());
    }

    @Override
    public void addSideMeal() {
        menu.lolipops.add(new Lolipop());
    }

    @Override
    public void addMainMeal() {
        menu.sugarDishes.add(new SugarDish());
    }
    @Override
    public void addDrink() {
        menu.drinks.add(new Drink());
    }
    @Override
    public void packageMeal() {
        System.out.println("Kinder meal is packaged!");
    }

    @Override
    public Object getMeal() {
        return this;
    }

    @Override
    public String toString(){
        return "Kids menu: Ice creams - " + menu.iceCreams.size() + ", drinks - " + menu.drinks.size() + ", SugarDishes - " +
                menu.sugarDishes.size() + ", lolipops -" + menu.lolipops.size();
    }
}
