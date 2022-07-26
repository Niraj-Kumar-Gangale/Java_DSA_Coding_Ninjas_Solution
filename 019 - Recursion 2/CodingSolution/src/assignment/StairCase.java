package assignment;

public class StairCase {

    // my method
    public static int staircase(int n){

        /* Your class should be named Solution.
         * Don't write main() function.
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        // base case
        if (n==0){
            return 1;
        }

        // there ways you can choose the next step

        int ways1,ways2, ways3;

        if (n-1>=0){
            ways1 = staircase(n-1);
        }else{
            ways1 = 0;
        }

        if (n-2>=0){
            ways2 = staircase(n-2);
        }else{
            ways2 = 0;
        }

        if (n-3>=0){
            ways3 = staircase(n-3);
        }else{
            ways3 = 0;
        }

        return ways1 +ways2+ways3;

    }

    // coding ninja solution is same as me it is just optimized

    public static int staircase2 (int n ){
        if (n<0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        return staircase2(n-1)+staircase2(n-2)+staircase2(n-3);
    }

    public static void main(String[] args) {
        System.out.println(staircase2(5));
        System.out.println(staircase(5));

    }
}
