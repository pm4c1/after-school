package poly.sort;

public class QuickSort implements Sort{

    private String name = "QuickSort";

    @Override
    public void ascending(int[] num) {
        System.out.println(this.name + " ascending");
    }

    @Override
    public void descending(int[] num) {
        System.out.println(this.name + " descending");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}
