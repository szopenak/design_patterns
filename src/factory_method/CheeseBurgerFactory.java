package factory_method;

public class CheeseBurgerFactory extends AbstractBurgerFactory {
    @Override
    public Burger makeBurger() {
        return new CheeseBurger("Gouda");
    }
}
