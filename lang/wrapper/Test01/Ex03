package Test01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] a = new int[N];
            int[] b = new int[M];

            for (int j = 0; j < N; j++) a[j] = sc.nextInt();
            for (int k = 0; k < M; k++) b[k] = sc.nextInt();
            Arrays.sort(b);

            int result = 0;

            for (int x = 0; x < N; x++) {
                int first = 0;
                int end = M - 1;
                int index = 0;
                int mid = (end + first) / 2;

                while (first <= end) {
                    mid = (end + first) / 2;
                    if (a[x] > b[mid]) {
                        first = mid+1;
                        index = mid+1;
                    }
                    else {
                        end = mid -1;
                    }
                }
                result += index;
            }
            System.out.println(result);
        }
    }
}
