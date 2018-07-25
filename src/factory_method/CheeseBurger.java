package factory_method;

public class CheeseBurger implements Burger {
    private String cheeseType;

    @Override
    public String toString() {
        return "CheeseBurger{" +
                "cheeseType='" + cheeseType + '\'' +
                '}';
    }

    public CheeseBurger(String cheeseType) {
        this.cheeseType = cheeseType;
    }

    @Override
    public void eat() {
        System.out.println("Eat meat: " + this.toString());
    }
}
