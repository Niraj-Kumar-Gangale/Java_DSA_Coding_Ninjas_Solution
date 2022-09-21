package assignment;

import lecture_plus_extra.Node;

public class FindNodeInLL {

    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        if (head == null){
            return -1;
        }
        if (head.data == n){
            return 0;
        }
        int smallAns = findNodeRec(head.next, n);
        if(smallAns == -1){
            return -1;
        }

        return 1+smallAns;
    }
}
