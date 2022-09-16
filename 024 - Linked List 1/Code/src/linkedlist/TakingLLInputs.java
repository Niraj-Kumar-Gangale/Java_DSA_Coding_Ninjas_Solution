package linkedlist;


import java.util.Scanner;

public class TakingLLInputs {

    /**
     * <li>Method to take Input for the linkedList.</li>
     * Taking input until -1 is provided. If input -1 then the return the Head reference value.
     * <p>Works for integer only</p>
     * Time Complexity O(n^2).
     */
    public static Node<Integer> takingInput (){

        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
            if (head ==null){
                head = newNode;
            }else{
                Node<Integer> temp = head ;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }


    /**
     * <li>Method to take Input for the linkedList.</li>
     * Taking input until -1 is provided. If input -1 then the return the Head reference value.
     * <p>Works for integer only</p>
     * Time Complexity O(n).
     */
    public static Node<Integer> takingInput2 (){

        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
            if (head ==null){
                head = newNode;
            }else{
                tail.next = newNode;
            }
            tail = newNode;
            data = sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head ;
        head = takingInput();
        LinkedListPrint.printLinkedList(head);
        Node<Integer> head2 ;
        head2 = takingInput2();
        LinkedListPrint.printLinkedList(head2);
    }

}
