package lang.string.exam;

import java.util.Scanner;

public class StringEx04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();
        int startIdx = 0;
        int cnt = 0;

        while (true){
            // indexOf() : 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환하며
            //             만약 찾지 못했을 경우 -1을 반환한다.
            int findIdx = doc.indexOf(word, startIdx);
            if (findIdx < 0){
                break;
            }
            // ------- abababab
            // aba ------ 9 ->
            startIdx = findIdx + word.length();
            cnt++;
        }
        System.out.println(cnt);
    }
}
