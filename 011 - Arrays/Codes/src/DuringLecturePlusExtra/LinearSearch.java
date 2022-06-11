package DuringLecturePlusExtra;

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {1,2,8,6,7,4};
        // to find if 7 present in the array
        System.out.println(linearSearch(array, 7));
    }

    // function to find if certain integer is present inside the array
    public static int linearSearch (int[] arr, int x){
        //for loop to transverse the array and search for the integer.
        for (int i = 0; i< arr.length ; i++){
            if (arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
