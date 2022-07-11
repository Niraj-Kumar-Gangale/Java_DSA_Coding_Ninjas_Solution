package lecture_plus_extra.final_keyword_and_this_keyword;

public class ChildUse {
    public static void main(String[] args) {
        Child chi1 = new Child("Sunio");
        chi1.setAge(3);
        chi1.print();


//        int a = 45;
//        if (a%2==0){
//            int a =45;
//        }

        System.out.println("chi1.printA() " +chi1.printA());
        System.out.println("chi1.returnAPlusB(45) "+chi1.returnAPlusB(45));
        System.out.println("chi1.returnA(45) "+chi1.returnA(45));
        System.out.println("chi1.returnAUsingThisKeyWord(65465456) "+chi1.returnAUsingThisKeyWord(65465456));

        Child chi2 = new Child("Roman");
        // What do you think The outcome of the below statement?
        System.out.println("chi2.returnAUsingThisKeyWord(655465) "+chi2.returnAUsingThisKeyWord(655465));
        // Why answer 90;
        // Simple because  we did not run the returnAPlusB
        // therefore a value will remain stuck at 90

        // lets run returnAPlusB
        System.out.println("chi2.returnAPlusB(45) "+chi2.returnAPlusB(50));
        // again print the outcome of returnUSingThisKeyWord
        System.out.println("chi2.returnAUsingThisKeyWord(655465) "+chi2.returnAUsingThisKeyWord(655465));

        //----------
        // Print this key word and the s3 reference
        Child s3 = new Child("faltu");
        System.out.println(s3);
        s3.printThis();

        // let's use this key word to move from one function to other



    }
}
