package prototype;

import java.util.Scanner;

public class Main {

    private static ReallyComplicatedObject myObject;

    public static void main(String... args) {
        while (true) {
            System.out.println("Type anything to consume ReallyComplicatedObjects!");
            Scanner scanner = new Scanner(System.in);
            scanner.next();
            long startTime = System.nanoTime();
            if (myObject == null) {
                myObject = new ReallyComplicatedObject();
                myObject.initialize();
                consumeObject(myObject);
            } else {
                consumeObject(myObject.makeClone());
            }
            System.out.println("Took time: " + (System.nanoTime() - startTime) / Math.pow(10, 6) + " ms!");
        }
    }

    public static void consumeObject(Prototype o) {
        if (o instanceof ReallyComplicatedObject) {
            ReallyComplicatedObject rco = (ReallyComplicatedObject) o;
            System.out.println("Consumed ReallyComplicatedObject! InternalHash: " + rco.getPartOfNiceHash() + ", Object Hash:" + rco.hashCode());
        }
    }
}
