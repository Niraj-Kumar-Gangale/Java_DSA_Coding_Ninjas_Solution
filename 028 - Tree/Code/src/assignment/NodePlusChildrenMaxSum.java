package assignment;

import tree_basics.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Node having sum of children and node is max
 * Send Feedback
 * Given a tree, find and return the node for which sum of data of all children and the node itself is maximum. In the sum, data of node itself and data of immediate children is to be taken.
 * Input format :
 *
 * Line 1 : Elements in level order form separated by space (as per done in class). Order is -
 *
 * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
 *
 * Output format : Node with maximum sum.
 *
 * Sample Input 1 :
 * 5 3 1 2 3 1 15 2 4 5 1 6 0 0 0 0
 * Sample Output 1 :
 * 1
 */

public class NodePlusChildrenMaxSum {

    // I tired using the recursion but i was not able to do it.
    // so I used the queue method
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here
        Queue<TreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);
        int max_sum = 0;
        int total_sum = 0;
        TreeNode<Integer> maxNode= root;
        while (!pendingQueue.isEmpty()){
            total_sum = 0;
            TreeNode<Integer> frontNode = pendingQueue.poll();
            total_sum += frontNode.data;
            if (frontNode.children.size() == 0){
                continue;
            }
            for (int i = 0; i < frontNode.children.size(); i++) {
                TreeNode<Integer> child = frontNode.children.get(i);
                pendingQueue.add(child);
                total_sum  += child.data;
            }
            if (total_sum >= max_sum){
                max_sum = total_sum;
                maxNode = frontNode;
            }
        }
        return maxNode;
    }


    // we can do it using the recursion we just need a little modification
    // BY CODING NINJA

    static class MaxNodePair<T>{
        TreeNode<T> node;
        int sum;
    }

    public static TreeNode<Integer> maxSumNode2(TreeNode<Integer> root){
        return maxSumNodeHelper(root).node;
    }

    public static MaxNodePair<Integer> maxSumNodeHelper(TreeNode<Integer> root) {
        if (root == null) {
            MaxNodePair<Integer> pair = new MaxNodePair<>();
            pair.node = null;
            pair.sum = Integer.MIN_VALUE;
            return pair;
        }
        int sum = root.data;
        for (TreeNode<Integer> child : root.children) {
            sum += child.data;
        }
        MaxNodePair<Integer> ans = new MaxNodePair<>();
        ans.node = root;
        ans.sum = sum;
        for (TreeNode<Integer> child : root.children) {
            MaxNodePair<Integer> childAns = maxSumNodeHelper(child);
            if (childAns.sum > ans.sum) {
                ans = childAns;
            }
        }
        return ans;
    }
}
