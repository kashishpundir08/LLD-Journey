package phase2.solid.ocp;

public class FlatDiscount implements DiscountStrategy{
    private double amount;

    public FlatDiscount(double amount){
        this.amount = amount;
    }
    @Override
    public double apply(double price){
        return price - amount;
    }

}
