package linkedlist;

public class LinkedListLength {

    public static int length(Node<Integer> head){
        //Your code goes here

        Node<Integer>  temp = head;
        int linkedListLength = 0;

        while(temp != null){
            temp = temp.next;
            linkedListLength++;
        }
        return linkedListLength;
    }

    public static void main(String[] args) {
        Node<Integer> head;
        head = TakingLLInputs.takingInput();
        LinkedListPrint.printLinkedList(head);
        int length = length(head);
        System.out.println(length);

    }
}
