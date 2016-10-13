package FunctionalInterface;

@FunctionalInterface
public interface IFInterface {

    boolean isValid(String s);

    default <FV, SV extends Comparable> boolean compare(FV firstValue, SV secondValue){
        return firstValue.equals(secondValue);
    }

    default <FV, SV extends String> boolean contains(FV firstValue, SV secondValue){
        return true;
    }

}
