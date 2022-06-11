package DuringLecturePlusExtra.ArrayWithFunction2;

public class ArrayWithFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,};
        arrayIncrement(arr);
        for (int i = 0;  i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    private static void arrayIncrement(int[] arr) {
        // here the below statement reassign a new address value to
        // local variable arr of arrayIncrement.
        // so changes would not be reflected back in original one.
        arr = new int[6];
        for (int i = 0 ; i <arr.length ; i++){
            arr[i]++;
        }
    }
}
