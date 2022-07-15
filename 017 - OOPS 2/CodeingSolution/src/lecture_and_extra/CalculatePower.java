package lecture_and_extra;

/**
 * Calculate Power
 * Send Feedback
 * Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
 * Do this recursively.
 * Input format :
 * Two integers x and n (separated by space)
 * Output Format :
 * x^n (i.e. x raise to the power n)
 * Constraints :
 * 0 <= x <= 30
 * 0 <= n <= 30
 * Sample Input 1 :
 *  3 4
 * Sample Output 1 :
 * 81
 * Sample Input 2 :
 *  2 5
 * Sample Output 2 :
 * 32
 */

public class CalculatePower {

    // we want to calculate the power
    // use the standard method
    // 3^4 = 3* 3^3
    // 1] smallest method 3^3.
    // 2] solve big problem using the smallest problem.
    // 3] base case / the smallest case for which i don't need formula to calculate.

    public static int power(int x , int n){
        // we need to handle edge case.
        // our code automatically handles edge cases. you can try by putting value.
        /*
        if(x == 0 && n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
         */
        // case for which i don't need to solve the problem
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(3,3));
        System.out.println(power(0,3));
        System.out.println(power(0,0));
    }
}
