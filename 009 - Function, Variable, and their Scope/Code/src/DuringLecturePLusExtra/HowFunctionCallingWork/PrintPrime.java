package DuringLecturePLusExtra.HowFunctionCallingWork;

public class PrintPrime {

    // create print prime number from 2 upto n.
    public static void printPrimeNumber(int n){
        for(int i = 2; i<=n; i++){
            if(isPrimes(i)){
                System.out.println(i);
            }
        }
    }

    // create isPrime boolean function.
    public static boolean isPrimes(int n){
        int divisor = 2;

        while(divisor < n){
            if (n%divisor==0){
                return false;
            }
            divisor++;
        }
        return true;
    }

    // main function
    public static void main(String[] args) {
        printPrimeNumber(100);
    }
}
