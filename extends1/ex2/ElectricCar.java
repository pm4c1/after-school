package extends1.ex2;

public class ElectricCar extends Car {
    /*
    전기차 ElectricCar는 extends Car를 사용해서 부모클래스인 Car를 상속 받는다.
    상속 덕분에 ElectricCar에서도 move()를 사용할 수 있다.
     */


    public void charge(){
        System.out.println("충전합니다.");
    }
}
