/*        Sum Pattern
Write a program to print triangle of user defined integers sum.
Input Format :
A single integer, N
Output Format :
Required Pattern

Constraints :
0 <= N <= 50

Sample Input 1 :
3
Sample Output 1 :
1=1
1+2=3
1+2+3=6

Sample Input 2 :
 5
Sample Output 2 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15


 */




import java.util.Scanner;
public class SumPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1,sum=0;
        while (row <= n) {
            sum +=row;
            int colomn = 1;
            while (colomn <= row) {
                System.out.print(colomn);


                if (colomn==row){
                    System.out.print("=");
                }else{
                    System.out.print("+");
                }
                colomn++;
            }

            System.out.println(sum);
            row++;
        }


        // method 1 (my solution)
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int row = 1;
//        while (row <= n) {
//
//            int colomn = 1,sum=0;
//            while (colomn <= row) {
//                System.out.print(colomn);
//                sum =sum+colomn;
//
//                if (colomn!=row){
//                    System.out.print("+");
//                }
//                colomn++;
//            }
//            System.out.print("=");
//            System.out.println(sum);
//            row++;
//        }

    }
}
