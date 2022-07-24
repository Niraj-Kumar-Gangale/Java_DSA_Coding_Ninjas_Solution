package lecture_plus_extra.return_subsequence;

public class SubSequence {

    // two ways to make it this question
    //1] using the substring method
    //2] using the startIndex method
    // you will not be able to make by passing the ans to next recursion.

    public static String[] findSubSequence(String s){
        // base case
        if (s.length()==0) {
            return new String[]{""};
        }

        String[] smallAns = findSubSequence(s.substring(1));

        String[] ans = new String[2*smallAns.length];

        for (int i = 0 ; i < 2*smallAns.length ; ++i){
            if (i< smallAns.length){
                ans[i]= smallAns[i];
            }else {
                ans[i]=s.charAt(0)+smallAns[i- smallAns.length];
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        String[] answer = findSubSequence("xyz");
        for (int i  = 0 ; i < answer.length ; ++i){
            System.out.println(answer[i]);
        }
    }
}
