package phase1.abstraction;

abstract class Shape {
    abstract double area();

    public void describe(){
        System.out.println("This shape has area : " + area());
    }
}
