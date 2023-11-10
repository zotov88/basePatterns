package patterns.creational.builder;

public class Pizza {

    private String topping1;

    private String topping2;

    private String topping3;

    private String topping4;

    public void setTopping1(String topping1) {
        this.topping1 = topping1;
    }

    public void setTopping2(String topping2) {
        this.topping2 = topping2;
    }

    public void setTopping3(String topping3) {
        this.topping3 = topping3;
    }

    public void setTopping4(String topping4) {
        this.topping4 = topping4;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping1='" + topping1 + '\'' +
                ", topping2='" + topping2 + '\'' +
                ", topping3='" + topping3 + '\'' +
                ", topping4='" + topping4 + '\'' +
                '}';
    }
}
