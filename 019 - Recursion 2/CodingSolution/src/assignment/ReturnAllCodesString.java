package assignment;


import javax.management.MBeanAttributeInfo;

/**
 *Return all codes - String
 * Send Feedback
 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.
 * Note : The order of codes are not important. And input string does not contain 0s.
 * Input format :
 * A numeric string
 * Constraints :
 * 1 <= Length of String S <= 10
 * Sample Input:
 * 1123
 * Sample Output:
 * aabc
 * kbc
 * alc
 * aaw
 * kw
 */


public class ReturnAllCodesString {


    // to get char back by giving the integer input
    public static char getChar(int n){
        return (char)(96+n);
    }

    // my method to solve the question
    public static String[] allCodes(String input){

        //base case
        if (input.length()==0){
            return new String[]{""};
        }


        // recursion will  do its own work  then we will do our work
        int firstDigit = input.charAt(0)-'0';
        String[] smallAnsPartOne = allCodes(input.substring(1));
        String[] ans = new String[smallAnsPartOne.length];
        for (int i = 0 ; i < smallAnsPartOne.length ; i++){
            ans[i]= getChar(firstDigit)+ smallAnsPartOne[i];
        }
        if (input.length()>1){
            int firstTwoDigits = (input.charAt(0)-'0')*10 + (input.charAt(1)-'0');
            if (firstTwoDigits >= 10 && firstTwoDigits <=26){
                String[] smallAnsPartTwo = allCodes(input.substring(2));
                String[] tempAns = new String[ans.length+ smallAnsPartTwo.length];
                for (int i = 0 ; i < tempAns.length ; i++){
                    if (i < ans.length){
                        tempAns[i] = ans[i];
                    } else{
                        tempAns[i] = getChar(firstTwoDigits)+ smallAnsPartTwo[i-ans.length];
                    }
                }
                ans = tempAns;
            }
        }

        return ans;

    }

    // coding ninja solution same approach bu more optimized
    public static String[] allCodesCN(String input){

        //base case
        if (input.length()==0){
            return new String[]{""};
        }


        // recursion will  do its own work  then we will do our work
        int firstDigit = input.charAt(0)-'0';
        String[] smallAnsPartOne = allCodesCN(input.substring(1));
        String[] smallAnsPartTwo = new String[0];

        int firstTwoDigits = 0;
        if (input.length()>1){
            firstTwoDigits = (input.charAt(0)-'0')*10 + (input.charAt(1)-'0');
            if (firstTwoDigits >= 10 && firstTwoDigits <=26){
                smallAnsPartTwo = allCodesCN(input.substring(2));
            }
        }
        String[] ans = new String[smallAnsPartOne.length + smallAnsPartTwo.length];
        for (int i = 0 ; i < ans.length ; i++){
            if (i < smallAnsPartOne.length){
                ans[i] = getChar(firstDigit)+ smallAnsPartOne[i];
            } else{
                ans[i] = getChar(firstTwoDigits)+ smallAnsPartTwo[i-smallAnsPartOne.length];
            }
        }

        return ans;

    }


    public static void main(String[] args) {
        String[] answer = allCodes("1123");
        for (int i = 0 ; i < answer.length ; ++i){
            System.out.println(answer[i]);
        }
        String[] answer1 = allCodesCN("1123");
        for (int i = 0 ; i < answer1.length ; ++i){
            System.out.println(answer1[i]);
        }
    }

}
