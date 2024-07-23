package review.extend;

public class CheeseBurger extends HamBurger{

    String cheese = "치즈";

    @Override
    public void cook() {
        name = "치즈버거";
        super.cook();
        System.out.println("+ " + cheese);
    }
}
