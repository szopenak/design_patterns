package singleton;

public class EagerStatic
{
    private static EagerStatic singleton = new EagerStatic();
    private EagerStatic(){}
    public static EagerStatic getInstance() {
        return singleton;
    }
}
