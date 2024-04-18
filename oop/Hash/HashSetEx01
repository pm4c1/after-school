package hash;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetEx01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, target));
    }

    public static boolean solution ( int[] arr, int target ) {
        HashSet<Integer> set = new HashSet<>();

        for(int i :arr){
            if(set.contains(target-i) && target-i != i){
                return true;
            }
            set.add(i);
        }
        return false;

//        for (int i = 0; i < arr.length; i++) {
//            int t = 0;
//            for (int k = i + 1; k < arr.length; k++) {
//                t = arr[i] + arr[k];
//                if(t == target){
//                    return true;
//                }
//            }
//        }
//        return true;
    }
}
