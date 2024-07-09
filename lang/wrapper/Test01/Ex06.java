package lang.Test01.code;

import java.util.*;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 동아리방의 수
        int M = sc.nextInt(); // 동아리의 수
        int X = sc.nextInt(); // 종빈이가 도와줄 수 있는 최대 금액

        int[] Ci = new int[N]; // 동아리 보수비용
        int[] Si = new int[M]; // 동아리 예산

        for (int i = 0; i < N; i++) {
            Ci[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            Si[i] = sc.nextInt();
        }

        // 동방 보수비용과 동아리 예산을 정렬
        Arrays.sort(Ci);
        Arrays.sort(Si);

        int max = 0;
        int temp = 0;

        for (int i = 0; i < N && temp < M; i++) {
            // 동아리가 동방을 재건할 수 있는지 확인
            while (temp < M && Si[temp] < Ci[i]) {
                temp++;
            }

            if (temp < M && Si[temp] >= Ci[i]) {
                max++;
                temp++;
            }
        }

        System.out.println(max);
    }
}
