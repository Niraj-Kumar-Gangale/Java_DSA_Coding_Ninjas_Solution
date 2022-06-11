package DuringLecturePlusExtra;

public class SwapAlternative {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        swapAlternative(array);
        for (int i =0 ; i < array.length ; i++){
            System.out.print(array[i]+ " ");
        }
    }

    public static void swapAlternative (int[] arr){
        for (int i = 0 ; i<arr.length-1; i=i+2){
            int temp = arr[i+1];
            arr[i+1]= arr[i];
            arr[i]= temp;
        }
    }
}
