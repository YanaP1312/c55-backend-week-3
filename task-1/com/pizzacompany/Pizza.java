package pizzacompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Pizza {
    Size size;
    List<Topping> toppings = new ArrayList<>();

    Pizza(Size size, List<Topping> toppings){
        this.size = size;
        this.toppings = toppings;
    }

    public double getTotalPrice(){
        double toppingsPrice = toppings.stream().filter(topping -> topping != null).mapToDouble(Topping::getPrice).sum();


        return size.getBasePrice() + toppingsPrice;
    }

    @Override
    public String toString(){
        return size + " pizza with " + toppings + "- €" + String.format("%.2f", getTotalPrice());
    }

}
