package patterns.structural.composite;


import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    private final List<Shape> components = new ArrayList<>();

    public void addComponent(Shape component) {
        components.add(component);
    }

    public void remove(Shape component) {
        components.remove(component);
    }

    @Override
    public void draw() {
        for (Shape component : components) {
            component.draw();
        }
    }
}
