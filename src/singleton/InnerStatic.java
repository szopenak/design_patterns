package singleton;

public class InnerStatic
{
    private InnerStatic(){}

    private static class SingletonHelper{
        private static final InnerStatic INSTANCE = new InnerStatic();
    }

    public static InnerStatic getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
