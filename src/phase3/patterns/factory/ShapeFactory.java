package phase3.patterns.factory;

public class ShapeFactory {
    public static Shape getShape(String type){
        if(type.equals("circle")){
            return new Circle();
        }else if(type.equals("rectangle")){
            return new Rectangle();
        }else if(type.equals("triangle")){
            return new Triangle();
        }else {
            System.out.println("Unknown shape");
            return  null;
        }
    }
}
