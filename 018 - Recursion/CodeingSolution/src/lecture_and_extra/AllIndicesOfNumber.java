package lecture_and_extra;


/**
 * All Indices of Number
 * Send Feedback
 * Given an array of length N and an integer x,
 * you need to find all the indexes where x is present in the input array.
 * Save all the indexes in an array (in increasing order).
 * Do this recursively. Indexing in the array starts from 0.
 * Input Format :
 * Line 1 : An Integer N i.e. size of array
 * Line 2 : N integers which are elements of the array, separated by spaces
 * Line 3 : Integer x
 * Output Format :
 * indexes where x is present in the array (separated by space)
 * Constraints :
 * 1 <= N <= 10^3
 * Sample Input :
 * 5
 * 9 8 10 8 8
 * 8
 * Sample Output :
 * 1 3 4
 *
 */
public class AllIndicesOfNumber {

    // well lets try my brute force method
    // the helper function
    // not suitable , too much complex
    /*
    public static int[] allIndices (int[] input , int x , int startIndex ,int[] arr, int arrStartIndex){



        // base case
        if (startIndex== input.length){
            return arr;
        }

        // processing / updating
        if (x==input[startIndex]){
            arr[arrStartIndex]= startIndex;
            arrStartIndex++;
        }

        // small problem
        int [] smallAns = allIndices(input,x,startIndex+1,arr,arrStartIndex);


        return smallAns;

    }
     */


    public static int[] allIndices (int [] input, int x){
//        int[] arr = new int[input.length];
//        return allIndices(input,x,0,arr,0);
        return allIndicesBetter2(input,x,0);

    }



    // using the general method of approach better+ m1 123
    public static int[] allIndicesBetter1(int[] input , int x , int startIndex){

        // base case
        if (startIndex == input.length - 1){

            if (input[startIndex]==x){
                return new int[]{startIndex};
            }else{
                return new int[0];
            }
        }

        // small problem

        int[] small = allIndicesBetter1(input,x,startIndex+1);

        // solving the big using the small

        if (input[startIndex]==x){
            int smallLength = small.length;
            int[] arr = new int[smallLength+1];
            arr[0]=startIndex;
            for (int i = 1 ; i < arr.length ;++i){
                arr[i]= small[i-1];
            }
            return arr;
        }else{
            return small;
        }

    }

    // better + m2 132
    public static int[] allIndicesBetter2(int[] input , int x , int startIndex){

        // base case
        if (startIndex == input.length - 1){

            if (input[startIndex]==x){
                return new int[]{startIndex};
            }else{
                return new int[0];
            }
        }

        // check / update / processing

        if (input[startIndex]==x){
            int[] small = allIndicesBetter2(input,x,startIndex+1);
            int smallLength = small.length;
            int[] arr = new int[smallLength+1];
            arr[0]=startIndex;
            for (int i = 1 ; i < arr.length ;++i){
                arr[i]= small[i-1];
            }
            return arr;
        }

        return allIndicesBetter2(input,x,startIndex+1);

    }

    // let's solve it using without helper function method 1 123

    // here be careful about the returning part.
    // because you return the index of the array which was newly
    // made so there value would not be same
    // Because there value are respective to their array not to the parent.
    public static int[] allIndices1 (int[] input , int x){

        // because the constraints are
        // 1<=N<=10^3.
        if (input.length==1){
            if (input[0]==x){
                return new int[]{0};
            }else{
                return new int[0];
            }
        }

        // making the small problem
        int[] smallInput = new int[input.length-1];
        for (int i = 1 ; i < input.length ; ++i){
            smallInput[i-1]= input[i];
        }

        // making use of the small problem
        int[] small = allIndices1(smallInput,x);

        // solving the big using the small
        if (input[0]==x){
            int smallLength = small.length;
            int[] arr = new int[smallLength+1];
            arr[0]=0;
            for (int i = 1 ; i < arr.length ;++i){
                arr[i]= small[i-1]+1;
            }
            return arr;
        }else{

            int[] small2 = new int[small.length];
            for (int i = 0 ; i < small.length ; ++i ){
                small2[i] = small[i]+1;
            }
            return small2;
        }

    }


    // similarly you can make  method 2 132
    public static int[] allIndices2 (int[] input , int x){

        // because the constraints are
        // 1<=N<=10^3.
        if (input.length==1){
            if (input[0]==x){
                int[] arr = {0};
                return arr;
            }else{
                return new int[0];
            }
        }

        // making the small problem
        int[] smallInput = new int[input.length-1];
        for (int i = 1 ; i < input.length ; ++i){
            smallInput[i-1]= input[i];
        }


        // solving the big using the small
        if (input[0]==x){
            // making use of the small problem
            int[] small = allIndices2(smallInput,x);
            int smallLength = small.length;
            int[] arr = new int[smallLength+1];
            arr[0]=0;
            for (int i = 1 ; i < arr.length ;++i){
                arr[i]= small[i-1]+1;
            }
            return arr;
        }


        int[] small = allIndices2(smallInput,x);
        int[] small2 = new int[small.length];
        for (int i = 0 ; i < small.length ; ++i ){
            small2[i] = small[i]+1;
        }
        return small2;


    }

    public static void main(String[] args) {
        int[] arr = {5,5,3,4,5,6,5};
        int[] ans = allIndices2(arr,5);
        for (int i = 0 ; i < ans.length ; ++i){
            System.out.print(ans[i]+"  ");
        }

    }
}
