package binary_tree_basic;

/**
 *Diameter Of Binary Tree
 * Send Feedback
 * For a given Binary of type integer, find and return the ‘Diameter’.
 * Diameter of a Tree
 * The diameter of a tree can be defined as the maximum distance between two leaf nodes.
 * Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.
 * Example:
 * alt txt
 *
 * The maximum distance can be seen between the leaf nodes 8 and 9.
 * The distance is 9 as there are a total of nine nodes along the longest path from 8 to 9(inclusive of both). Hence the diameter according to the definition will be 9.
 * Input Format:
 * The first and the only line of input will contain the node data, all separated by a single space. Since -1 is used as an indication whether the left or right node data exist for root, it will not be a part of the node data.
 * Output Format:
 * The only line of output prints an integer, representing the diameter of the tree.
 * Note:
 * You are not required to print anything explicitly. It has already been taken care of.
 * Constraints:
 * 1 <= N <= 10^5
 * Where N is the total number of nodes in the binary tree.
 *
 * Time Limit: 1 sec
 * Sample Input 1:
 * 2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1
 * Sample Output 1:
 * 9
 * Sample Input 2:
 * 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
 * Sample Output 2:
 * 5
 */

public class DiameterOfTree {

    public static int diameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int option1 = 1+height(root.left) + height(root.right);
        int option2 = 1+diameter(root.left);
        int option3 = 1+diameter(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }

    // --> my solution was the below one
    // what because the answer is 5 but my answer will be 4
    // if answer is 7 then my answer will be 6
    // so i made the changes of adding the value of adding 1 to all the option

//    public static int diameter(BinaryTreeNode<Integer> root) {
//        if (root == null) {
//            return 0;
//        }
//
//        int option1 = 1+height(root.left) + height(root.right);
//        int option2 = 1+diameter(root.left);
//        int option3 = 1+diameter(root.right);
//        return Math.max(option1, Math.max(option2, option3));
//    }

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }
}
