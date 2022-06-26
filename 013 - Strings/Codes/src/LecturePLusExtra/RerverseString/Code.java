package LecturePLusExtra.RerverseString;

public class Code {
    public static void main(String[] args) {
        String str2 =  "Noble";
        // str2 = changeFirstChar(str2);
        System.out.println(reverseString(str2));

    }

    public static String changeFirstChar(String f){
        // f(0)='l';
        // above will not work as in the case of the language java the String is immutable
        // so you need to create a temporary array with the changes already presented inside.
        // then allocate the temporary array to the original using the return
        return  "Loble Niraj";


    }

    public static String reverseString(String str){
        // what we want
        // abcd to dcba
        // you cannot add index by index
        // temp [i]=str[str.length()-1]
        // you can add element using [ + ]  or [  concatenation ]
        // without worrying about the length of the temporary.

        String temp = "" ;
//        for (int i = str.length()-1 ; i >=0 ; i--){
//            temp = temp + str.charAt(i);
//        }


        // second way by Transversing the array  in forward direction
//        for (int i  = 0 ; i < str.length() ; i++){
//            temp  = temp + str.charAt(str.length()-1-i);
//        }



        // third way to trans verse the array but change the sequence of addition
        for (int i  = 0 ; i < str.length() ; i++){
            temp  = str.charAt(i)+ temp;
        }
        return temp;

    }
}
