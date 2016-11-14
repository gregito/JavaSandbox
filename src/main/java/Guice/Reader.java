package Guice;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reader implements IReader {

    private String text;
    private List<String> words;

    @Inject
    public Reader(String text) {
        this.text = text;
        this.words = new ArrayList<>();
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
