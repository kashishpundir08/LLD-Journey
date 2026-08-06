package phase3.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        SortContext s1 = new SortContext(new BubbleSort());
        SortContext s2 = new SortContext();
        s2.setStrategy(new QuickSort());
        int[] arr1 = {1,6,7,9,3,6};
        s1.sort(arr1);
        s2.sort(arr1);

    }
}
