package FactoryMethods;

public abstract class DefaultProducer {

    public void taskToBeDone() {
        Deliverable deliverable = factoryMethodPattern();
    }

    protected abstract Deliverable factoryMethodPattern();

}
