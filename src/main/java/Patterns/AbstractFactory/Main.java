package Patterns.AbstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("Circle");

        shape1.drav();
    }

}
