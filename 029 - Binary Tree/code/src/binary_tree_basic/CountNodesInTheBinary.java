package binary_tree_basic;

public class CountNodesInTheBinary {
    // function to count the nodes in the binary

    public static int countNodesInTheBinaryTree(BinaryTreeNode<Integer> root){
        // how to count the nodes in the binary
        // base case
        if(root == null){
            return 0;
        }

        // sum up the returned value from the recursion
        // add the left and the right values

        return countNodesInTheBinaryTree(root.left )+ countNodesInTheBinaryTree(root.right)+ 1;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputRecursively.takeInputRecursively();
        System.out.println(countNodesInTheBinaryTree(root));
    }
}
