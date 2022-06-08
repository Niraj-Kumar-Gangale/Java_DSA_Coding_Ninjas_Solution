package DuringLecturePLusExtra.HowFunctionCallingWork;

public class NcRFunction {

    // creating ncr function
    public static int ncr(int n, int r){
        int num = factorial(n);
        int deno1 = factorial(n-r);
        int deno2= factorial(r);

        return num/(deno1*deno2);

    }

    // Factorial Function
    public static int factorial (int n){
        int ans = 1;
        for(int i = 1; i<=n; i++){
            ans = ans*i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(ncr(6,3));
    }


}
