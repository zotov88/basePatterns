package patterns.structural.composite;

public class AppComposite {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Triangle triangle = new Triangle();

        Circle circle3 = new Circle();
        Square square = new Square();

        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();
        Composite composite3 = new Composite();

        composite2.addComponent(circle1);
        composite2.addComponent(circle2);
        composite2.addComponent(triangle);

        composite3.addComponent(circle3);
        composite3.addComponent(square);

        composite1.addComponent(composite2);
        composite1.addComponent(composite3);

        composite.addComponent(composite1);

        composite.draw();

    }
}
