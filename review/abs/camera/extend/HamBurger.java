package review.extend;

public class HamBurger {
    public String name = "햄버거";
    String lettuce = "양상추";
    String patty = "패티";
    String pickle = "피클";

    public void cook(){
        System.out.println(name + "를 만듭니다.\n" +
                "빵 사이에 들어가는 재료는?\n" +
                "> " + lettuce +
                "\n+ " + patty +
                "\n+ " + pickle);
    }
}
