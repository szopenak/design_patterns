package builder.impl.meals.burger;

public class FancyBurger {
    private Dressing dressing;
    private int meatSlices;

    public FancyBurger(Dressing dressing, int meatSlices, boolean whiteBread, String cheeseType) {
        this.dressing = dressing;
        this.meatSlices = meatSlices;
        this.whiteBread = whiteBread;
        this.cheeseType = cheeseType;
    }
    private boolean whiteBread;
    private String cheeseType;
    private GreenStuff greenStuff = new GreenStuff();
}
