package FunctionWithVoidReturnType;

public class NumberDivision {
    // difference between the normal function and the void function


    // normal function
    // [return should have the same data type as defined during creation]
    // (i.e Integer)
    public static int numberDivision (int a, int b){
        // if denominator is zero
        if(b==0){
            return Integer.MIN_VALUE;
        }
        return a/b;
    }

    // void function
    // [no need to think of return data type]
    // void generally don't use return statement,
    // And when they USE - > { A SIMPLE RETURN WILL DO THE MAGIC }
    public static void printNumberDivision (int a, int b){
        // if denominator is zero
        if(b==0){
            System.out.println("Calculation not possible");
            return;
        }
        System.out.println(a/b);
    }
    // main function
    public static void main(String[] args) {
        int a = 455;
        int b = 67;

        // using normal function
        System.out.println(numberDivision(a,b));

        //using void function
        printNumberDivision(a,b);

    }
}
