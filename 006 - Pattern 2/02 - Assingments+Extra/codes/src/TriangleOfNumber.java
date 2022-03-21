/*
Print the following pattern for the given number of rows.
        Pattern for N = 4



        The dots represent spaces.

*/
import java.util.Scanner;
public class TriangleOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i<=n){

            int j = 1;
            while(j<=(n-i)){
                System.out.print(" ");
                j++;
            }
            j =1;

            while(j<=i){
                System.out.print(i+j-1);
                j++;
            }
            j=1;
            while(j<=i-1){
                System.out.print(2*i-j-1);
                j++;
            }
            System.out.println();
            i++;

        }

    }
}
