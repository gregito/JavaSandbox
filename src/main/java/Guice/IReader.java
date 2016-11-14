package Guice;

import java.util.List;

public interface IReader {

    List<String> words(String text);

    List<String> words();

    void printWords();

    void printWords(List<String> words);

}
