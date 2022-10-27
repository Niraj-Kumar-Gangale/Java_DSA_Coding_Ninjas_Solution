package tree_basics;


import com.sun.source.tree.Tree;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

    // we want to create a function that take tree input level wise.
    //our method works fine.

    public static TreeNode<Integer> takeTreeInputLevelWise (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the root node data");
        int rootNodeData = scan.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootNodeData);
        Queue<TreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);

        while(!pendingQueue.isEmpty()){
            TreeNode<Integer> tempNode = pendingQueue.poll();
            System.out.println("Enter the number of children of " + tempNode.data);
            int childCount = scan.nextInt();
            for (int i = 1 ; i <= childCount ; i++){
                System.out.println("Enter the "+ i + "th child data of " + tempNode.data );
                int childData = scan.nextInt();
                TreeNode<Integer> child = new TreeNode<>(childData);
                //add the data in the queue and in the tree node
                pendingQueue.add(child);
                tempNode.children.add(child);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode<Integer>  root = takeTreeInputLevelWise();
        PrintLevelWise.printLevelWise(root);
        System.out.println();
    }

}
