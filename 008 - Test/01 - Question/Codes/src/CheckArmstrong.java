/**
 * Check Armstrong
 * Send Feedback
 * Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
 * An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
 * For example,
 * 371, as 3^3 + 7^3 + 1^3 = 371
 * 1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
 * Input Format :
 * Integer n
 * Output Format :
 * true or false
 * Sample Input 1 :
 * 1
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * 103
 * Sample Output 2 :
 * false
 */
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // scan the number
        int n = scan.nextInt();
        // length of number
        int num = n;
        int length =0;
        while(num>0){
            num /=10;
            length++;
        }
        int num2= n;
        int newNumber = 0;
        while(num2>0){
            int rem = num2%10;
            newNumber += (int)Math.pow(rem, length);
            num2/=10;
        }
        if(newNumber==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}
