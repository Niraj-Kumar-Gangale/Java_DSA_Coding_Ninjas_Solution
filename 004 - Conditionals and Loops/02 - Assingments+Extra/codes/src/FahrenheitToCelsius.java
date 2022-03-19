import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int e = scan.nextInt();
        int w = scan.nextInt();
        int c = 0;


        while(s<=e){
            c= (s-32)*5/9;
            System.out.println(s +  " " + c);
            s = s+w;
        }
    }
}
