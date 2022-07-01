package LecturePLusExtra.ReverseEachWord;

public class Code {
    public static void main(String[] args) {
        String str = "abc def ghi";
        System.out.println(reverseTheWord(str,0,2));
        System.out.println(reverseEachWord(str));
    }

    // we have two method teo write the code that is:-
    // 1 ] written already
    // 2 ] we will combine the two function inside one function its easy to write

    public static String reverseTheWord(String str, int startIndex, int endIndex){
        String ans = "";
        while(startIndex<=endIndex){
            ans = str.charAt(startIndex)+ans;
            startIndex++;
        }

        return ans;
    }
    public static String reverseEachWord(String str){
        String output = "";
        int start = 0 ;
        int i = 0 ;
        while(i<str.length()){
            if (str.charAt(i)==' '){
                output = output + reverseTheWord(str,start,i-1) +" ";
                start = i+1;
            }

            i++;
        }
        // after the loop finish
        output+= reverseTheWord(str,start,i-1);

        return output;
    }
}
