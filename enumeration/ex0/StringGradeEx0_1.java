package enumeration.ex0;

public class StringGradeEx0_1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);
        System.out.printf("basic 등급의 할인 금액: %d원 \n", basic);
        System.out.printf("gold 등급의 할인 금액: %d원 \n", gold);
        System.out.printf("diamond 등급의 할인 금액: %d원 \n", diamond);

    }
}
