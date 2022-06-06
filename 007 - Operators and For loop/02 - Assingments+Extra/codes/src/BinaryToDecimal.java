import java.util.Scanner;

/**
 * Binary to decimal
 * Send Feedback
 * Given a binary number as an integer N, convert it into decimal and print.
 * Input format :
 * An integer N in the Binary Format
 * Output format :
 * Corresponding Decimal number (as integer)
 * Constraints :
 * 0 <= N <= 10^9
 * Sample Input 1 :
 * 1100
 * Sample Output 1 :
 * 12
 * Sample Input 2 :
 * 111
 * Sample Output 2 :
 * 7
 */

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int decimalValue=0;
        int i = 0;
        // don't waste the original value make aa copy to use it
        int n = number;
        while(n>0){
            int remainder = n%10;
            n=n/10;
            decimalValue = (int) (remainder * Math.pow(2,i))+ decimalValue;
            i++;
        }
        System.out.println(decimalValue);


    }

}
