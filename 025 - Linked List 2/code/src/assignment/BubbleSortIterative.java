package assignment;

import lecture_plus_extra.Node;
import lecture_plus_extra.PrintLL;
import lecture_plus_extra.TakingLLInputs;

/**
 * Bubble Sort (Iterative) LinkedList
 * Send Feedback
 * Given a singly linked list of integers, sort it using 'Bubble Sort.'
 * Note :
 * No need to print the list, it has already been taken care. Only return the new head to the list.
 * Input format :
 * The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
 * Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 * Output format :
 * For each test case/query, print the elements of the sorted singly linked list.
 *
 * Output for every test case will be printed in a seperate line.
 * Constraints :
 * 0 <= M <= 10^3
 * Where M is the size of the singly linked list.
 *
 * Time Limit: 1sec
 * Sample Input 1 :
 * 10 9 8 7 6 5 4 3 -1
 * Sample Output 1 :
 *  3 4 5 6 7 8 9 10
 *  Sample Input 2 :
 * 10 -5 9 90 5 67 1 89 -1
 * Sample Output 2 :
 * -5 1 5 9 10 67 89 90
 */

public class BubbleSortIterative {

    // my solution
    // T C -> O(n^2)
    // S C -> O(1)
    public static Node<Integer> bubbleSort(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null){
            return head;
        }
        int lengthOfLL = 0;
        Node<Integer> curr = head;
        while (curr != null){
            curr = curr.next;
            lengthOfLL++;
        }

        for (int i = 0 ; i < lengthOfLL-1; i++){
            curr = head;
            Node<Integer> fwd = curr.next;
            Node<Integer> prev = null;
            while (curr.next != null){
                if (curr.data > fwd.data){
                    curr.next = fwd.next;
                    fwd.next = curr;
                    if (prev == null){
                        head = fwd;
                    }else {
                        prev.next = fwd;
                    }
                    prev = fwd;
                    fwd = curr.next;
                }else {
                    prev = curr;
                    curr = fwd ;
                    fwd = fwd.next;
                }
            }
        }
        return head;
    }


    // solution by coding ninja
    private static int length(Node<Integer> head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    public static Node<Integer> bubbleSort2(Node<Integer> head) {
        int n = length(head);
        for (int i = 0; i < (n - 1); i++) {

            Node<Integer> prev = null;
            Node<Integer> curr = head;
            for (int j = 0; j < (n - i - 1); j++) {
                if (curr.data <= curr.next.data) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    if (prev == null) {
                        Node<Integer> fwd = curr.next;
                        head = head.next;
                        curr.next = fwd.next;
                        fwd.next = curr;
                        prev = fwd;
                    } else {
                        Node<Integer> fwd = curr.next;
                        prev.next = fwd;
                        curr.next = fwd.next;
                        fwd.next = curr;
                        prev = fwd;
                    }
                }
            }
        }
        return head;
    }


    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        head = bubbleSort2(head);
        PrintLL.printLL(head);
    }

}
