package lecture_plus_extra;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1,5,9,4,6,3,2,7};
        insertionSort(array);
        for (int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1 ; i < array.length  ; ++i){
            for (int j = i ; j > 0 ; j--){
                if (array[j] < array[j-1]){
                    // swap
                    int temp = array[j];
                    // shift the j to j+1 and in place of j put the arr[i] value
                    array[j]= array[j-1];
                    array[j-1]= temp;
                }else{
                    break;
                }
            }
        }


        // <<<<< Time Complexity >>>>>
        // the loop in the worst case runs for ((n)(n-1)) / 2
        // k unit operation for every time inner for loop run
        // TT = k * ((n)(n-1)) / 2
        // Time Complexity  O(n^2)

        // best case TC = O( n )
    }
}
