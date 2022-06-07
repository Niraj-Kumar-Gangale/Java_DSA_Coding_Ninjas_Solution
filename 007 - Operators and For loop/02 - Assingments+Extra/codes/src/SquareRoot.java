/**
 * Square Root (Integral)
 * Send Feedback
 * Given a number N, find its square root.
 * You need to find and print only the integral part of square root of N.
 * For eg. if number given is 18, answer is 4.
 * Input format :
 * Integer N
 * Output Format :
 * Square root of N (integer part only)
 * Constraints :
 * 0 <= N <= 10^8
 * Sample Input 1 :
 * 10
 * Sample Output 1 :
 * 3
 * Sample Input 2 :
 * 4
 * Sample Output 2 :
 * 2
 */
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n =scan.nextInt();
        int i = 0;
        // method 1
//        while(true){
//            if (n>=i*i&&n< (long) (i + 1) *(i+1)){
//                System.out.println(i);
//                break;
//            }
//            i++;
//        }
        // method 2
        while(n>=i*i){
            i++;
        }
        System.out.println(i-1);
    }
}
