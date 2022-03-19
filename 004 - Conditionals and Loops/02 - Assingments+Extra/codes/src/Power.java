import java.util.Scanner;
public class Power {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        if (n==0&&x==0){
            System.out.println(1);
            return;
        }

        int i =1;
        int power =1;
        while(i<=n){
            power = power*x;
            i=i+1;
        }
        System.out.println(power);


    }
}
