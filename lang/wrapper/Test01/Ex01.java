package Test01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine(); // 문자열 입력
        str = str.replace('9', '6'); // 9를 6으로 교체

        int[] arr = new int[9]; // 0 ~ 8까지의 int[]을 만듬
        int max = 0; // 최대 갯수를 저장할 int 변수 선언 및 초기화함

        // 숫자에 해당하는 배열 인덱스의 값을 ++함
        for (int i = 0; i < str.length(); i++) {
            int num = (int)(str.charAt(i)-48); // 숫자에 아스키값은 0이 48로 시작
            arr[num]++;
        }

        // 6이 나온 경우 9를 포함하니 2로 나눈다,
        // 그리고 반올림을 하여 인덱스 6의 값을 바꾼다.
        if (arr[6] != 0) arr[6] = Math.round((float)arr[6]/2);

        // 배열에서 최대값을 구함
        for (int i : arr) max = Math.max(i, max);

        System.out.println(max);
    }
}