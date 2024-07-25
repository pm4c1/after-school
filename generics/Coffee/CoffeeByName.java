package generics.coffee;

public class CoffeeByName {

    public Object name; // Integer, Double, String .... 래퍼 클래스만

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + name);
    }
}
