package binary_tree_basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakingInputLevelWise {

    // let's make a function
    public static  BinaryTreeNode<Integer> takingLevelWise (){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root data value");
        int rootData = s.nextInt();
        // important condition that you forget to put
        //---------------------------------
        if (rootData == -1){
            return null;
        }
        //---------------------------------
        BinaryTreeNode<Integer> root  = new BinaryTreeNode<>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);

        while (!pendingQueue.isEmpty()){

            BinaryTreeNode<Integer> frontNode = pendingQueue.poll();
            System.out.println("Enter the data value for left node "+ frontNode.data);
            int leftNodeData = s.nextInt();
            System.out.println("Enter the data value for right node "+ frontNode.data);
            int rightNodeData = s.nextInt();

            if (leftNodeData != -1){
                // create a binary tree node
                BinaryTreeNode<Integer> leftNode  = new BinaryTreeNode<>(leftNodeData);
                // add the node to main tree
                frontNode.left = leftNode;
                // add the node to the queue
                pendingQueue.add(leftNode);
            }

            if (rightNodeData != -1){
                // create a binary tree node
                BinaryTreeNode<Integer> rightNode  = new BinaryTreeNode<>(rightNodeData);
                // add the node to main tree
                frontNode.right = rightNode;
                // add the node to the queue
                pendingQueue.add(rightNode);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takingLevelWise();
        PrintDataRecursively.printDataRecursively(root);
        System.out.println();
    }

}
