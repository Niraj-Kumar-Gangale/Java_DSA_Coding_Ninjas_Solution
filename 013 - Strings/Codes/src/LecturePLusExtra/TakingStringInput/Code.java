package LecturePLusExtra.TakingStringInput;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        // how to take the input in the case of the String
        // 1] scan.next();
        // 2] scan.nextLine();

        //next();
        // Scanner use the token system to allocate the scanned value to the variable from the buffer
        // ab de ghi
        // _________
        // token 1 = ab
        // token 2 = de
        // token 3 = ghi


        String str1 = Scan.next();
        String str2 = Scan.next();
        String str3 = Scan.next();
        System.out.println("str1 length" + str1.length() + " str2 length " + str2.length() + " str3 length" + str3.length());




        //nextLine();
        // allocated the line starting from allocated tokens if any upto \n
        //
        int num = Scan.nextInt();
        String str4 = Scan.nextLine();
        System.out.println(str4.length());

        // for input
        // 13\n
        // output will be
        // 13
        // 0 >>>> length of str4

        // for input
        // 13 \n
        // output will be
        // 13
        // 1 >>>> length of str4


    }
}
