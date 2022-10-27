package tree_basics;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeSum {

    // we just have to modify the total node count such it sums the node values instead
    // of counting

    public static int totalNodeSum(TreeNode<Integer> root) {
        Queue<TreeNode> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);
        int sum = root.data;
        while (!pendingQueue.isEmpty()) {
            TreeNode<Integer> frontNode = pendingQueue.poll();
            int child_count = frontNode.children.size();
            for (int i = 0; i < child_count; i++) {
                TreeNode<Integer> child = frontNode.children.get(i);
                pendingQueue.add(child);
                sum += child.data;
            }

        }
        return sum;
    }

    // we can also solve this question using the recursion
    public static int totalNodeSum2(TreeNode<Integer> root){
        if (root == null){
            return Integer.MIN_VALUE;
        }
        // solving the small problem
        int totalSum = root.data;
        int childCount  = root.children.size();
        for (int i = 0 ; i  < childCount ; i++){
            totalSum  += totalNodeSum2(root.children.get(i));
        }

        return totalSum;
    }
}
