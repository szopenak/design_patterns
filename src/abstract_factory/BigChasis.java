package abstract_factory;

public class BigChasis implements Chasis
{
    @Override public void showMaxLoad()
    {
        System.out.println("3 tonnes max load");
    }
}
