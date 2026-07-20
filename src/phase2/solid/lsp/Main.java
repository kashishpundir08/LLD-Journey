package phase2.solid.lsp;

public class Main {
    public static void main(String[] args) {
//        printArea(new Rectangle(2,3));
//        printArea(new Square(4));
        Rectangle rect = new Rectangle(10, 5);
        Square sq = new Square(5);
        System.out.println(rect.area());
        System.out.println(sq.area());


    }
//    public static void printArea(Rectangle rectangle){
//        rectangle.setWidth(5);
//        rectangle.setHeight(10);
//        System.out.println(rectangle.area());
//    }
}
