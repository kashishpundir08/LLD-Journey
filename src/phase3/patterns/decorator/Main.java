package phase3.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee c = new SimpleCoffee();
        c = new MilkDecorator(c);
        System.out.println(c.getDescription() + " = " + c.getCost());
        c = new SugarDecorator(c);
        System.out.println(c.getDescription() + " = " + c.getCost());
        c = new MilkDecorator(c);
        System.out.println(c.getDescription() + " = " + c.getCost());

    }
}
