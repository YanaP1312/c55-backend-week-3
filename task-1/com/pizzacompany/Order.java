package pizzacompany;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    List<Pizza> pizzas = new ArrayList<>();

    Order(){};

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

    public double getTotalPrice(){
        return pizzas.stream().filter(Objects::nonNull).mapToDouble(Pizza::getTotalPrice).sum();
    }

    public void printReceipt(){
        System.out.println("=== Receipt ===");
        pizzas.stream().filter(Objects::nonNull).forEach(pizza -> System.out.println(pizza.toString()));
        System.out.println("---------------");
        System.out.println("Total: " +getTotalPrice());
    }

}
