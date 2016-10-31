package Guice;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule{

    @Override
    protected void configure() {
        bind(IRead.class).to(Reader.class);
        bind(IPrint.class).to(Printer.class);
    }

}
