package pizzacompany;

public enum Size {
    SMALL(6.00),
    MEDIUM(9.00),
    LARGE(12.00);

    private final double price;

    Size(double price){
        this.price = price;
    }

    public double getBasePrice(){
        return price;
    }
}
