package abstract_factory;

public class SmallWheels implements Wheels
{
    @Override public void showSize()
    {
        System.out.println("Little tyres needed");
    }
}
