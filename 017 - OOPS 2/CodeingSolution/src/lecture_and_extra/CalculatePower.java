package lecture_and_extra;

public class CalculatePower {

    // we want to calculate the power
    // use the standard method
    // 3^4 = 3* 3^3
    // 1] smallest method 3^3.
    // 2] solve big problem using the smallest problem.
    // 3] base case / the smallest case for which i don't need formula to calculate.

    public static int power(int x , int n){
        // case for which i don't need to solve the problem
        if (n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(3,3));
    }
}
