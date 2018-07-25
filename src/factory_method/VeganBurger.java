package factory_method;

public class VeganBurger implements Burger{
    public VeganBurger(String beanType) {
        this.beanType = beanType;
    }

    @Override
    public String toString() {
        return "VeganBurger{" +
                "beanType='" + beanType + '\'' +
                '}';
    }

    private String beanType;

    @Override
    public void eat() {
        System.out.println("Eat vegan: " + toString());
    }
}
