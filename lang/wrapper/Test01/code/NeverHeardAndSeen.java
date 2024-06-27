package lang.wrapper.Test01.code;

import java.util.*;

public class NeverHeardAndSeen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 듣지 못하는 사람의 수
        int M = sc.nextInt(); // 보지 못하는 사람의 수

        Set<String> nohear = new HashSet<>();
        for (int i = 0; i < N; i++) {
            nohear.add(sc.nextLine()); // 듣지 못하는 사람의 이름을 hashset 에 추가
        }

        // 듣지 못하고 보지 못하는 사람들의 이름을 list 에 저장
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = sc.next();
            if (nohear.contains(name)){ // 입력 받은 이름이 set 에 있는지 확인
                ans.add(name);  // set 에 이름이 잇으면 이는 듣지도 못하고 보지도 못하는 사람이다.
            }
        }

        // 이름 리스트를 오름차순으로 정렬
        Collections.sort(ans);
        System.out.println(ans.size());
        for (String name : ans){
            System.out.println(name);
        }
    }
}
