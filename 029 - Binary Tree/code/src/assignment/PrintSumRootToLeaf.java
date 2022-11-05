package assignment;

/**
 * Path Sum Root to Leaf
 * Send Feedback
 * For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.
 * Example:
 * alt txt
 *
 * If you see in the above-depicted picture of Binary Tree, we see that there are a total of two paths, starting from the root and ending at the leaves which sum up to a value of K = 13.
 *
 * The paths are:
 * a. 2 3 4 4
 * b. 2 3 8
 *
 * One thing to note here is, there is another path in the right sub-tree in reference to the root, which sums up to 13 but since it doesn't end at the leaf, we discard it.
 * The path is: 2 9 2(not a leaf)
 *  Input Format:
 * The first line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
 *
 * The second line of input contains an integer value K.
 * Output Format:
 * Lines equal to the total number of paths will be printed. All the node data in every path will be printed in a linear fashion taken in the order they appear from top to down bottom in the tree. A single space will separate them all.
 * Constriants:
 * 1 <= N <= 10^5
 * 0 <= K <= 10^8
 * Where N is the total number of nodes in the binary tree.
 *
 * Time Limit: 1 second
 * Sample Input 1:
 * 2 3 9 4 8 -1 2 4 -1 -1 -1 6 -1 -1 -1 -1 -1
 * 13
 *  Sample Output 1:
 * 2 3 4 4
 * 2 3 8
 * Sample Input 2:
 * 5 6 7 2 3 -1 1 -1 -1 -1 9 -1 -1 -1 -1
 * 13
 *  Sample Output 2:
 * 5 6 2
 * 5 7 1
 */

import binary_tree_basic.BinaryTreeNode;

public class PrintSumRootToLeaf {

    public static void main(String[] args) {

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
