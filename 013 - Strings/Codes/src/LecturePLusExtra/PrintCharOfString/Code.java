package LecturePLusExtra.PrintCharOfString;

import java.util.Scanner;

public class Code {
    // function to print all the char in String
    public static void printChar(String s){
        for (int i = 0 ; i < s.length() ; i++){
            System.out.println(s.charAt(i));
        }
    }
    // Main function
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        printChar(s);
    }

}
