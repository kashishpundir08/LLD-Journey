package phase2.solid.ocp;

public class Order {
    private double price;
    private DiscountStrategy discount;

    public Order(double price, DiscountStrategy discount){
        this.price = price;
        this.discount = discount;
    }
    public double finalPrice(){
        return discount.apply(price);
    }
}