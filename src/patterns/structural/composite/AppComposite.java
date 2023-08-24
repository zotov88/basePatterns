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

        composite1.addComponent(circle1);
        composite1.addComponent(circle2);
        composite1.addComponent(triangle);

        composite2.addComponent(circle3);
        composite2.addComponent(square);

        composite.addComponent(composite1);
        composite.addComponent(composite2);

        composite.draw();

    }
}
