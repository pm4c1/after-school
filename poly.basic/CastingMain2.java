package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // poly.childMethod();

        // 일시적 DownCasting ( ParentType -> ChildType )
        ((Child)poly).childMethod();
    }
}
