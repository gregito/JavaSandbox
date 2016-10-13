package FunctionalInterface;

public class FInterfaceImpl implements IFInterface {

    private String sampleXML = "<someXmlTag>content</someXmlTag>";

    public boolean isValid(String s) {
        System.out.println(compare("a", "b"));
        return s.matches("(?s).*?<(\\S+?)[^>]*>.*?</\\1>.*");
    }



}
