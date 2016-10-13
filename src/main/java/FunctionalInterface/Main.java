package FunctionalInterface;

public class Main {
    static String sampleXML1;
    static String xmlRegex;

    static {
        sampleXML1 = "<someXmlTag>content</someXmlTag>";
        xmlRegex = "(?s).*?<(\\S+?)[^>]*>.*?</\\1>.*";
    }

    public static void main(String[] args) {
        IFInterface ifInterf = new FInterfaceImpl();

        System.out.println(ifInterf.compare("a", "b"));
        IFInterface ifi = xml -> xml.matches(xmlRegex);
        System.out.println(ifi.isValid(sampleXML1));


        IProcessor stringIProcessor = str -> str.length();
        int length = stringIProcessor.getStringLength(sampleXML1);
        System.out.println(length);
    }

}
