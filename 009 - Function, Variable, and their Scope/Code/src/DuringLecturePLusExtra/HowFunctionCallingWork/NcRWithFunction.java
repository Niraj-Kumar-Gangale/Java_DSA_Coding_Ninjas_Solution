package DuringLecturePLusExtra.HowFunctionCallingWork;

import java.util.Scanner;

public class NcRWithFunction {

    // Factorial Function
    public static int factorial (int n){
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans*i;
        }
        return ans;
    }

    public static void main(String[] args) {
        // START ---------------------------------------
        // Read the values of n and r.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        // The NcR consist of three term
        // numerator i.e n!
        // denominator i.e n! and n-r!

        // let's calculate n factorial
        int nFactorial = factorial(n);

        // let's Calculate n-r!
        int nMinusRFactorial = factorial(n-r);

        // let's calculate r factorial
        int rFactorial = factorial(r);

        // resultant value of NcR
        int ans = nFactorial/(nMinusRFactorial*rFactorial);
        System.out.println(ans);

    }
}
