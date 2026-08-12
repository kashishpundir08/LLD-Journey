package phase3.patterns.decorator;

abstract class CoffeeDecorator implements Coffee{
    private Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    public String getDescription(){
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
