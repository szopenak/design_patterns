package factory_method;

public class VeganBurgerFactory extends AbstractBurgerFactory {
    @Override
    public Burger makeBurger() {
        return new VeganBurger("some bean");
    }
}
