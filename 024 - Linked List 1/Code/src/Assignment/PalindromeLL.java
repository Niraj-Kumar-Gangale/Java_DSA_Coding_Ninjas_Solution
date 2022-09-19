package Assignment;

import linkedlist.LinkedListLength;
import linkedlist.LinkedListPrint;
import linkedlist.Node;
import linkedlist.TakingLLInputs;

/**
 * Palindrome LinkedList
 * Send Feedback
 * You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 *  Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 *  Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 *  Output format :
 * For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 *  Constraints :
 * 1 <= t <= 10^2
 * 0 <= M <= 10^5
 * Time Limit: 1sec
 *
 * Where 'M' is the size of the singly linked list.
 * Sample Input 1 :
 * 1
 * 9 2 3 3 2 9 -1
 * Sample Output 1 :
 * true
 * Sample Input 2 :
 * 2
 * 0 2 3 2 5 -1
 * -1
 * Sample Output 2 :
 * false
 * true
 * Explanation for the Sample Input 2 :
 * For the first query, it is pretty intuitive that the given list is not a palindrome,
 * hence the output is 'false'.
 *
 * For the second query, the list is empty. An empty list is always a palindrome ,
 * hence the output is 'true'.
 */

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
