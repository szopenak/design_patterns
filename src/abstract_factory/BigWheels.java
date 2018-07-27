package abstract_factory;

public class BigWheels implements Wheels
{
    @Override public void showSize()
    {
        System.out.println("Really big tires needed here");
    }
}
