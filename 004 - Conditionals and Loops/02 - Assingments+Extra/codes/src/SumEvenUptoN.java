import java.util.Scanner;

public class SumEvenUptoN {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        int i = 0;
        while(i<=n){
            sum +=i;
            i+=2;
        }
        System.out.println(sum);

    }

}
