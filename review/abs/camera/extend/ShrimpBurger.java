package review.extend;

public class ShrimpBurger extends HamBurger {

    String shrimp = "새우";

    @Override
    public void cook() {
        name = "새우버거";
        super.cook();
        System.out.println("+ " + shrimp);
    }
}
