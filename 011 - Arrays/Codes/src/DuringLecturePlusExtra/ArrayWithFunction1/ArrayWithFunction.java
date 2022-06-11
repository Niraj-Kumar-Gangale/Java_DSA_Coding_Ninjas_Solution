package DuringLecturePlusExtra.ArrayWithFunction1;

public class ArrayWithFunction {
    public static void main(String[] args) {
        int[] arra = {1,2,3,4,5,6,};
        arrayIncrement(arra);
        for (int i = 0;  i<arra.length; i++){
            System.out.print(arra[i]+" ");
        }

    }

    private static void arrayIncrement(int[] arra) {
       // here arra local variable of array increment point to same address value as
        // the arr variable of main, so what ever changes you make to here will be
        // reflected back in the original one.
        for (int i = 0 ; i <arra.length ; i++){
            arra[i]++;
        }
    }
}