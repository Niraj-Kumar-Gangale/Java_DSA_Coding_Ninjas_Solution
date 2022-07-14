package lecture_and_extra.IntroductionToRecursion;

public class Factorial {

    // we will calculate  the factorial using the recursion

    // Recursion -> it says that the bigger problem solution depends on the smaller instance of same problem.
    // OR
    //              bigger problem solution depends upon the smaller problem of the similar type.

    // so solution of the  n! = n * (n-1)!
    // n!  bigger problem
    // (n-1)! smaller problem / smaller instance of same problem
    //  Both are of same type


    public static int  fact(int n ){
        // let's say we made this function.
        // so if I give it n then it will give me back n!
        // for (n-1) it will give me back the (n-1)!

        // we assumed that we got the value of n-1 !
        if(n==0){
            return 1;
        }
        int smallCase = fact(n-1);
        return n * smallCase;
    }

    public static void main(String[] args) {
        int factorialAnswer  = fact(5);
        System.out.println(factorialAnswer);
    }
}
