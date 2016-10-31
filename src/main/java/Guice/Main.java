package Guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    private static Injector injector = null;
    private static IPrint print = null;
    private static IRead read = null;
    private static final String TEXT = "Lorem ipsum dolor sit amet, vestibulum nibh turpis sapien ac, " +
            "lorem habitant venenatis gravida arcu, integer at dignissim.";
    static {
        injector = Guice.createInjector(new Module());
        print = injector.getInstance(IPrint.class);
        read = injector.getInstance(IRead.class);
    }

    public static void main(String[] args) {
        print.print("Szöveg");
        System.out.println();
        read.printWords(read.words(TEXT));
    }

}
