package singleton;

public class DoubleNullCheck
{
    private static DoubleNullCheck singleton;
    private DoubleNullCheck(){}
    public static DoubleNullCheck getInstance()
    {
        if (singleton == null)
        {
            synchronized (DoubleNullCheck.class)
            {
                if (singleton == null)
                {
                    singleton = new DoubleNullCheck();
                }
            }
        }
        return singleton;
    }
}
