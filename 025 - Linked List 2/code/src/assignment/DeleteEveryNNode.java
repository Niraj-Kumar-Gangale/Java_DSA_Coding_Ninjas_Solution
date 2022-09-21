package assignment;

import lecture_plus_extra.Node;
import lecture_plus_extra.PrintLL;
import lecture_plus_extra.TakingLLInputs;

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
