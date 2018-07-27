package abstract_factory;

public class SmallCarPartsFactory extends AbstractCarPartsFactory
{
    @Override Wheels getWheels()
    {
        return new SmallWheels();
    }

    @Override Chasis getChasis()
    {
        return new LightChasis();
    }

    @Override Body getBody()
    {
        return new SmallBody();
    }
}
