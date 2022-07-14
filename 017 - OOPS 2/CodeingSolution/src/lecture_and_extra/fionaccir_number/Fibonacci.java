package lecture_and_extra.fionaccir_number;

public class Fibonacci {

    // here we try to solve the fibonacci using the recursion

    // before making the function please spell the definition for the recursion
    // solution of the bigger problem depends on the solutions [ PLURAL ] of smaller problems [ PLURALS ] of similar nature


    // here in fibonacci series we have formula
    // f(n) = f(n-1) + f(n-2);
    // so solution of the bigger problem depends on the solution of smaller problems of similar nature

    // 1] smaller problems
    // f(n-1) + f(n-2)
    // 2] solving the big using the smaller problems of the similar nature
    //  f(n) = f(n-1) + f(n-2)
    // 3] base case

//    if ( n==0 ){
//        return 0;
//    }

    // our base case give us betrayal and this can be found out using the DRY RUN
    // so a new base case is required that will be

//
//    if (n == 0 || n == 1){
//        return n;
//    }


    // fibonacci function
     public static int fibonacci(int n){

         if (n==0 || n==1){
             return n;
         }

         return fibonacci(n-1)+ fibonacci(n-2);
     }


    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
