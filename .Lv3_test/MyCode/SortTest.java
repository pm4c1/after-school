package poly.sort;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 객체화 부분 작성 1
        Sort[] sort = {new BubbleSort(), new HeapSort(), new QuickSort()};

        int[] nums = new int[5];


        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("[1] : BubbleSort");
        System.out.println("[2] : HeapSort");
        System.out.println("[3] : QuickSort");

        int choice = sc.nextInt();

        // 호출하는 부분 작성 2
        selectedSort(sort, nums, choice);

    }

    private static void selectedSort(Sort[] sort, int[] nums, int choice){
        sort = new Sort[] {new BubbleSort(), new HeapSort(), new QuickSort()};
        
        if (choice == 1) { // bubble sort
            sort[0].ascending(nums);
            sort[0].descending(nums);
            sort[0].description();
            System.out.println("BubbleSort입니다.");
        } else if (choice == 2) { // heap sort
            sort[1].ascending(nums);
            sort[1].descending(nums);
            sort[1].description();
            System.out.println("HeapSort입니다.");
        } else if (choice == 3) { // quick sort
            sort[2].ascending(nums);
            sort[2].descending(nums);
            sort[2].description();
            System.out.println("QuickSort입니다.");
        }
    }
}
