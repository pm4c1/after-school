package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {

        String str = "100";

        // String str 을 Integer 로 변환해서 출력 : 박싱
        Integer integer1 = Integer.valueOf(str);

        // Integer 를 int 로 변환해서 출력 : 오토 언박싱
        int intValue = integer1;

        // int 를 Integer 로 변환해서 출력 : 오토 박싱
        Integer integer2 = intValue;
    }
}
