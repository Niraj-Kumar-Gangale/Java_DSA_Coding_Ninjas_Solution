package LecturePlusExtra;

/**
 * Largest Row or Column
 * Send Feedback
 * For a given two-dimensional integer array/list of size (N x M),
 * you need to find out which row or column has the largest sum(sum of all the elements in a row/column)
 * amongst all the rows and columns.
 * Note :
 * If there are more than one rows/columns with maximum sum,
 * consider the row/column that comes first. And if ith row and jth column has the same largest sum,
 * consider the ith row as answer.
 * Input Format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run.
 * Then the test cases follow.
 *
 * First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space.
 * They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
 *
 * Second line onwards, the next 'N' lines or rows represent the ith row values.
 *
 * Each of the ith row constitutes 'M' column values separated by a single space.
 * Output Format :
 * For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
 * OR
 * If column sum is maximum, then print: "column" <col_index> <col_sum>
 * It will be printed in a single line separated by a single space between each piece of information.
 *
 * Output for every test case will be printed in a seperate line.
 *  Consider :
 * If there doesn't exist a sum at all then print "row 0 -2147483648",
 * where -2147483648 or -2^31 is the smallest value for the range of Integer.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^3
 * 0 <= M <= 10^3
 * Time Limit: 1sec
 * Sample Input 1 :
 * 1
 * 2 2
 * 1 1
 * 1 1
 * Sample Output 1 :
 * row 0 2
 * Sample Input 2 :
 * 2
 * 3 3
 * 3 6 9
 * 1 4 7
 * 2 8 9
 * 4 2
 * 1 2
 * 90 100
 * 3 40
 * -10 200
 * Sample Output 2 :
 * column 2 25
 * column 1 342
 */

public class LargestRowOrColumn {
    public static void main(String[] args) {
        /*
        6 9 8 5
        9 2 4 1
        8 3 9 3
        8 7 8 6

         */
        int[][] arr2d = {{6,9,8,5},{9,2,4,1},{8,3,9,3},{8,7,8,6}};
        findLargest(arr2d);
    }

    public static void findLargest(int[][] mat){
        //Your code goes here
        if (mat.length==0 ){
            System.out.println("row "+0+" "+ Integer.MIN_VALUE);
        }

        // largest in row wise
        int rowMaxSum = Integer.MIN_VALUE;
        int maxSumRowNo = 0;
        for (int i = 0; i < mat.length ;++i){
            int sum = 0;
            for (int j = 0 ; j < mat[0].length ; ++j){
                sum+=mat[i][j];
            }
            if (sum>rowMaxSum){
                rowMaxSum = sum;
                maxSumRowNo = i;
            }
        }

        // largest in column wise
        int colMaxSum = Integer.MIN_VALUE;
        int maxSumColNo = 0;
        for (int j = 0; j < mat[0].length ;++j){
            int sum = 0;
            for (int i = 0 ; i < mat.length ; ++i){
                sum+=mat[i][j];
            }
            if (sum>rowMaxSum){
                colMaxSum = sum;
                maxSumColNo = j;
            }
        }
        if (colMaxSum>rowMaxSum){
            System.out.println("column "+maxSumColNo +" "+ colMaxSum);
        }else{
            System.out.println("column "+maxSumRowNo +" "+ rowMaxSum);
        }

    }
}
