package tree_basics;

public class TreeNodeUse {

    // let's make a tree by creating individual nodes
    public static void main(String[] args) {

        // create individual nodes
//        TreeNode<Integer>  root = new TreeNode<>(4);
//        TreeNode<Integer>  node1 = new TreeNode<>(4);
//        TreeNode<Integer>  node2 = new TreeNode<>(4);
//        TreeNode<Integer>  node3 = new TreeNode<>(4);
//        TreeNode<Integer>  node4 = new TreeNode<>(4);

        // now link the individual nodes
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//
//        System.out.println("The End");

//        TreeNode<Integer> firstTree = TakeTreeInput.takeInput();
        TreeNode<Integer> firstTree = TakeTreeInput.takeInput();
//        PrintTree.printTree(firstTree);
        PrintTree.printTree(firstTree);
        System.out.println();


    }
}
