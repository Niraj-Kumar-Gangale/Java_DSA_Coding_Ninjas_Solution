package tree_basics;

import java.sql.SQLOutput;

public class CountLeafNode {

    // we need to return the count of the total leaf nodes
    public static int returnLeafCount(TreeNode<Integer> root){
        if(root.children.size()  == 0){
            return 1;
        }

        int count = 0;
        int childCount  = root.children.size();
        for (int i = 0 ; i < childCount ; i++){
            count += returnLeafCount(root.children.get(i));
        }
        return count;
    }

    // if I had written the program than
    public static int returnLeafCount2(TreeNode<Integer> root){
        // edge case
        if (root == null){
            return Integer.MIN_VALUE;
        }

        // base case
        if(root.children.size()  == 0){
            return 1;
        }

        int count = 0;
        int childCount  = root.children.size();
        for (int i = 0 ; i < childCount ; i++){
            count += returnLeafCount2(root.children.get(i));
        }
        return count;
    }



    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(returnLeafCount(root));
    }
}
