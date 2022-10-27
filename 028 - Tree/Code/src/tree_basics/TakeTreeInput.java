package tree_basics;

import java.util.Scanner;

public class TakeTreeInput {

    public static TreeNode<Integer> takeInput (){
        int nodeData = 0 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the node data");
        nodeData = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<>(nodeData);
        System.out.println("Enter the Total Child count");
        int childCount = scan.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }


}
