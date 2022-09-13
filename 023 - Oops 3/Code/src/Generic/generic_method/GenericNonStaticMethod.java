package Generic.generic_method;

public class GenericNonStaticMethod {

    public <T> void printArray(T[] array){
        for (T t : array) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GenericNonStaticMethod gn  = new GenericNonStaticMethod();
        Integer[] a = new Integer[]{1,5,7,9};
        gn.printArray(a);
    }

}
