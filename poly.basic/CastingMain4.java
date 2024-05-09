package poly.basic;

public class CastingMain4 {
    // DownCasting은 잘못하면 심각한 런타임 오류가 발생할 수 있다.
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1; // DownCasting
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2; // DownCasting
        // child2.childMethod(); // RunTime Error
        // DownCasting 은 다형성에서는 꼭 중요시해야한다.

    }
}
