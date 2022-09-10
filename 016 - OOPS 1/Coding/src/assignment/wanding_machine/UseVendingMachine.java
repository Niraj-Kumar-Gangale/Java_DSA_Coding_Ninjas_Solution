package assignment.wanding_machine;

import java.util.Scanner;

public class UseVendingMachine {

    // No need for exception handling
    // because exception handling leads to program termination
    // So I use my brain to solve the problem there and then.

    public static void main(String[] args) {

        // for fun
        Scanner scan = new Scanner(System.in);
        int totalQuantity = 0;
        while(true){
            System.out.println("please enter the quantity of the coke you want");
            totalQuantity = scan.nextInt();
            if (totalQuantity<1){
                System.out.println("!!!!!!!Incorrect input!!!!!!!!!");
            }else{
                break;
            }
        }
        System.out.println("😃 Thanks for the purchase ");

        // for fun
        VendingMachine firstObject = new VendingMachine();
        VendingMachine.printSumTwo();
    }
}
