package generics;

public class GenericsMain1 {

    public static void main(String[] args) {
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        // 기본 데이터 타입 : int, double 등은 사용할 수 없다.
        // 래퍼 타입만 사용할 수 있다.
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }

    // 제네릭 메서드 생성
    // T : Type
    // E : Element
    // K : Key
    // V : Value

    private static <T> void printAnyArray(T[] array){
        for(T t : array){
            System.out.print(t + " ");
        }
        System.out.println();
    }
}
