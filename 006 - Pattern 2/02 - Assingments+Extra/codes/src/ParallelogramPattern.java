/*      Parallelogram Pattern
        Send Feedback
        Write a program to print parallelogram pattern for the given N number of rows.
        For N = 4



        The dots represent spaces.
        Input Format :
        A single integer : N
        Output Format :
        Required Pattern

        Constraints :
        0 <= N <= 50

        Sample Input 1 :
        3
        Sample Output 1 :
        ***
         ***
          ***

        Sample Input 2 :
        5
        Sample Output 2 :
        *****
         *****
          *****
           *****
            *****
*/
import java.util.Scanner;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        while(row<=n){

            int coloumn = 1;
            while(coloumn<=row-1){
                System.out.print(" ");
                coloumn++;
            }
            coloumn=1;
            while (coloumn<=n){
                System.out.print("*");
                coloumn++;
            }



            System.out.println();
            row++;
        }
    }
}
