package factory_method;

import java.util.Scanner;

public class ComeOnGiveMeBurger {
    public static void main(String... args) {
        while (true) {
            System.out.println("I'll give you a burger but are you a vegan? y/n");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            AbstractBurgerFactory factory;
            if ("n".equalsIgnoreCase(choice)) {
                factory = new CheeseBurgerFactory();
            } else if ("y".equalsIgnoreCase(choice)) {
                factory = new VeganBurgerFactory();
            } else continue;

            Burger burger = factory.makeBurger();
            burger.eat();
        }
    }
}
