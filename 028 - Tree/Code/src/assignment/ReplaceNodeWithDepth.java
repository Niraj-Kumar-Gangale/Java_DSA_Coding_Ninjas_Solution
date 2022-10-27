package assignment;
/**
 * Replace node with depth
 * Send Feedback
 * In a given Generic Tree, replace each node with its depth value. You need to just update the data of each node, no need to return or print anything.
 * Input format :
 *
 * Line 1 : Elements in level order form separated by space (as per done in class). Order is -
 *
 * Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
 *
 * Sample Input 1 :
 * 10 3 20 30 40 2 40 50 0 0 0 0
 * Sample Output 1 : (Level wise, each level in new line)
 * 0
 * 1 1 1
 * 2 2
 */

import tree_basics.PrintLevelWise;
import tree_basics.TakeInputLevelWise;
import tree_basics.TreeNode;

public class ReplaceNodeWithDepth {

    public static void replaceWithDepthValue(TreeNode<Integer> root){
        // edge case
        replaceWithDepthValueNew(root,0);
    }

    private static void replaceWithDepthValueNew(TreeNode<Integer> root, int depth) {
        if (root == null){
            return;
        }

        // change the current node with depth
        root.data = depth;

        for (int i = 0 ; i < root.children.size() ; i++){
            replaceWithDepthValueNew(root.children.get(i), depth+1);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root  = TakeInputLevelWise.takeTreeInputLevelWise();
        replaceWithDepthValue(root);
        PrintLevelWise.printLevelWise(root);
    }
}
