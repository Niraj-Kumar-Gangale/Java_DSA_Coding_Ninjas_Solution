package assignment;

/**
 * Count Zeros
 * Send Feedback
 * Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
 *
 * Input Format :
 * Integer N
 * Output Format :
 * Number of zeros in N
 * Constraints :
 * 0 <= N <= 10^9
 * Sample Input 1 :
 * 0
 * Sample Output 1 :
 * 1
 * Sample Input 2 :
 * 00010204
 * Sample Output 2 :
 * 2
 * Explanation for Sample Output 2 :
 * Even though "00010204" has 5 zeros, the output would still be 2 because when you convert it to an integer, it becomes 10204.
 * Sample Input 3 :
 * 708000
 * Sample Output 3 :
 * 4
 */

public class countZeros {


    public static int countZerosRec(int input){
        // Write your code here
        // base case
        if ((input/10==0)&&(input%10!=0)){
            return 0;
        }
        if (input==0){
            return 1;
        }


        //small problem
        int smallAns = countZerosRec(input/10);

        //solving big using small
        if (input%10==0){
            return smallAns+1;
        }else{
            return smallAns;
        }
    }



    // to make method work we have to use addition parameter
    // and also do some changes in base case
    // And it will work with the help of helper function
    public static int countZerosRec(int input, int smallAns){
        // Write your code here
        // base case
        if ((input/10==0)&&(input%10!=0)){
            // return value change in method 2
            return smallAns;
        }
        if (input==0){
            return 1;
        }

        //processing
        if(input%10==0){
            smallAns++;
        }

        //small problem
        smallAns = countZerosRec(input/10,smallAns);


        return smallAns;
        //solving big using small

    }



    public static void main(String[] args) {
        int number = 458493;

        System.out.println(countZerosRec(10020020));
        System.out.println(countZerosRec(10020020,0));
    }
}
