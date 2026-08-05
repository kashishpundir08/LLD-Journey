package phase3.patterns.factory;

public class Main {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.getShape("circle");
        Shape s2 = ShapeFactory.getShape("triangle");
        Shape s4 = ShapeFactory.getShape("abc");
        Shape s3 = ShapeFactory.getShape("rectangle");
        s1.draw();
        s2.draw();
        s3.draw();
//        s4.draw();  // NULLPOINTEREXCEPTION
    }
}