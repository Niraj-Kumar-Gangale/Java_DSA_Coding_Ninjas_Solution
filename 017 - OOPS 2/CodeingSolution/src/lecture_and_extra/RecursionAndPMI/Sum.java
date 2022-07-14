package lecture_and_extra.RecursionAndPMI;

public class Sum {
    // we will come up with the logic on how a recursion actually works.
    // RECURSION -> it actually has roots in a very powerful mathematical Concept i.e. PMI
    // we talk about the PMI > principal of mathematical Induction

    // about PMI you can study from the notes

    // let's make a Sum static function
    public static int sum(int n ) {
        if (n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
