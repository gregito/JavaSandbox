package Guice;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader implements IRead{

    private Printer printer;
    private List<String> words;
    private String text;

    @Inject
    public Reader(String text) {
        this.words = new ArrayList<>();
        this.text = text;
    }


    public List<String> words(String text){
        Collections.addAll(words, text.split(" "));
        return words;
    }

    public List<String> words(){
        Collections.addAll(words, text.split(" "));
        return words;
    }

    public void printWords(){
        words.forEach(System.out::println);
    }

    public void printWords(List<String> words){
        words.forEach(System.out::println);
    }

}
