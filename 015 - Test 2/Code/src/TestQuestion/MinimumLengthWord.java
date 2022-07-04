package TestQuestion;

public class MinimumLengthWord {
    public static void main(String[] args) {
        String firstString = "this is test String";
        System.out.println(minLengthWord(firstString));



    }


    public static String minLengthWord(String input) {


        // solve it using while/for + while in combined form
        //-----------------------------------------------------------------------

        if (input.length()==0){
            return input;
        }
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int i = 0 ;
        int minStart =0;
        int startIndex =0;

        for (; i < input.length() ; i++){
            // let's use the new method to count
            while ((i<input.length())&&(input.charAt(i)!=' ')){
                count++;
                i++;
            }


            if (count < minCount){
                minCount = count;
                minStart = startIndex;

            }
            startIndex = i+1;
            count = 0;

        }

        return input.substring(minStart , minStart + minCount);



        //----------------------------------------------------------------------


        // solve it using while/for + if in combined form
        //-----------------------------------------------------------------------
        /*
        if (input.length()==0){
            return input;
        }

        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int i = 0 ;
        int minStart =0;
        int startIndex =0;

        for (; i < input.length() ; i++){
            // let's use the new method to count
            if (input.charAt(i)!=' '){
                count++;

            }else{
                if (count < minCount){
                minCount = count;
                minStart = startIndex;

            	}
            	startIndex = i+1;
            	count = 0;
            }
        }
        if (count < minCount){
                minCount = count;
                minStart = startIndex;

        }


        return input.substring(minStart , minStart + minCount);

         */
        //----------------------------------------------------------------------



        // using for/while + if-else [in two part]
        //-------------------------------------------------------------------------
        /*

        // Here we have to calculate the last count calculation outside the loop
        // calculate the minimum wordCount
        if (input.length()==0){
            return input;
        }
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int i = 0 ;
        for (; i < input.length() ; i++){
            // let's use the new method to count
            if (input.charAt(i) != ' '){
                count++;

            }else {
                if (count < minCount) {
                    minCount = count;
                }
                count = 0;
            }
        }
        if (count < minCount) {
            minCount = count;
        }
        count =0;
        int startIndex =0;
        i=0;
        for (; i < input.length() ; i++){
            // let's use the new method to count
            if (input.charAt(i) != ' '){
                count++;

            }else {
                if (count == minCount) {
                    return input.substring(startIndex, startIndex+count);
                }else{
                    startIndex = i+1;
                }
                count = 0;
            }
        }

        return input.substring(startIndex, startIndex+count);
        */
        //--------------------------------------------------------------------------------




        // using for/while + while [solved in two part]
        //--------------------------------------------------------------------------------
        /*

        if (input.length()==0){
            return input;
        }

        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int i = 0 ;

        // First we will calculate the value for minCount
        // Then we will compare which word length is equal to minCount
        // and return the answer
        for (; i < input.length() ; i++){
            // let's use the new method to count
            while ((i<input.length())&&(input.charAt(i)!=' ')){
                count++;
                i++;
            }


            if (count < minCount){
                minCount = count;
            }
            count = 0;
        }
        i=0;
        int startIndex = 0;


        for (; i < input.length() ; i++){
            // let's use the new method to count
            while ((i<input.length())&&(input.charAt(i)!=' ')){
                count++;
                i++;
            }


            if (count == minCount){
                break;
            }else{
                startIndex = i+1;
            }
            count = 0;
        }
        return input.substring(startIndex, startIndex+count);

         */
        //------------------------------------------------------------------------------


    }


}
