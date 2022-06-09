package FunctionOverloading;

public class Code {

    // method overloading happens in two ways
    // 1] by changing the number of parameter
    // 2] by changing the parameter type
    // sum of two integer
    public static int Sum(int a, int b){
        return a+b;
    }
    // sum of three
    public static int Sum(int a, int b, int c){
        return a+b+c;
    }
    // sum of two double
    public static double Sum(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(Sum(2,3));
        System.out.println(Sum(2.0,3.2));
        System.out.println(Sum(1,2,4));

    }

}
