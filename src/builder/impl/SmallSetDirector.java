package builder.impl;

import builder.MealBuilder;
import builder.MealDirector;

public class SmallSetDirector extends MealDirector {
    private MealBuilder mealBuilder;

    public SmallSetDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    @Override
    public void prepareMeal() {
        mealBuilder.addSideMeal();
        mealBuilder.addDrink();
        mealBuilder.packageMeal();
    }
}
