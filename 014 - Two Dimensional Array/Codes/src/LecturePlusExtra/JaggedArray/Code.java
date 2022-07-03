package LecturePlusExtra.JaggedArray;

public class Code {
    public static void main(String[] args) {
        // jagged array
        // An array in which you only define the number of rows and not the number of column
        int[][] arr = new int[4][];
        // here only master array is initialized with null entries
        // because we did not define the array column so there is no column
        //  and because there is no column array then there corresponding address value
        //  will have null values

        // let's print the master array address
        System.out.println("master array address "+arr);

        // let's check the address value for the column inside the master array
        for (int i = 0 ; i < arr.length ; ++i){
            System.out.println("Address of the arr["+ i+"] "+arr[i]);
        }

        // let's define the columns of jagged array
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        // let's check the address values of the column array inside the master array
        for (int i = 0 ; i < arr.length ; ++i){
            System.out.println(arr[i]);
        }

        // Allocating values to the array indices
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; ++j){
                arr[i][j]=i+j;
            }
        }

        // Printing the jagged array
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 0 ; j < arr[i].length ; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }

}
