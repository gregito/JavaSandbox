package FactoryMethodUser;

import FactoryMethods.DefaultProducer;
import FactoryMethods.SpecificProducer;

public class Main {

    public static void main(String[] args) {
        DefaultProducer defaultProducer = new SpecificProducer();
        defaultProducer.taskToBeDone();
    }

}
