package phase2.solid.ocp;

public class BuyOneGetOneDiscount implements DiscountStrategy{
    public double apply(double price){
        return price/2;
    }
}
