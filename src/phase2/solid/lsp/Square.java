package phase2.solid.lsp;

public class Square implements Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }

//    public void setWidth(double side){
//        super.setWidth(side);
//        super.setHeight(side);
//    }
//
//    public void setHeight(double side){
//        super.setHeight(side);
//        super.setWidth(side);
//    }

    @Override
    public double area(){
        return this.side*this.side;
    }
}
