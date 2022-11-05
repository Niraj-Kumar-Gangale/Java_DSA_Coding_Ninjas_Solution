package assignment;

import binary_tree_basic.BinaryTreeNode;

public class PrintSumRootToLeaf {

    public static void main(String[] args) {
//        int arr[] = null;
//        int arr2[] = new int[0];
//        System.out.println(arr[0]);
//        System.out.println(arr2[0]);
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        int[] ansArray = new int[0];
        rootToLeafPathsSumToK2(root,k,ansArray);

    }

    public static void rootToLeafPathsSumToK2(BinaryTreeNode<Integer> root, int k, int[] ans) {
        //Your code goes here
        // edge case
        if (root == null){
            return;
        }

        // new ans
        int[] newAns = new int[ans.length+1];
        System.arraycopy(ans, 0, newAns, 0, ans.length);
        newAns[ans.length]= root.data;;



        // base case
        if (root.left == null && root.right == null && (k- root.data) == 0){
            // print the ansArray
            for (int i = 0 ; i < newAns.length; i++){
                System.out.println(newAns[i]+" ");
            }
            System.out.println();
            return;
        }

        rootToLeafPathsSumToK2(root.left,k- root.data,newAns);
        rootToLeafPathsSumToK2(root.right,k- root.data,newAns);


    }
}
