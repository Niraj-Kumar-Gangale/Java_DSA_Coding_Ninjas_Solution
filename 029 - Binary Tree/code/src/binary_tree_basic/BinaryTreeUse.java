package binary_tree_basic;

public class BinaryTreeUse {

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = TakeInputRecursively.takeInputRecursively();
        PrintDataRecursively.printDataRecursively(root);
        System.out.println();
    }
}
