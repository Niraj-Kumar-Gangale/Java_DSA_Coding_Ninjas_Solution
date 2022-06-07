import java.util.Scanner;

/**
 * Decimal to Binary
 * Send Feedback
 * Given a decimal number (integer N), convert it into binary and print.
 * The binary number should be in the form of an integer.
 * Note: The given input number could be large,
 * so the corresponding binary number can exceed the integer range.
 * So you may want to take the answer as long for CPP and Java.
 *
 *
 * Note for C++ coders: Do not use the inbuilt implementation of "pow" function.
 * The implementation of that function is done for 'double's,
 * and it may fail when used for 'int's, 'long's, or 'long long's.
 * Implement your own "pow" function to work for non-float data types.
 *
 *
 * Input format :
 * Integer N
 * Output format :
 * Corresponding Binary number (long)
 * Constraints :
 * 0 <= N <= 10^5
 * Sample Input 1 :
 * 12
 * Sample Output 1 :
 * 1100
 * Sample Input 2 :
 * 7
 * Sample Output 2 :
 * 111
 */
public class DecimalTOBinary {
    public static void main(String[] args) {
        //START ----------------------------
        Scanner scan = new Scanner(System.in);
        // scan the input decimal value in decimalNo variable
        long decimalNo = scan.nextInt();
        // define binaryNO variable
        long binaryNo = 0;
        // define i for power calculation
        long i = 0;
        // define n to keep original decimalNo safe
        long n = decimalNo;
        while(n>0){
            // remainder
            long rem = n%2;
            // decrement
            n = n/2;
            // binary number from decimal formula
            binaryNo = binaryNo + rem*(long)Math.pow(10,i);
            i++;
        }
        System.out.println(binaryNo);
        // END-------------------------------

        // without using MAth.pow
        /*
        int pow = 1;
        while(){
        binaryNo = binaryNo + rem * pow;
        pow= pow*10;
        }
        */
    }
}
