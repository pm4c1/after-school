package poly.ex.pay1;

public class NaverPay implements Pay{
    @Override
    public void pay(int amount) {
        System.out.println("네이버 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
    }
}
