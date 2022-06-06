import java.util.Scanner;
/**
 * All Prime Numbers
 * Send Feedback
 * Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
 * Print the prime numbers in different lines.
 * Input Format :
 * Integer N
 * Output Format :
 * Prime numbers in different lines
 * Constraints :
 * 1 <= N <= 100
 * Sample Input 1:
 * 9
 * Sample Output 1:
 * 2
 * 3
 * 5
 * 7
 * Sample Input 2:
 * 20
 * Sample Output 2:
 * 2
 * 3
 * 5
 * 7
 * 11
 * 13
 * 17
 * 19
 */

public class AllPrimeNumber {
    public static void main(String[] args) {

        // First method to solve using boolean
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        // for loop to iterate through the values form 2 to N.
        for (int i = 2; i<=number; i++){
            //----------------------------------------------
            //  now individually check the iteration value
            //  for the condition of prime or not.

            int divisor = 2;
            boolean isPrime = true;
            while(divisor < i){
                if(i%divisor == 0){
                    isPrime = false;
                    break;
                }
                divisor++;
            }
            if (isPrime)
                System.out.println(i);
            //----------------------------------------------
        }
    }
    //-----------------------------------------------------------------
    // creating a function for verification of given number for prime
//    public static boolean isPrimeNum (int n){
//        int counter = 2;
//        while(counter < n){
//            if(n%counter == 0){
//                return false;
//            }
//            counter++;
//        }
//        return true;
//    }
    //------------------------------------------------------------------
}
