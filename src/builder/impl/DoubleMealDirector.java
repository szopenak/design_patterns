package builder.impl;

import builder.MealBuilder;
import builder.MealDirector;

public class DoubleMealDirector extends MealDirector {
    private MealBuilder mealBuilder;

    public DoubleMealDirector(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    @Override
    public void prepareMeal() {
        mealBuilder.addSideMeal();
        mealBuilder.addDrink();
        mealBuilder.addSideMeal();
        mealBuilder.addDrink();
        mealBuilder.packageMeal();
    }
}
