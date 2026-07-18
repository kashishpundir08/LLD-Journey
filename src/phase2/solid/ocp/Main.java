package phase2.solid.ocp;

public class Main {
    public static void main(String[] args) {
        FlatDiscount fd = new FlatDiscount(20);
        Order o1 = new Order(2000, fd);
        Order o2 = new Order(2000, new PercentageDiscount(20));
        Order o3 = new Order(2000, new SeasonalDiscount(20));
        Order o4 = new Order(2000, new BuyOneGetOneDiscount());
        System.out.println(o1.finalPrice());
        System.out.println(o2.finalPrice());
        System.out.println(o3.finalPrice());
        System.out.println(o4.finalPrice());
    }

}
