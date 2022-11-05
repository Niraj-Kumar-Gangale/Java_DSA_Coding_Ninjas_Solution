package binary_tree_basic;


import java.util.Scanner;

public class TakeInputRecursively {

    public static BinaryTreeNode<Integer> takeInputRecursively(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Node data");
        int rootData = scan.nextInt();
        if (rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root  = new BinaryTreeNode<>(rootData);
        // call the left and right
        root.left = takeInputRecursively();
        root.right = takeInputRecursively();

        return root;
    }
}
