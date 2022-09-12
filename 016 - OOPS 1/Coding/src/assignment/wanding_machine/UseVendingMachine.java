package assignment.wanding_machine;

import java.util.Scanner;

public class UseVendingMachine {

    // No need for exception handling
    // because exception handling leads to program termination
    // So I use my brain to solve the problem there and then.

    public static void main(String[] args) {

//        // for fun
//        Scanner scan = new Scanner(System.in);
//        int totalQuantity = 0;
//        while(true){
//            System.out.println("please enter the quantity of the coke you want");
//            totalQuantity = scan.nextInt();
//            if (totalQuantity<1){
//                System.out.println("!!!!!!!Incorrect input!!!!!!!!!");
//            }else{
//                break;
//            }
//        }
//        System.out.println("😃 Thanks for the purchase ");
//
//        // for fun
//        VendingMachine firstObject = new VendingMachine();
//        VendingMachine.printSumTwo();
//
//
//        // for fun
//        VendingMachine secObject = new VendingMachine();
//        secObject.arr = new int[]{1, 2, 6, 4, 50};  // first time so it has to initialize
//        secObject.number = 78;
//
//        VendingMachine thirdObject = new VendingMachine();
//        thirdObject.arr = new int[]{1, 5, 6, 8, 4, 5};
//
//        // but for normal array initialization
//        int[] array = {1,5,6};    // this is sufficient
//        thirdObject.arr = array;
//
//        // storing the object in the array
//        VendingMachine[] storeObjects = new VendingMachine[]{firstObject,secObject,thirdObject};
//        // access objects stored in the array
//        storeObjects[2].number = 55;

        System.out.println(" let's try");
        System.out.println(sum(5));
        divideByZero(5);

        int in = (int)'h';

    }


    // lets try stack over flow error
    public static int sum (int n){
        // base case
        if(n == 1){
            return 1;
        }

        // small problem solution
        int smallProblem = sum(n-1);

        return 5 + smallProblem;
    }

    public static void divideByZero (int i ){
        int h = i/0;
        System.out.println(h);
    }
}
