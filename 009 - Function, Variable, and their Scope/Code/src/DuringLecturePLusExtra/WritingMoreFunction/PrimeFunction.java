package DuringLecturePLusExtra.WritingMoreFunction;

public class PrimeFunction {

    // creating a function to check for the prime number

    public static boolean isPrime (int n ){
        int divisor = 2;
        if(n == 1){
            return false;
        }
        while(divisor < n){
            if (n%divisor==0){
                return false;
            }
            divisor++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

}
