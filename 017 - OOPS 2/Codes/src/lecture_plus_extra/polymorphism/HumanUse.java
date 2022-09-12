package lecture_plus_extra.polymorphism;

public class HumanUse {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[45];
        System.out.println("runTime don't stop the program");
        System.out.println(arr[56]);
        System.out.println("runTime don't stop the program");
        getDenominator(0);
        /*
        Exception in thread "main" java.lang.Exception:  Denominator zero
         */

    }

    public static void getDenominator(int h) throws Exception{
        if (h==0){
            Exception e = new Exception(" Denominator zero");
            throw e;
        }
    }
}
