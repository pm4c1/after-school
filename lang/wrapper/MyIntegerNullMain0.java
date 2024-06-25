package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));  // -1
        System.out.println(findValue(intArr, 0));   // 0
        System.out.println(findValue(intArr, 1));   // 1
        System.out.println(findValue(intArr, 100)); // -1

    }

    private static int findValue(int[] intArr, int target){
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
/*
    입력값이 -1일 때 -1을 반환한다.
    그런데 배열에 없는 값인 100을 입력해도 같은 -1이 반환한다.
    입력값이 -1일 때를 생각해보면, 배열에 -1값이 있어서 -1을 반환한 것인지,
    아니면 -1값이 없어서 -1을 반환한건지 명확하지 않다.
*/