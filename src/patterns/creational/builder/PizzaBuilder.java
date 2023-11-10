package patterns.creational.builder;

public class PizzaBuilder {

    private final Pizza pizza = new Pizza();

    public PizzaBuilder topping1(String topping1) {
         pizza.setTopping1(topping1);
         return this;
    }

    public PizzaBuilder topping2(String topping2) {
        pizza.setTopping2(topping2);
        return this;
    }

    public PizzaBuilder topping3(String topping3) {
        pizza.setTopping3(topping3);
        return this;
    }

    public PizzaBuilder topping4(String topping4) {
        pizza.setTopping4(topping4);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
