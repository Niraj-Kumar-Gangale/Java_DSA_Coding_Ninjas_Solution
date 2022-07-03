package LecturePlusExtra.How2dArrayStored;

public class Codes {

    public static void main(String[] args) {
        // How 2d array is stored?

        // let's define a 1d array
        int[] arr = new int[45];

        // let's define a 2d array
        int[][] arr2d = new int[5][5];

        //    |@arr2d[0]|     |1|2|3|4|5|
        //    |@arr2d[1]|     |1|2|3|4|5|
        //    |@arr2d[3]|     |1|2|3|4|5|
        //    |@arr2d[4]|     |1|2|3|4|5|
        //    |@arr2d[5]|     |1|2|3|4|5|
        //   MASTER ARRAY

        // when you print arr2d
        System.out.println(arr2d);
        // the output will be the address of Master Array    [[I@4c203ea1
        // i.e the address of the following array
        //
        //     |@arr2d[0]|@arr2d[1]|@arr2d[2]|@arr2d[3]|@arr2d[4]|
        //
        // and here arr2d[0] corresponds to the address of the first row
        // and here arr2d[1] corresponds to the address of the second row
        // and here arr2d[2] corresponds to the address of the third row
        // and here arr2d[3] corresponds to the address of the fourth row
        // and here arr2d[4] corresponds to the address of the fifth row
        //




    }


}
