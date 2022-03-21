//
//print the following pattern.
//        for  N = 4.
//              1
//             121
//            12321
//           1234321
//




import java.util.Scanner;
public class IsoscelesTriangle {
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
                System.out.print(j);
                j++;
            }
            j=1;
            while(j<=i-1){
                System.out.print(i-j);
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
