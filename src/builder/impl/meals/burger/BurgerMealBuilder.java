package builder.impl.meals.burger;

import builder.MealBuilder;
import builder.impl.meals.Drink;

public class BurgerMealBuilder extends MealBuilder {
    private BurgerMenu menu = new BurgerMenu();

    @Override
    public void addSideMeal() {
        menu.fries.add(new Fries());
    }

    @Override
    public void addMainMeal() {
        menu.burgers.add(new FancyBurger(Dressing.BBQ, 1, true, "Gouda"));
    }

    @Override
    public void addDrink() {
        menu.drinks.add(new Drink());
    }

    @Override
    public void addExtras() {
        menu.ketchups.add(new Ketchup());
    }

    @Override
    public void packageMeal() {
        System.out.println("Burger menu packaged!");
    }

    @Override
    public Object getMeal() {
        return this;
    }

    @Override
    public String toString(){
        return "Burger menu: Fries - " + menu.fries.size() + ", drinks - " + menu.drinks.size() + ", Burgers - " + menu.burgers.size()
                + ", ketchups - " + menu.ketchups.size();
    }
}

