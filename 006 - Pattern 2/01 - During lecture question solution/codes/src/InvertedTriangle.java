/*
 print the following pattern.
        ****
         ***
          **
           *
*/
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while(i<=n){

            int j = 1;
            while(j<=(i-1)){
                System.out.print(" ");
                j++;
            }
            j =1;
            while(j<=(n+1-i)){
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }

    }
}
