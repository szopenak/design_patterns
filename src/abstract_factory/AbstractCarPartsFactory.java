package abstract_factory;

public abstract class AbstractCarPartsFactory
{
    abstract Wheels getWheels();
    abstract Chasis getChasis();
    abstract Body getBody();
}
