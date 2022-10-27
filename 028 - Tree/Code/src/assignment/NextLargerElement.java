package assignment;
/**
 * Next larger element
 * Send Feedback
 * Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
 * Return NULL if no node is present with value greater than n.
 * Input format :
 *
 * Line 1 : Integer n
 *
 * Line 2 : Elements in level order form separated by space (as per done in class). Order is -
 *
 * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
 *
 * Output format : Node with value just greater than n.
 *
 * Sample Input 1 :
 * 18
 * 10 3 20 30 40 2 40 50 0 0 0 0
 * Sample Output 1 :
 * 20
 * Sample Input 2 :
 * 21
 * 10 3 20 30 40 2 40 50 0 0 0 0
 * Sample Output 2:
 * 30
 */

import tree_basics.TakeInputLevelWise;
import tree_basics.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class NextLargerElement {
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
        // Write your code here
        // edge case
        if (root == null){
            return  null;
        }
        TreeNode<Integer> ans = null;
        if (root.data  > n){
            return root;
        }

        //for loop
        for (int i = 0 ; i < root.children.size() ;i++){
            TreeNode<Integer> smallAns = findNextLargerNode(root.children.get(i),n );
            if (smallAns != null) {
                return smallAns;
            }
        }
        return null;

    }

    // sir method involve searching for the value in level wise Method
    // so let's use the method of the pending queue

    public static TreeNode<Integer> findNextLargerNode2(TreeNode<Integer> root, int n){
        // Write your code here
        if (root == null){
            return null;
        }
        Queue<TreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);

        while (!pendingQueue.isEmpty()){
            TreeNode<Integer> frontNode = pendingQueue.poll();
            // compare the frontNode data with the value of n
            System.out.println(frontNode.data);
            if (frontNode.data > n){
                return frontNode;
            }
            for (int i = 0 ; i < frontNode.children.size() ; i++){
                TreeNode<Integer> child = frontNode.children.get(i);
                // add in the queue
                pendingQueue.add(child);
            }
        }
        return null;
    }

    // above is wrong we do not want the first Posiible choice
    // we want the node from all possible value
    public static TreeNode<Integer> findNextLargerNode3(TreeNode<Integer> root, int n){
        // Write your code here
        if (root == null){
            return null;
        }
        Queue<TreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);
        TreeNode<Integer> nextLargeNode = null;
        while (!pendingQueue.isEmpty()){
            TreeNode<Integer> frontNode = pendingQueue.poll();
            // compare the frontNode data with the value of n
            if (frontNode.data > n){
                if(nextLargeNode == null){
                    nextLargeNode = frontNode;
                }else if(frontNode.data < nextLargeNode.data){
                    nextLargeNode = frontNode;
                }

            }
            for (int i = 0 ; i < frontNode.children.size() ; i++){
                TreeNode<Integer> child = frontNode.children.get(i);
                // add in the queue
                pendingQueue.add(child);
            }
        }
        return nextLargeNode;
    }

    // solving the above question using recursion
    // correct solution
    public static TreeNode<Integer> findNextLargerNode4(TreeNode<Integer> root, int n){
        // Write your code here
        // edge case
        if (root == null){
            return  null;
        }
        TreeNode<Integer> ans = null;
        if (root.data  > n){
            ans = root;
        }

        //for loop
        for (int i = 0 ; i < root.children.size() ;i++){
            TreeNode<Integer> smallAns = findNextLargerNode(root.children.get(i),n );
            if (smallAns != null) {
                if (ans == null){
                    ans = smallAns;
                }else if (smallAns.data < ans.data){
                        ans = smallAns;
                }
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        TreeNode<Integer> root  = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(findNextLargerNode2(root,30).data);
        System.out.println();
    }

}
