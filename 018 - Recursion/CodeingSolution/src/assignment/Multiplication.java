package assignment;


/**
 * Multiplication (Recursive)
 * Send Feedback
 * Given two integers M & N, calculate and return their multiplication using recursion.
 * You can only use subtraction and addition for your calculation. No other operators are allowed.
 * Input format :
 * Line 1 : Integer M
 * Line 2 : Integer N
 * Output format :
 * M x N
 * Constraints :
 * 0 <= M <= 1000
 * 0 <= N <= 1000
 * Sample Input 1 :
 * 3
 * 5
 * Sample Output 1 :
 * 15
 * Sample Input 2 :
 * 4
 * 0
 * Sample Output 2 :
 * 0
 */
public class Multiplication {
    // we use the general way of solving the recursion problem

    // 1] small problem
    /*
        3*5 = 3 + (3*4)
        so, our smallProblem  = multiplyTwoInteger(m,n-1);
     */
    // 2] solving the big problem using the small
    /*
        int ans = m + multiplyTwoInteger(m,n-1);
     */
    // 3] Base case
    /*
        if(n==0){
          return 0 ;
        }
     */
    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if (n==0){
            return 0;
        }

        return m+multiplyTwoIntegers(m,n-1);

    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(3,5));
    }
}
