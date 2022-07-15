package lecture_and_extra;

/**
 * Number of Digits
 * Send Feedback
 * Given the number 'n', find out and return the number of digits present in a number recursively.
 * Input Format :
 * Integer n
 * Output Format :
 * Count of digits
 * Constraints :
 * 1 <= n <= 10^6
 * Sample Input 1 :
 *  156
 * Sample Output 1 :
 * 3
 * Sample Input 2 :
 *  7
 * Sample Output 2 :
 * 1
 */

public class NumberOfDigits {

    // we have to count the number of the digits in the given number
    // for example -> 12354
    // total number of the digits  is 6
    // generally the way we calculate thr number of the digits are
    // count = 0 ;
    // while (n > 0){
    //    n = n/10;
    //    count++;
    // }

    // so using recursion
    // 1] smaller problem
    // count(n/10)
    // 2] bigger problem return
    // 1 + count(n/10)
    // 3] base case // case for which i do not need formula
    // if (n==0){
    //   return 0;
    // }

    // count function
    public static int count(int n){
        if (n==0){
            return 0;
        }
        return 1+count(n/10);
    }

    public static void main(String[] args) {
        System.out.println(count(16464));
    }

}
