package assignment;

import lecture_plus_extra.Node;
import lecture_plus_extra.PrintLL;
import lecture_plus_extra.TakingLLInputs;

/**
 * Delete every N nodes
 * Send Feedback
 * You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
 * To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
 * Note :
 * No need to print the list, it has already been taken care. Only return the new head to the list.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * The first line of each test case or query contains the elements of the singly linked list separated by a single space.
 *
 * The second line of input contains two integer values 'M,' and 'N,' respectively. A single space will separate them.
 *  Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 * Output format :
 * For each test case/query, print the elements of the updated singly linked list.
 *
 * Output for every test case will be printed in a seperate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= P <= 10^5
 * Where P is the size of the singly linked list.
 * 0 <= M <= 10^5
 * 0 <= N <= 10^5
 *
 * Time Limit: 1sec
 * Sample Input 1 :
 * 1
 * 1 2 3 4 5 6 7 8 -1
 * 2 2
 * Sample Output 1 :
 * 1 2 5 6
 * Sample Input 2 :
 * 2
 * 10 20 30 40 50 60 -1
 * 0 1
 * 1 2 3 4 5 6 7 8 -1
 * 2 3
 * Sample Output 2 :
 * 1 2 6 7
 * Explanation of Sample Input 2 :
 * For the first query, we delete one node after every zero elements hence removing all the items of the list. Therefore, nothing got printed.
 *
 * For the second query, we delete three nodes after every two nodes, resulting in the final list, 1 -> 2 -> 6 -> 7.
 */

public class DeleteEveryNNode {

    // my solution
    public static Node<Integer> skipMDeleteN(Node<Integer> head, int M, int N){
        if (head == null || N == 0){
            return head;
        }
        if (M  == 0){
            return null;
        }

        Node<Integer> curr = head;
        Node<Integer> prev = null;

        while(curr != null){
            int i = 0 , j = 0;
            while (curr != null && i < M){
                prev = curr;
                curr = curr.next;
                i++;
            }
            while (curr != null && j < N){
                curr = curr.next;
                j++;
            }
            prev.next = curr;

        }

        return head;
    }

    // coding ninja solution
    public static Node<Integer> skipMDeleteN2(Node<Integer> head, int M, int N) {

        if (M == 0 || head == null) {
            return null;
        }
        if (N == 0){
            return head;
        }

        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while (curr != null) {

            int take = 0;
            int skip = 0;
            while (curr != null && take < M) {

                if (prev == null) {
                    prev = curr;
                } else {
                    prev.next = curr;
                    prev = curr;
                }
                curr = curr.next;
                take += 1;
            }
            while (curr != null && skip < N) {
                curr = curr.next;
                skip += 1;
            }
        }
        if (prev != null) {
            prev.next = null;
        }
        return head;
    }

    public static Node<Integer> skipMDeleteN3(Node<Integer> head, int M, int N){
        if (head == null || N == 0){
            return head;
        }
        if (M  == 0){
            return null;
        }

        Node<Integer> temp1 = head;
        Node<Integer> temp2;
//        Node<Integer> prev = null;
        while(temp1 != null){
            int i = 1 , j = 1;
            while (temp1 != null && i < M){
                temp1 = temp1.next;
                i++;
            }
            if (temp1 != null ){
                temp2 = temp1.next;
            }else{
                return head;
            }
            while (temp2 != null && j < N){
                temp2 = temp2.next;
                j++;
            }
            if (temp2 != null){
                temp2 = temp2.next;
            }

            temp1.next = temp2;
            temp1 = temp2;

        }

        return head;
    }


        public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        Node<Integer> ans = skipMDeleteN(head, 2 , 2 );
        PrintLL.printLL(ans);
    }
}
