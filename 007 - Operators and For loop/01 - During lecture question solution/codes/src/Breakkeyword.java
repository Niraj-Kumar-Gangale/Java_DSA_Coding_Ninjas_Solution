
import java.util.Scanner;
public class Breakkeyword {

    // create a java function for the prime number question
    // to implement the use of the break key word

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        // using the boolean function and break
        boolean isPrime = true;
        int divisor = 2;
        while (divisor<number){
            if(number%divisor==0){
                isPrime= false;
                break;
            }
            divisor++;
        }
        if(isPrime){
            System.out.println(" Prime Number ");
        }else{
            System.out.println(" Not A Prime number");
        }

        // using return

        divisor = 2;
        while (divisor<number){
            if(number%divisor==0){
                System.out.println(" Not A Prime number");
                return;
            }
            divisor++;
        }

        System.out.println(" Prime Number ");

        // you can also make function for the prime number [the easiest solution]

    }
}
