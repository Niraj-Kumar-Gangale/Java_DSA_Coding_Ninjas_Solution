package DuringLecturePLusExtra;

/*
Fibonacci Number
Send Feedback
Given a number N, figure out if it is a member of fibonacci series or not.
Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false
 */


public class FibonacciNumber {
    public static boolean checkMember(int n){

        /**
         * fibonacci series
         * 0 1 1 2 3 5 8 13 21 34 etc
         * a b c
         * now we will use  while loop to check all the values
         * of a <= n.
         * Inside while loop we will check for the condition (a==n)
         * and we will also increase the series values of a.
         *
         * if there is a value of a==n present return true inside while loop.
         *
         * if there is no a for which a==n inside while loop.
         * then return false after while loop termination
         */
        // my solution
        int  a = 0;
        int b = 1;
        int c ;
        while(a<=n){
            if(a==n){
                return true;
            }
            c = a+b;
            a=b;
            b=c;
        }
        return false;

        // optimized solution
        /*
        optimized solution
        while(a<n){
        	c = a+b;
            a=b;
            b=c;
        }
        return a==n;
        */
    }

}
