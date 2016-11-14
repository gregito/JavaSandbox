package Guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.apache.logging.log4j.*;

public class Main {

    private static Injector injector = null;
    private static Logger logger = null;
    private static IPrinter print = null;
    private static IReader read = null;
    private static final String TEXT = "Lorem ipsum dolor sit amet, vestibulum nibh turpis sapien ac, " +
            "lorem habitant venenatis gravida arcu, integer at dignissim.";
    static {
        injector = Guice.createInjector(new Module());
        print = injector.getInstance(IPrinter.class);
        logger = LogManager.getLogger(Main.class);
        read = injector.getInstance(IReader.class);
    }

    public static void main(String[] args) {
        logger.info("The program has started.");
        print.print("Szöveg");
        System.out.println();
        read.printWords(read.words(TEXT));
        logger.info("The program has terminated.");
    }

}
