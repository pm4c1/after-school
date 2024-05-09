package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // UpCasting
        Parent parent2 = child; // UpCasting은 생략이 가능

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
