package lecture_and_extra;

import javax.imageio.stream.ImageInputStreamImpl;

/**
 * Print Numbers
 * Send Feedback
 * Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.
 * Input Format :
 * Integer n
 * Output Format :
 * Numbers from 1 to n (separated by space)
 * Constraints :
 * 1 <= n <= 10000
 * Sample Input 1 :
 *  6
 * Sample Output 1 :
 * 1 2 3 4 5 6
 * Sample Input 2 :
 *  4
 * Sample Output 2 :
 * 1 2 3 4
 */

public class PrintNumber {

    // this question does not have any return type
    // let's start with basic method

    // 1] smaller solution
    //   print(n-1)
    // 2] solvig big using the small
    //   print(n-1)
    //   sout(n);
    // 3] Base case / the smallest case for which i don't need formula to calculate.
    // if (n == 1)
    // {
    //    sout(1);
    //    return;
    //  }


    // print Number function
    public static void print(int n){
        //Write your code here
        if (n==1){
            System.out.print(1+ " ");
            return;
        }
        print(n-1);
        System.out.print(n+ " ");

    }
    public static void main(String[] args) {
        print(6);
    }
}
