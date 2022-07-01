package LecturePLusExtra.StringBufferVsString;

public class Codes {
    public static void main(String[] args) {
        // We all know that String is immutable
        // but we also have mutable String which is StringBuffer
        // when to which depends upon the use cases

        // StringBuffer
        StringBuffer firstStringBuffer = new StringBuffer("hello hi there");
        System.out.println(firstStringBuffer);
        // how to insert at certain index by offsetting other character
        firstStringBuffer.insert(3,'h');
        // how to change char at certain index
        firstStringBuffer.setCharAt(0, 'H');
        // how to append
        firstStringBuffer.append(" whats up");
        System.out.println(firstStringBuffer);


        // String
        String firstString = "hello";
        System.out.println(firstString);
    }

}
