package pizzacompany;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();

        order1.addPizza(new Pizza(Size.SMALL, List.of(Topping.PEPPERONI, Topping.OLIVES)));
        order1.addPizza(new Pizza(Size.MEDIUM, List.of(Topping.MUSHROOMS, Topping.CHEESE, Topping.PINEAPPLE)));
        order1.addPizza(new Pizza(Size.LARGE, List.of(Topping.MUSHROOMS, Topping.CHEESE, Topping.PEPPERONI, Topping.OLIVES, Topping.PINEAPPLE)));

        order1.printReceipt();
    }
}