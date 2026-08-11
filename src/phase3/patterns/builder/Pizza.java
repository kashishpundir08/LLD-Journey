package phase3.patterns.builder;

public class Pizza {
    String size;
    String crust;
    boolean cheese;
    String topping;


    private Pizza(Builder builder){
        this.size = builder.size;
        this.crust = builder.crust;
        this.cheese = builder.cheese;
        this.topping = builder.topping;
    }
    @Override
    public String  toString(){
        return "Pizza: Size = " + size + " crust = " + crust + " cheese = " +cheese + " toppings = " + topping;
    }
    public static class Builder{
        String size;
        String crust;
        boolean cheese;
        String topping;

        public Builder size(String size){
            this.size = size;
            return this;
        }

        public Builder crust(String crust){
            this.crust = crust;
            return  this;
        }

        public Builder cheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder topping(String topping){
            this.topping = topping;
            return  this;
        }

        public Pizza build(){
            return new Pizza(this);
        }

    }

}
