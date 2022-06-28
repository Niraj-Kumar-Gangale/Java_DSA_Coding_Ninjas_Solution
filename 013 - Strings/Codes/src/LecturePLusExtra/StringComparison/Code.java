package LecturePLusExtra.StringComparison;

import java.util.Arrays;

public class Code {

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] arr2 = {1, 2, 6, 5};
        int[] arr3;
        arr3 = arr2;

        System.out.println(arr3.length);

        String str = "LOL";
        String str2 = "LOL";

        if (arr == arr2) {
            // here instead of values inside array their address is compared
            // so answer is always false
        }

        if (str == str2) {
            // here also address compared but because of String pool
            // the answer will always be true.
        }

        System.out.println(Arrays.equals(arr, arr2));
        System.out.println(str.equals(str2));

        // CONCLUSION : in case of non-Primitive do not do not use "==" operators
        //              always use built-in function for comparison.
    }



}
