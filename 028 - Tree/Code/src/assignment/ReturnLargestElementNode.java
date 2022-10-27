package assignment;


import tree_basics.TakeInputLevelWise;
import tree_basics.TreeNode;

import javax.swing.text.TabableView;

public class ReturnLargestElementNode {

    // we will solve it using the recursion
    public static TreeNode<Integer> findLargestElementNode (TreeNode<Integer> root){
        // edge case
        if(root == null) {
            return null;
        }

        TreeNode<Integer> maxDataNode = root;

        for (int i = 0 ; i < root.children.size() ; i++){
            TreeNode<Integer> smallAns  = findLargestElementNode(root.children.get(i));
            if (smallAns.data >= maxDataNode.data){
                maxDataNode = smallAns;
            }
        }
        return maxDataNode;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(findLargestElementNode(root).data);
    }
}
