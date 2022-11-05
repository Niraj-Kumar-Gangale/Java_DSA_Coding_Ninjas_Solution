package binary_tree_basic;

public class PrintDataRecursively {

    public static void printDataRecursively(BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }
//        System.out.print(root.data+ " ");
//        // print the left and right with the root data for convenience
//        if (root.left != null){
//            System.out.print("L:" + root.left.data + ",");
//        }
//        if (root.right != null){
//            System.out.println("R:" + root.right.data );
//        }
        String s = root.data + " ";
        if (root.left != null){
            s += "L:" + root.left.data + ",";
        }
        if (root.right != null){
            s += "R:" + root.right.data ;
        }

        System.out.println(s);

        // call the left and right print individually
        printDataRecursively(root.left);
        printDataRecursively(root.right);
    }
}
