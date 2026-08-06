package phase3.patterns.strategy;

public class SortContext {
    private SortStrategy strategy;

    public SortContext(){
    }

    public SortContext(SortStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(SortStrategy strategy){
        this.strategy = strategy;
    }
    public void sort(int[] arr){
        strategy.sort(arr);
    }
}
