package assignment;

/**
 * Print all Codes - String
 * Send Feedback
 * Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
 * Note : The order of codes are not important. Just print them in different lines.
 * Input format :
 * A numeric string S
 * Output Format :
 * All possible codes in different lines
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

public class PrintAllCodeStrings {
    public static void main(String[] args) {
        printAllPossibleCodes("1123");
        printAllPossibleCodesCN("1123");
//        System.out.println(AlphabetForNumber("11"));
    }


    public static void printAllPossibleCodes (String input){
        printAllPossibleCodes(input,"");
    }

    // function to print the all possible codes from the number combination
    // my method
    public static void printAllPossibleCodes(String input, String outputSoFar){
        // base case
        if (input.length()==0){
            System.out.println(outputSoFar);
            return;
        }

        for (int i = 0 ; i < 2 && i < input.length() ; ++i  ){
            String alphabet = AlphabetForNumber(input.substring(0,1+i));
            if (alphabet.equals("")) {
                return;
            }
            String newOutputSoFar = outputSoFar + alphabet;
            printAllPossibleCodes(input.substring(i+1), newOutputSoFar);
        }
    }
    public static String AlphabetForNumber (String str){
        switch (str){
            case "1" : return "a";
            case "2" : return "b";
            case "3" : return "c";
            case "4" : return "d";
            case "5" : return "e";
            case "6" : return "f";
            case "7" : return "g";
            case "8" : return "h";
            case "9" : return "i";
            case "10" : return "j";
            case "11" : return "k";
            case "12" : return "l";
            case "13" : return "m";
            case "14" : return "n";
            case "15" : return "o";
            case "16" : return "p";
            case "17" : return "q";
            case "18" : return "r";
            case "19" : return "s";
            case "20" : return "t";
            case "21" : return "u";
            case "22" : return "v";
            case "23" : return "w";
            case "24" : return "x";
            case "25" : return "y";
            case "26" : return "z";
            default: return "";
        }
    }

    // coding ninja method
    // same approach as mine but better code quality
    public static char getChar(int n) {
        return (char) (n + 96);
    }

    public static void printAllPossibleCodesCN(String input, String ans) {
        if(input.length() == 0) {
            System.out.println(ans);
            return;
        }
        int firstDigit = input.charAt(0) - '0';
        printAllPossibleCodesCN(input.substring(1), ans + getChar(firstDigit));
        if(input.length() > 1) {
            int firstTwoDigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if(firstTwoDigits >= 10 && firstTwoDigits <= 26) {
                printAllPossibleCodesCN(input.substring(2), ans + getChar(firstTwoDigits));
            }
        }
    }

    public static void printAllPossibleCodesCN(String input) {
        printAllPossibleCodes(input, "");
    }

}
