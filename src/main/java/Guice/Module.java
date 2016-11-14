package Guice;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule{

    @Override
    protected void configure() {
        bind(IReader.class).to(Reader.class);
        bind(IPrinter.class).to(Printer.class);
    }

}
