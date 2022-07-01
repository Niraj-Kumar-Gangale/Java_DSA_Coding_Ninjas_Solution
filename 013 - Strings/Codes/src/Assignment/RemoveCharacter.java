package Assignment;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "aabbccbaa";
        char a = 'a';
        System.out.println(removeAllOccurrencesOfChar(str,a));
    }

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        StringBuffer sp = new StringBuffer();
        sp.append(str);
        int i = 0;
        while (i < sp.length() ) {
            if (sp.charAt(i)==ch){
                sp.deleteCharAt(i);
            }else{
                i++;
            }
        }
        return sp.toString();

    }
}
