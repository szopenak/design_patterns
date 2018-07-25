package prototype;

public class ReallyComplicatedObject implements Prototype{
    @Override
    public Prototype makeClone() {
        ReallyComplicatedObject clone = new ReallyComplicatedObject();
        clone.setThisNiceHash(new String(this.someNiceHash));
        return clone;
    }

    private InternalObject internalObject;
    private String someNiceHash;

    public void initialize() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Uops - someone interrupted object initialization!");
        }
        someNiceHash = "awd'lksngefl;skrjgn;lsrjgnsrd@#rsgfs4";
    }

    public ReallyComplicatedObject() {
        this.internalObject = new InternalObject();
    }

    private void setThisNiceHash(String h) {
        this.someNiceHash = h;
    }

    public String getPartOfNiceHash(){
        return someNiceHash.substring(15);
    }
}
