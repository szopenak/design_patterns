package abstract_factory;

public class SmallBody implements Body
{
    @Override public void reflectLight()
    {
        System.out.println("Little car body here");
    }
}
