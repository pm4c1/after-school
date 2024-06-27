package lang.wrapper.Test01;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String [] strArr = new String[num];
        int [] intArr = new int[26];

        for(int i = 0; i < num; i++){
            strArr[i] = sc.next();
        }

        for(int i = 0; i < num; i++){
            int t = (int)Math.pow(10, strArr[i].length() - 1);

            for(int j = 0; j < strArr[i].length(); j++){
                intArr[(int)strArr[i].charAt(j) - 65] += t;
                t /= 10;
            }
        }

        Arrays.sort(intArr);

        int index = 9;
        int sum =0;

        for(int i = intArr.length - 1; i >= 0; i--){
            if(intArr[i] == 0){
                break;
            }
            sum += intArr[i] * index;
            index--;
        }
        System.out.println(sum);
    }
}
