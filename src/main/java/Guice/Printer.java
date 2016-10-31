package Guice;

import com.google.inject.Inject;

public class Printer implements IPrint{

    private Reader reader;
    private String separator;

    @Inject
    public Printer() {
        separator = "---------------------";
    }

    public void print(String message){
        System.out.println(separator);
        System.out.println(message);
        System.out.println(separator);
    }

}
