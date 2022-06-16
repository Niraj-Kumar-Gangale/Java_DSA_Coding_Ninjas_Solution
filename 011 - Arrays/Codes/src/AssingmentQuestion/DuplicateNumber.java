package AssingmentQuestion;

public class DuplicateNumber {
    public static void main(String[] args) {

    }

    public static int duplicateNumber(int arr[]) {
        //Your code goes here
        // my and coding ninja solution same
        for (int i = 0; i <arr.length-1 ; i++ ){

            for (int j = i+1 ; j< arr.length;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        // Based on unique number
        for (int i = 0; i <arr.length ; i++ ){

            for (int j = 0 ; j< arr.length;j++){
                if (i==j){
                    continue;
                }
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }

        return Integer.MIN_VALUE;

    }

}
