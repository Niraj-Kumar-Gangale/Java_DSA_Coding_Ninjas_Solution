package tree_basics;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeHeight {

//            Time complexity: O(N)
//            Space complexity: O(H)
//
//            where N is the number of nodes in the tree and
//            H is the height/depth of the tree

    public static int getHeight(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int maxChildHeight = 0;
        // solve the small to solve the big
        int childCount = root.children.size();
        for (int i = 0 ; i < childCount ; i++){
            int childHeight = getHeight(root.children.get(i));
            if (childHeight > maxChildHeight ){
                maxChildHeight  = childHeight;
            }
        }

        return 1+maxChildHeight;
    }

    // using the method of [print level wise]
    // without recursion
    // time complexity is O(n)
    // space complexity depends on the total count of tree node in the last row.
    public static int treeHeight2(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> pendingQueue = new LinkedList<>();
        pendingQueue.add(root);
        pendingQueue.add(null);
        int tree_height = 0;
        while(!pendingQueue.isEmpty()){
            TreeNode<Integer> frontNode = pendingQueue.poll();
            if (frontNode == null){
                tree_height++;
                if (pendingQueue.isEmpty()){
                    break;
                }else{
                    pendingQueue.add(null);
                    System.out.println();
                }
            }else{
                int childCount = frontNode.children.size();
                for (int i = 0 ; i < childCount ; i++){
                    TreeNode<Integer> child = frontNode.children.get(i);
                    pendingQueue.add(child);
                }
            }
        }
        return tree_height;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(treeHeight2(root));
    }

}
