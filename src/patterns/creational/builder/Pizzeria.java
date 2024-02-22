package patterns.creational.builder;

public class Pizzeria {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBuilder()
                .topping1("cheese")
                .topping2("peperoni")
                .topping4("ananas")
                .build();

        System.out.println(pizza);
    }
}
