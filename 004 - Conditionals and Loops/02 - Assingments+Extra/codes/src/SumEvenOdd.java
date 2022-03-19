import java.util.Scanner;
public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rem ;
        int i =1;
        int sumEven =0, sumOdd = 0;

        while(n>0){
            rem = n%10;
            n = n/10;
            if (rem%2==0){
                sumEven+=rem;
            }
            else{
                sumOdd+=rem;
            }
        }
        System.out.println(sumEven+ " " +sumOdd);
    }
}
