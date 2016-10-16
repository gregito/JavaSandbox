package Patterns.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        if (shape.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        if (shape.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

}
