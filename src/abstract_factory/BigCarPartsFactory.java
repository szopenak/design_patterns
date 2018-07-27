package abstract_factory;

public class BigCarPartsFactory extends AbstractCarPartsFactory
{
    @Override Wheels getWheels()
    {
        return new BigWheels();
    }

    @Override Chasis getChasis()
    {
        return new BigChasis();
    }

    @Override Body getBody()
    {
        return new BigBody();
    }
}
