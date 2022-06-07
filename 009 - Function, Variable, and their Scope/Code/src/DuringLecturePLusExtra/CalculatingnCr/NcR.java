package DuringLecturePLusExtra.CalculatingnCr;

import java.util.Scanner;

// calculating the NcR (combination)
public class NcR {
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
        int nFactorial = 1;
        for(int i = 1; i<=n; i++){
            nFactorial = nFactorial*i;
        }

        // let's Calculate n-r!
        int nMinusRFactorial = 1;
        for(int i = 1; i<=n-r; i++){
            nMinusRFactorial = nMinusRFactorial*i;
        }

        // let's calculate r factorial
        int rFactorial = 1;
        for(int i = 1; i<=r; i++){
            rFactorial = rFactorial*i;
        }

        // resultant value of NcR
        int ans = nFactorial/(nMinusRFactorial*rFactorial);
        System.out.println(ans);


    }
}
