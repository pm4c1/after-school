package lang.wrapper.Test01;

import java.util.*;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] a = new String[n];
        String[] b = new String[m];

        // 듣도 못한 사람
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        // 보도 못한 사람
        for (int i = 0; i < m; i++) {
            b[i] = sc.next();
        }

        for (String x : solution(a, b)) {
            System.out.println(x);
        }
    }
    public static ArrayList<String> solution(String[] a , String [] b) {
        ArrayList<String> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        // 많은 데이터를 검색하기 위해 HashMap

        //듣도 못한사람 넣기
        for (String x : a) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        //보도 못한 사람 값 중복체크
        for (String x : b) {
            map.put(x, map.getOrDefault(x, 0) -1);
            // 중복된 String 제거
        }
        int cnt = 0;
        for (String key : map.keySet()) {
            if (map.get(key) == 0) {
                ans.add(key);
                cnt++; // 갯수세기
            }
        }
        ans.add(String.valueOf(cnt));
        Collections.sort(ans); // 정렬
        return ans;
    }
}
