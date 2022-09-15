package linkedlist;

/**
 * How to print the linked list.
 */

public class LinkedListPrint {


    /**
     * Generic Function to print the linkedList
     * @param head reference of LinkedList to be printed
     */
    public static <T>  void printLinkedList(Node<T> head){
        Node<T> temp = head;

        while (temp !=null ){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    /**
     * Main function
     * @param args
     */
    public static void main(String[] args) {
        // let's define there nodes and connect them
        Node<Integer> node1 = new Node<>(12);
        Node<Integer> node2 = new Node<>(13);
        Node<Integer> node3 = new Node<>(14);
        node1.next = node2;
        node2.next = node3;

        // define head variable pointing to the Node 1
        Node<Integer> head = node1;

        // Using the Brute force
        System.out.println(head.data + " ");
        System.out.println(head.next.data + " ");
        System.out.println(head.next.next.data + " ");
        System.out.println(head.next.next.next + " ");

        // printing iteratively
        while(head != null){
            System.out.println(head.next +" ");
            head = head.next;
        }

    }
}
