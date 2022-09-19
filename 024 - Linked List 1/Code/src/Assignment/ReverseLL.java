package Assignment;

import linkedlist.LinkedListLength;
import linkedlist.Node;

public class ReverseLL {


    // Time Complexity -> O(n^2)
    // Space Complexity -> O(n)
    public static Node<Integer> reverseLL (Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }

        int lengthOfLL = LinkedListLength.length(head);
        Node<Integer> newHead = null;
        Node<Integer> tempTransverse = null;

        // nested for loop to print the reverseLinkedLIst
        for (int i = 0 ; i < lengthOfLL ;i++){
            Node<Integer> temp = head;
            for (int j = 0 ; j < lengthOfLL-1-i; j++){
                temp = temp.next;
            }
            Node<Integer> newNode = new Node<>(temp.data);
            if (tempTransverse ==null){

                tempTransverse  = newNode;
                newHead = tempTransverse;
            }else{

                tempTransverse.next = newNode;
                tempTransverse = newNode;
            }
        }
        return newHead;
    }

    // make reverse linked list without the using the newLL
    // in less time complexity
    public static Node<Integer> reverseLL2 (Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;

        while (curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

}
