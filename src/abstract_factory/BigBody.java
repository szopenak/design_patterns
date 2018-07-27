package abstract_factory;

public class BigBody implements Body
{
    @Override public void reflectLight()
    {
        System.out.println("Really big car body");
    }
}
