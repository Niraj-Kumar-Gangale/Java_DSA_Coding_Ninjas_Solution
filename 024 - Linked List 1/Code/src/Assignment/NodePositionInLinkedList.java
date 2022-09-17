package Assignment;

import linkedlist.Node;
import linkedlist.TakingLLInputs;

public class NodePositionInLinkedList {

    public static int findNode(Node<Integer> head, int n) {
        // Write your code here.
        int count = 0;
        Node<Integer> tempHead = head;
        while(tempHead != null){
            if (tempHead.data == n){
                return count;
            }
            tempHead = tempHead.next;
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        System.out.println(findNode(head, 2));
    }
}
