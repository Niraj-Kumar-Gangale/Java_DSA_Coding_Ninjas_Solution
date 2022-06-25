package LecturePLusExtra.MoreFunctionOnStrings;

public class Code {
    public static void main(String[] args) {
        // let's check the different function available for operation on the Strings

        // Add to String i.e Concatenation
        String firstString = "Noble";
        String secondString = "Niraj";
        System.out.println(firstString + " " + secondString);

        // Add two string using the concat function
        System.out.println(secondString.concat(firstString));

        // check if two string are equal
        String str1 = "Noble";
        String str2 = "Niraj";
        String str3 = "noble";
        String str4 = "Nob";
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.contentEquals(str3));

        // compare two string lexicographically
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareTo(str4));
        System.out.println(str1.compareTo(str2));

        // to check if contain something like =
        System.out.println(str1.contains("Nob"));

        // to check the function of subSequence in String
        System.out.println(str1.subSequence(0,3));

    }
}
