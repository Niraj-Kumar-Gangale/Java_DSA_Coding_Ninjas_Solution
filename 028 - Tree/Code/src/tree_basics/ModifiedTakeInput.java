package tree_basics;

import java.util.Scanner;

public class ModifiedTakeInput {

    public static TreeNode<Integer> ModifiedTakeInput (Scanner s){
        int nodeData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<>(nodeData);
        int childCount = s.nextInt();
        for (int i = 0 ; i < childCount ; i++){
            TreeNode<Integer> child = ModifiedTakeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // implement the taking input
        TreeNode<Integer> root = ModifiedTakeInput(scan);
        // print the tree
        PrintTree.printTree(root);


    }
}
