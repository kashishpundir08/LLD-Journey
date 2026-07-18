package phase2.solid.ocp;

public class PercentageDiscount implements DiscountStrategy{
    private double percentage;

    public PercentageDiscount(double percentage){
        this.percentage = percentage;
    }

    public double apply(double price){
        return price - (price * percentage/100);
    }
}
