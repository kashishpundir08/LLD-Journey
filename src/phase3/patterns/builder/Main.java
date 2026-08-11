package phase3.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza.Builder()
                .cheese(true).
                crust("thin").
                build();
        System.out.println(p1);
        Pizza p2 = new Pizza.Builder()
                .size("Regular")
                .topping("Paneer")
                .cheese(true)
                .crust("thin")
                .build();
        System.out.println(p2);
    }
}
