package assignment;

import lecture_plus_extra.Node;
import lecture_plus_extra.PrintLL;
import lecture_plus_extra.TakingLLInputs;

/**
 * Even after Odd LinkedList
 * Send Feedback
 * For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers. The relative order of the odd and even terms should remain unchanged.
 * Note :
 * No need to print the list, it has already been taken care. Only return the new head to the list.
 * Input format:
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 * <p>
 * The first line of each test case or query contains the elements of the singly linked list separated by a single space.
 * Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 * Output format:
 * For each test case/query, print the elements of the updated singly linked list.
 * <p>
 * Output for every test case will be printed in a seperate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= M <= 10^5
 * Where M is the size of the singly linked list.
 * <p>
 * Time Limit: 1sec
 * Sample Input 1 :
 * 1
 * 1 4 5 2 -1
 * Sample Output 1 :
 * 1 5 4 2
 * Sample Input 2 :
 * 2
 * 1 11 3 6 8 0 9 -1
 * 10 20 30 40 -1
 * Sample Output 2 :
 * 1 11 3 9 6 8 0
 * 10 20 30 40
 */

public class EvenAfterOddLL {

    // brute force method
    // tc - > O(N)
    // sc - > O(N)
    public static Node<Integer> evenAfterOddLLL(Node<Integer> head) {

        Node<Integer> temp = head;

        Node<Integer> newEvenHead = null;
        Node<Integer> newOddHead = null;

        Node<Integer> newEvenTail = null;
        Node<Integer> newOddTail = null;

        while (temp != null) {
            Node<Integer> newNode = new Node<>(temp.data);
            if (temp.data % 2 != 0) {
                if (newOddHead == null) {
                    newOddHead = newNode;
                    newOddTail = newNode;
                } else {
                    newOddTail.next = newNode;
                    newOddTail = newNode;
                }
            } else {
                if (newEvenHead == null) {
                    newEvenHead = newNode;
                    newEvenTail = newNode;
                } else {
                    newEvenTail.next = newNode;
                    newEvenTail = newNode;
                }
            }
            temp = temp.next;
        }

        if (newOddHead == null) {
            return newEvenHead;
        }

        // to deal with general case
        newOddTail.next = newEvenHead;
        return newOddHead;
    }

    // brute force method
    // tc - > O(N)
    // sc - > O(1)
    // method of solving is same as coding ninja
    public static Node<Integer> evenAfterOddLLL2(Node<Integer> head) {

        Node<Integer> temp = head;

        Node<Integer> newEvenHead = null;
        Node<Integer> newOddHead = null;

        Node<Integer> newEvenTail = null;
        Node<Integer> newOddTail = null;

        while (temp != null) {

            if (temp.data % 2 != 0) {
                if (newOddHead == null) {
                    newOddHead = temp;
                    newOddTail = temp;
                } else {
                    newOddTail.next = temp;
                    newOddTail = temp;
                }
            } else {
                if (newEvenHead == null) {
                    newEvenHead = temp;
                    newEvenTail = temp;
                } else {
                    newEvenTail.next = temp;
                    newEvenTail = temp;
                }
            }
            Node<Integer> forwardAddress = temp.next;
            temp.next = null;
            temp = forwardAddress;
        }

        if (newOddHead == null) {
            return newEvenHead;
        }

        // to deal with general case
        newOddTail.next = newEvenHead;
        return newOddHead;
    }

    // solution by coding ninja
    public static Node<Integer> evenAfterOdd(Node<Integer> head) {

        if (head == null) {
            return head;
        }
        Node<Integer> evenHead = null, oddHead = null, evenTail = null, oddTail = null;
        while (head != null) {
            if (head.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = head;
                    evenTail = head;
                } else {
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            } else {
                if (oddHead == null) {
                    oddHead = head;
                    oddTail = head;
                } else {
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if (oddHead == null) {
            return evenHead;
        } else {
            oddTail.next = evenHead;
        }
        if (evenHead != null) {
            evenTail.next = null;
        }
        return oddHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        head = evenAfterOdd(head);
        PrintLL.printLL(head);
    }
}
