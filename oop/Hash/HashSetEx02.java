package hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetEx02 {

    /*
    문제

    정수 배열 numbers가 주어진다. numbers에서 서로 다른 index에 있는 2개의 수를 뽑아 더 해 만들 수 있는
    모든 수를 배열에 오름차순으로 담아 반환하는 sulution()함수에 작성하시오.

    제약 조건
    중복된 값을 제거해야한다.
    numbers의 길이 N은 2이상 100이하이다.
    numbers의 모든 수는 0이상 100이하이다.

    입력 예시1
    5
    2 1 3 4 1
    입력 예시2
    4
    5 0 2 7

    출력 예시1
    2 3 4 5 6 7
    출력 예시2
    2 5 7 9 12
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for(int i=0; i<N; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        System.out.println(set);
        System.out.println(set.toString());
        System.out.println();

        // 방법 1
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        System.out.println();

        // 방법 2
        int[] newNums = set.stream().sorted().mapToInt(Integer::intValue).toArray();

        for(int n : newNums){
            System.out.print(n + " ");
        }

    }
}
