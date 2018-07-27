package abstract_factory;

import java.util.Scanner;

public class Main
{
    public static void main(String... args) {
        while (true) {
            System.out.println("What kind of car do you need? Big(B)/Small(S)?");
            Scanner scanner = new Scanner(System.in);
            String type = scanner.next();
            AbstractCarPartsFactory carPartsFactory;
            if ("B".equals(type)) {
                carPartsFactory = new BigCarPartsFactory();
            } else if ("S".equals(type)) {
                carPartsFactory = new SmallCarPartsFactory();
            } else {
                System.out.println("Bad type!");
                continue;
            }
            System.out.println("Starting build process!");
            carPartsFactory.getBody().reflectLight();
            carPartsFactory.getChasis().showMaxLoad();
            carPartsFactory.getWheels().showSize();
            System.out.println("Body, Chasis and Wheels built!");
        }
    }
}
