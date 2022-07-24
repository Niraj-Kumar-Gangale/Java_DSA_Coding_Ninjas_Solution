package lecture_plus_extra.return_subsequence;

public class Substring {


    // can you print this
    /*
        x xy xyz
        y yz
        z
     */

    public static void printSubstring(String s ){
        // base case
        if (s.length()==0){
            return;
        }


        printSubstring(s.substring(1));

        for (int i = 0 ; i < s.length() ; ++i){
            System.out.print(s.substring(0,i+1)+" ");
        }
        System.out.println();

    }

    // can you return the above answer in the form of string array
    // you can return the answer in the two form
    // 1] z y yz x xy xyz
    // 2] x xy xyz y yz z

    public static String[] returnSubstringArray(String s ){
        // base case
        if (s.length()==0){
            return new String[0];
        }


        String[] smallAns = returnSubstringArray (s.substring(1));
        String[] ans = new String[smallAns.length+ s.length()];

        for (int i = 0 ; i < ans.length ; ++i){
            if (i<s.length()){
            ans[i]=s.substring(0,i+1);
            } else{
                ans[i]= smallAns[i-s.length()];

            }
        }
        return ans;


    }

    // can you print
    /*
        x y z
        xy yz
        xyz
     */

    public static void printSubstring2(String s , int length){
        // base case
        if (length > s.length()){
            return;
        }

        for (int i = 0 ; i < s.length()-length+1 ; ++i){
            System.out.print(s.substring(i,i+length)+" ");
        }
        System.out.println();

        printSubstring2(s,length +1);

    }

    // can you return the above answer in the form of string rather than printing it

    public static String[] returnSubstringArray2(String s , int length) {
        // base case
        if (length > s.length()) {
            return new String[0];
        }

        // small problem
        String[] smallAns = returnSubstringArray2(s, length + 1);
        String[] ans = new String[smallAns.length + s.length()-length+1];

        // solving big using small
        for (int i = 0; i < ans.length ; ++i) {
           if (i < s.length()-length+1){
               ans[i] = s.substring(i, i + length);
           }else{
               ans[i] = smallAns[i-s.length()+length-1];
           }
        }

        return ans;

    }

    // passing the answer to next recursion
    public static String[] function (String s, String[] ans){
        if (s.length()==0){
            return ans;
        }

        String[] temp = new String[ans.length+s.length()];

        for (int i =  0 ;i < temp.length ; ++i){
            if (i<s.length()){
                temp[i]= s.substring(0,i+1);
            }else {
                temp[i]= ans[i-s.length()];
            }
        }

        ans = temp;
         return function(s.substring(1),ans);
    }





        public static void main(String[] args) {
        String a = "happy";
        System.out.println(a.substring(5));
        printSubstring("wxyz");
        printSubstring2("wxyz",1);
        String[] answer = returnSubstringArray2("wxyz",1);
        for (int i = 0 ; i < answer.length ; ++i){
            System.out.println(answer[i]);
        }
        String[] ans1 = function("xyz",new String[0]);
            for (int i = 0 ; i < ans1.length ; ++i){
                System.out.println(ans1[i]);
            }

    }
}
