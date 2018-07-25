package builder;

public abstract class MealBuilder {
    public void addSideMeal() {}
    public void addMainMeal() {}
    public void addDrink() {}
    public void addDessert() {}
    public void addExtras() {}
    public void packageMeal() {}

    public abstract Object getMeal();
}
