package Assignment;

public class CompressTheString {

    // Main function
    public static void main(String[] args) {
        String str1 = "aaaabbbbcccddsaaalll";
        System.out.println(getCompressedString(str1));
    }

    public static String getCompressedString(String str) {
        // Write your code here.
        // we will use the method 5
        String output = "" + str.charAt(0);
        char ch = str.charAt(0);
        // frequency array
        int[] frequency = new int[256];
        ++frequency[ch];

        //for loop
        int i = 1;
        for ( ; i < str.length() ; ++i){

            if (str.charAt(i)==ch){
                ++frequency[ch];
            }else{
                if (frequency[ch]>1){
                    output = output + frequency[ch];
                }
                frequency[ch] = 0;
                ch = str.charAt(i);
                output += ch;
                frequency[ch]= 1;
            }

        }
        if (frequency[ch]>1){
            output += frequency[ch];
        }
        return output;

        //--------------------------- Method 2 ----------------------------------
        /*
        if (input == null){
            return null;
        }
        if (input.length() == 0){
                return "";
        }
        // Variables to iterate the string and keep the count of the current character.
        int startIndex = 0;
        int endIndex = 0;



        // Resultant string.
        String compressedString = "";

        while (startIndex < input.length()) {
            while ((endIndex < input.length()) && (input.charAt(endIndex) == input.charAt(startIndex))) {
                endIndex += 1;
            }
            int totalCharCount = endIndex - startIndex;
            // If count is greater than 1, then append count to the string, else only character.
            if (totalCharCount != 1) {
                compressedString += (input.charAt(startIndex) + "" + totalCharCount);
            }
            else {
                compressedString += input.charAt(startIndex);
            }
            startIndex = endIndex;
        }
                return compressedString;

        */
    }
}
