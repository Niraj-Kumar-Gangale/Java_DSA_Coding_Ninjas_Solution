/**
 * Zeros and Stars Pattern
 * Send Feedback
 * Print the following pattern
 * Pattern for N = 4
 * *000*000*
 * 0*00*00*0
 * 00*0*0*00
 * 000***000
 * Input Format :
 * N (Total no. of rows)
 * Output Format :
 * Pattern in N lines
 * Sample Input 1 :
 * 3
 * Sample Output 1 :
 * *00*00*
 * 0*0*0*0
 * 00***00
 * Sample Input 2 :
 * 5
 * Sample Output 2 :
 * *0000*0000*
 * 0*000*000*0
 * 00*00*00*00
 * 000*0*0*000
 * 0000***0000
 */

import java.util.Scanner;
public class ZerosAndStarPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // number of rows
        for (int i = 1; i<=n; i++){
            // number of column
            for (int j = 1;j<=(2*n+1);j++){
                // What to print
                if ((i==j)||(j==(2*n+2-i))){
                    System.out.print("*");
                }else if(j==(n+1)){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
