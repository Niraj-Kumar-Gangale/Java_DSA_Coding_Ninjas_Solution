package assignment;

/**
 * Sum of digits (recursive)
 * Send Feedback
 * Write a recursive function that returns the sum of the digits of a given integer.
 * Input format :
 * Integer N
 * Output format :
 * Sum of digits of N
 * Constraints :
 * 0 <= N <= 10^9
 * Sample Input 1 :
 * 12345
 * Sample Output 1 :
 * 15
 * Sample Input 2 :
 * 9
 * Sample Output 2 :
 * 9
 */

public class SumOfDigits {

    // a very easy question

    // using the general method of approach
    public static int sumOfDigits (int input){

        // base case
        if (input == 0){
            return 0;
        }

        // small problem
        int smallAns = sumOfDigits(input/10);

        // solving the n=big using the small
        return smallAns + input%10;
    }

    // using the better method and forward the value of the sum
    public static int sumOfDigits(int input, int sum){
        // base case
        if (input==0){
            return sum;
        }

        // using the sum value that is forwarded
        sum = sum + input%10;

        return sumOfDigits(input/10, sum);
    }

    // main
    public static void main(String[] args) {
        int num = 236725;
        System.out.println(sumOfDigits(num));
        System.out.println(sumOfDigits(num,0));
    }
}
