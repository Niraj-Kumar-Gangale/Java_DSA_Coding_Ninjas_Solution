package tree_basics;

import com.sun.jdi.IntegerValue;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeCount {

    //the function to count the total number of the nodes in the tree
    // if we modify the print a little then we will have our own function
    public static int treeNodeCount (TreeNode<Integer> root){

        Queue<TreeNode> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);
        int count = 1;
        while(!pendingQueue.isEmpty()){
            TreeNode<Integer> frontNode = pendingQueue.poll();
            int child_count = frontNode.children.size();
            for (int i = 0 ; i < child_count ; i++){
                TreeNode<Integer> child = frontNode.children.get(i);
                pendingQueue.add(child);
                count++;
            }

        }
        return count;
    }

    // solving the above the recursion
    public static int treeNodeCount2(TreeNode<Integer> root){
        if (root == null){
            return 0;
        }

        //solving the small problem
        int totalNodeCount = 1;
        int childCount = root.children.size();
        for (int i = 0 ; i < childCount ; i++){
            totalNodeCount += treeNodeCount2(root.children.get(i));
        }
        return totalNodeCount;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(treeNodeCount(root));
        System.out.println(treeNodeCount2(root));
    }
}
