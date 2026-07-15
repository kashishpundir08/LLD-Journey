package phase1.abstraction;

public class Circle extends Shape implements Printable{ // ebstract, interface implements
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
    public void print(){  // interface method call have to declare here
        System.out.println("This is circle area "+ area() + " circle with radius " + radius);
    }

}
