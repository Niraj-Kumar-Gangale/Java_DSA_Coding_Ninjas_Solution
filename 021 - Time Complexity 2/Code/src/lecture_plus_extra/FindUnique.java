package lecture_plus_extra;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindUnique {
    public static void main(String[] args) {

        int[] arr = {1,2,8,6,2,6,1,7,8};
        System.out.println(findUnique1(arr));
        System.out.println(findUnique2(arr));
        System.out.println(findUnique3(arr));
    }

    // Method 1 [ using the brute force method ]
    public static int findUnique1 (int[] arr) {

        // FOR LOOP TO Select the individual index element
        for (int i = 0 ; i < arr.length ;++i){
            boolean isPresent =  false;
            // to check if the value similar to arr[i] present in the loop
            for (int j = 0 ; j < arr.length ;  ++j){
                if (i!=j){
                    if (arr[i]==arr[j])
                        isPresent =  true;
                }
            }
            if (!isPresent){
                return arr[i];
            }
        }
        return -1 ;
    }

    // Method 2 [ sorting and comparing the adjacent index for same values ]
    public static int findUnique2 (int[] arr){
        // sort the array
        Arrays.sort(arr);
        // compare the adjacent index for similar value
        for (int i = 0 ; i< arr.length ; i++){
            if (arr[i]==arr[i+1]){
                i++;
            }else{
                return arr[i];
            }
        }
        return arr[arr.length-1] ;
    }


    // Method 3 [ using the Xor Method ]
    public static int findUnique3 (int[] arr){
        int ans = 0;
        for (int j : arr) {
            ans ^= j;
        }
        return ans;
    }
}
