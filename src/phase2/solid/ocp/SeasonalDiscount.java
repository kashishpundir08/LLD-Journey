package phase2.solid.ocp;

public class SeasonalDiscount implements DiscountStrategy {
    private double multiplier;

    public SeasonalDiscount(double multiplier){
        this.multiplier = multiplier;
    }

    public double apply(double price){
        return price - ( price * multiplier / 100);
    }
}
