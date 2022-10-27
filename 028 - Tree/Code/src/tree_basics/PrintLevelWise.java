package tree_basics;

import java.util.Queue;
import java.util.LinkedList;

public class PrintLevelWise {

    public static void printLevelWise (TreeNode<Integer> root){
        if(root == null){
            return;
        }

        // make a pending Queue
        Queue<TreeNode> pendingQueue = new LinkedList<>();
        // insert the root inside pending queue
        pendingQueue.add(root);
        pendingQueue.add(null);
        System.out.println(root.data);

        // while loop
        while(!pendingQueue.isEmpty()){
            TreeNode<Integer> frontRoot;
            frontRoot = pendingQueue.poll();

            if(frontRoot == null){
                if(pendingQueue.isEmpty()){
                    break;
                }else{
                    System.out.println();
                    pendingQueue.add(null);
                }
            }else {
                int childCount = frontRoot.children.size();

                for (int i = 0; i < childCount; i++) {
                    TreeNode<Integer> child = frontRoot.children.get(i);
                    System.out.print(child.data + " ");
                    pendingQueue.add(child);
                }

            }
        }

    }


    // coding ninja method of printing level wise


    public static void printLevelWise2(TreeNode<Integer> root){
        if(root == null) {
            return;
        }

        Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
        TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
        q.add(root);
        q.add(nullNode);
        System.out.println(root.data);
        while(q.size()!=1) {
            TreeNode<Integer> temp= null;
            try {
                temp = q.poll();
            } catch (Exception e) {


            }
            if(temp==nullNode) {
                q.add(nullNode);
                System.out.println();
                continue;
            }

            for(int i = 0;i<temp.children.size();++i) {
                System.out.print(temp.children.get(i).data+" ");
                q.add(temp.children.get(i));
            }

        }
    }

}

