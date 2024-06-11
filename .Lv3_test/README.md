## 다형성 테스트

---

### 예제 시나리오

- **정렬 알고리즘이 구현해야 할 내용을 Sort 인터페이스에 정의한다.**
- **인터페이스에는 정수형 배열을 인수로 받아서 오름차순으로 정렬하는 ascending() 메서드와
내림차순으로 정렬하는 descending() 메서드가 있다.**
- **알고리즘에 대한 설명을 출력하는 description() 메서드도 존재한다.**

![Untitled]([https://prod-files-secure.s3.us-west-2.amazonaws.com/939ce19d-66ea-446c-87fc-d3eb89fc1b28/08493e45-28d3-47dd-92f5-be249c3c01aa/Untitled.png](https://file.notion.so/f/f/939ce19d-66ea-446c-87fc-d3eb89fc1b28/08493e45-28d3-47dd-92f5-be249c3c01aa/Untitled.png?id=fde1605c-823d-4535-84ec-23458c6d9848&table=block&spaceId=939ce19d-66ea-446c-87fc-d3eb89fc1b28&expirationTimestamp=1718186400000&signature=wcMGBcOiPSH98oyJ2hUsQIKO3S5djAKiufgWyK15JJw&downloadName=Untitled.png))

- **정렬 기능은 세 클래스가 구현했다.**
    - **실제 숫자를 정렬하지 않고 설명만 출력했다.**

1. **Sort 인터페이스를 구현하라.**
2. **인터페이스를 받아 BubbleSort, HeapSort, QuickSort를 구현하라.**
    1. **아래 출려과면을 참고하여 클래스를 구현할 것!!**
    2. **출력화면**
    
    ```java
    정렬 방식을 선택하세요.
    [1] : BubbleSort
    [2] : HeapSort
    [3] : QuickSort
    3
    QuickSort ascending
    QuickSort descending
    숫자를 정렬하는 알고리즘입니다.
    QuickSort입니다.
    ```
    
3. **위의 출력화면을 보고 아래 main 함수를 완성하라.**

```java
package poly.sort;

import java.util.Scanner;

public class SortTest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 객체화 부분 작성 1

        int[] nums = new int[5];

        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        // 호출하는 부분 작성 2
    }

    private static void selectedSort(/* 파라미터 작성 3 */){

                // 메서드 본문 작성 4
    }
}
```
