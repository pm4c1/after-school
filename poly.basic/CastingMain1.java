package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // poli.childMethod();

        // DownCasting ( ParentType -> ChildType )
        Child child = (Child) poly;
        child.childMethod();
    }
}
