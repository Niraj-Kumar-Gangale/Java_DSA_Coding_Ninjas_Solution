package Assignment;

import linkedlist.LinkedListLength;
import linkedlist.LinkedListPrint;
import linkedlist.Node;
import linkedlist.TakingLLInputs;

public class PalindromeLL {

    // Using Iterative solution i.e. nested for loop
    public static boolean isPalindrome1(Node<Integer> head) {
        //Your code goes here

        if (head == null || head.next == null){
            return true;
        }

        Node<Integer> nodeStart = head;
        int lengthOfLL = LinkedListLength.length(head);
        for (int i = 0 ; i < lengthOfLL/2 ;i++){
            Node<Integer> nodeEnd = head;
            for (int j = 0 ; j < lengthOfLL-1-i ; j++ ){
                nodeEnd= nodeEnd.next;
            }
            if (!nodeStart.data.equals(nodeEnd.data)){
                return false;
            }
            nodeStart = nodeStart.next;
        }

        return true;
    }

    // making a new reverse LL
    public static boolean isPalindrome2(Node<Integer> head){
        if (head == null || head.next == null){
            return true;
        }

        Node<Integer> reverseLL = ReverseLL.reverseLL(head);

        Node<Integer> temp = head;
        Node<Integer> tempTransverse = reverseLL;
        int lengthOfLL =  LinkedListLength.length(head);

        for (int i  = 0 ; i < lengthOfLL/2 ; ++i){
            if (!temp.data.equals(tempTransverse.data)){
                return false;
            }
            temp =temp.next;
            tempTransverse = tempTransverse.next;
        }


        return true;

    }

    // break the link in the middle then
    // reverse the right ll
    // then compare
    // DON'T FORGOT TO JOIN IT AGAIN

    public static boolean isPalindrome3(Node<Integer> head) {
        if (head == null || head.next == null){
            return true;
        }
        int lengthOfLL =  LinkedListLength.length(head);
        Node<Integer> temp = head;
        for (int i = 0 ; i < ((lengthOfLL-1)/2) ; i++){
            temp = temp.next;
        }

        Node<Integer> secondSubLLHead = temp.next;
        temp.next = null;
        secondSubLLHead = ReverseLL.reverseLL(secondSubLLHead);


        Node<Integer> firstSubLL = head;
        Node<Integer>  secondSubLL = secondSubLLHead;

        // compare two sub LL
        for (int i  = 0 ; i < lengthOfLL/2 ; ++i){
            if (!firstSubLL.data.equals(secondSubLL.data)){
                return false;
            }
            firstSubLL =firstSubLL.next;
            secondSubLL = secondSubLL.next;
        }

        firstSubLL = head;
        secondSubLL = ReverseLL.reverseLL(secondSubLLHead);

        while (firstSubLL.next!=null){
            firstSubLL = firstSubLL.next;
        }
        firstSubLL.next = secondSubLL;

        return true;
    }

    // solution of above method by coding ninjas
    public static boolean isPalindrome(Node<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }
        // find list center
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node<Integer> secondHead = slow.next;
        slow.next = null;
        secondHead = ReverseLL.reverseLL2(secondHead);
        // compare two sublists now
        Node<Integer> firstSubList = secondHead;
        Node<Integer> secondSubList = head;
        while (firstSubList != null) {
            if (firstSubList.data != secondSubList.data) {
                return false;
            }
            firstSubList = firstSubList.next;
            secondSubList = secondSubList.next;
        }

        //Rejoin the two sublists to restore the input list to its original form
        firstSubList = head;
        secondSubList = ReverseLL.reverseLL2(secondHead);
        while (firstSubList.next != null) {
            firstSubList = firstSubList.next;
        }
        firstSubList.next = secondSubList;
        return true;
    }


    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        LinkedListPrint.printLinkedList(head);
        System.out.println(isPalindrome2(head));
        LinkedListPrint.printLinkedList(head);
        System.out.println(isPalindrome3(head));
        LinkedListPrint.printLinkedList(head);


    }
}
