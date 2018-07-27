package abstract_factory;

public class LightChasis implements Chasis
{
    @Override public void showMaxLoad()
    {
        System.out.println("Light chasis built");
    }
}
