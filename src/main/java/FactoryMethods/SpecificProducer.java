package FactoryMethods;

public class SpecificProducer extends DefaultProducer{

    protected Deliverable factoryMethodPattern() {
        return new SpecificDeliverable();
    }
}
