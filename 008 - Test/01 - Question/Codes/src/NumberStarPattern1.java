/**
 * Number Star pattern 1
 * Send Feedback
 * Print the following pattern for given number of rows.
 * Input format :
 * Integer N (Total number of rows)
 * Output Format :
 * Pattern in N lines
 * Sample Input :
 *    5
 * Sample Output :
 *  5432*
 *  543*1
 *  54*21
 *  5*321
 *  *4321
 */
import java.util.Scanner;
public class NumberStarPattern1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // number of rows
        for (int i = 1 ; i<=n; i++){
            // number of column
            for (int j = 1; j<=n; j++){
                // what  to print
                if(n-i+1==j){
                    System.out.print("*");
                    continue;
                }
                System.out.print(n-j+1);

            }
            System.out.println();
        }
    }
}
