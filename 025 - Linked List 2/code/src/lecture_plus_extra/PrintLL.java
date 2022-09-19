package lecture_plus_extra;

public class PrintLL {

    public static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
