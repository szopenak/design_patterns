package builder.impl;

import builder.MealBuilder;
import builder.MealDirector;

public class BigSetDirector extends MealDirector {
    private MealBuilder mealBuilder;

    public BigSetDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    @Override
    public void prepareMeal() {
        mealBuilder.addSideMeal();
        mealBuilder.addMainMeal();
        mealBuilder.addDrink();
        mealBuilder.addDessert();
        mealBuilder.addExtras();
        mealBuilder.packageMeal();
    }
}
