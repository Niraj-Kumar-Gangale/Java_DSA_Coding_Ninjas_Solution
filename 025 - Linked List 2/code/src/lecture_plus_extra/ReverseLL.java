package lecture_plus_extra;

import java.awt.*;

/**
 * Reverse LL (Recursive)
 * Send Feedback
 * Given a singly linked list of integers, reverse it using recursion and return the head to the modified list. You have to do this in O(N) time complexity where N is the size of the linked list.
 *  Note :
 * No need to print the list, it has already been taken care. Only return the new head to the list.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
 * Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 * Output format :
 * For each test case/query, print the elements of the updated singly linked list.
 *
 * Output for every test case will be printed in a seperate line.
 *  Constraints :
 * 1 <= t <= 10^2
 * 0 <= M <= 10^4
 * Where M is the size of the singly linked list.
 *
 * Time Limit: 1sec
 * Sample Input 1 :
 * 1
 * 1 2 3 4 5 6 7 8 -1
 * Sample Output 1 :
 * 8 7 6 5 4 3 2 1
 * Sample Input 2 :
 * 2
 * 10 -1
 * 10 20 30 40 50 -1
 * Sample Output 2 :
 * 10
 * 50 40 30 20 10
 */


/**
 * Reverse LL (Iterative)
 * Send Feedback
 * Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.
 *  Note :
 * No need to print the list, it has already been taken care. Only return the new head to the list.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
 * Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 * Output format :
 * For each test case/query, print the elements of the updated singly linked list.
 *
 * Output for every test case will be printed in a separate line.
 *  Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^4
 * Where N is the size of the singly linked list.
 *
 * Time Limit: 1 sec
 * Sample Input 1 :
 * 1
 * 1 2 3 4 5 6 7 8 -1
 * Sample Output 1 :
 * 8 7 6 5 4 3 2 1
 * Sample Input 2 :
 * 2
 * 10 -1
 * 10 20 30 40 50 -1
 * Sample Output 2 :
 * 10
 * 50 40 30 20 10
 */

public class ReverseLL {

    // Time Complexity O(n^2)
    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null){
            return head;
        }

        // solve small
        Node<Integer> smallAns = reverseLinkedListRec(head.next);
        Node<Integer> temp = smallAns;

        System.out.println();
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;
        return smallAns;
    }

    // solving in O(n) smart way
    public static Node<Integer> reverseLinkedListRec2(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null){
            return head;
        }

        // solve small
        Node<Integer> smallAns = reverseLinkedListRec2(head.next);
        head.next.next = head;
        head.next = null;
        return smallAns;
    }


    // solving in O(n) using the method of returning double values
    // something valuable to learn
    public static DoubleNode<Integer> reverseLinkedListRec3(Node<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null){
            DoubleNode<Integer> ans = new DoubleNode<>();
            ans.head = head;
            ans.tail = head;
            return ans;
        }

        // solve small
        DoubleNode<Integer> smallAns = reverseLinkedListRec3(head.next);
        smallAns.tail.next = head;
        head.next = null;
        smallAns.tail = head;
        return smallAns;
    }

    // solving using the brute force/ common method
    // time Complexity O(N)
    // space complexity O(N)
    public static Node<Integer> reverseIterative1(Node<Integer> head){

        if (head == null || head.next == null){
            return head;
        }
        Node<Integer> temp = head;
        Node<Integer> newHead = null;
        Node<Integer> tail = null;

        while (temp != null){
            Node<Integer> newNode = new Node<>(temp.data);
            if (newHead == null){
                newHead = newNode;
                tail = newNode;
            }else {
                newNode.next = newHead;
                newHead = newNode;
            }
            temp = temp.next;
        }

        return newHead;
    }

    // reverse LL using iterative method by coding Ninja
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static Node<Integer> reverseIterative2(Node<Integer> head){

        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;

        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }

        return prev;
    }

    // reverse Iterative
    // tc - > O(n^2)
    // sc - > O(1)
    // this code without Length not possible
    // non-working code
    public static Node<Integer> reverseIterative3(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }

        Node<Integer> temp1 = head;
        Node<Integer> newHead = null;
        Node<Integer> newTail = null;

        while ( temp1 != null){

            Node<Integer> temp2 = head;
            while (temp2.next.next != null){

                temp2 = temp2.next;
            }

            if (newHead == null){
                newHead = temp2.next;
                newTail = temp2.next;
                newTail.next = temp2;
                newTail = temp2;
                temp2.next = null;
            }else{
                newTail.next = temp2;
                newTail = temp2;
                temp2.next = null;
            }

            temp1 = temp1.next;

        }

        return newHead;
    }

    public static Node<Integer> reverseIterative4(Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }


        int lengthOfLL = length(head);

        Node<Integer> newHead = null;
        Node<Integer> newTail = null;

        for (int i = 0 ; i < lengthOfLL-1 ; i++){
            Node<Integer> temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            if (newHead == null){
                newHead = temp.next;
                newTail = temp.next;
                newTail.next = temp;
                newTail = temp;
                temp.next = null;
            }else{
                newTail.next = temp;
                newTail = temp;
                temp.next = null;
            }
        }
        return newHead;
    }
    public static int length (Node<Integer> head){
        int count =0 ;
        while ( head != null){
            head = head.next;
            count++;
        }
        return count;
    }

    // code
    // reverse LL iterative
    // tc - O(n^2)
    // sc - O(N)
    public static Node<Integer> reverseLL (Node<Integer> head){
        if (head == null || head.next == null){
            return head;
        }

        int lengthOfLL = length(head);
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



    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        Node<Integer> ans = reverseIterative4(head);
        PrintLL.printLL(ans);
    }
}

