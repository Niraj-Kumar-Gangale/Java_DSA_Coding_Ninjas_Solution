package tree_basics;

public class TreeTraversals {

    // there are 3 tree traversal that i know
    // 1] level wise
    // 2] pre-order
    // 3] post-order

    // preorder is similar to the recursion
    // i.e. first head than child
    /*
              1
          2       3
       4    5   6    7

       preorder  1 2 4 5 3 6 7

       postorder 4 5 2 6 7 3 1

     */
    public static void preOrder (TreeNode<Integer> root){
        if (root == null ){
            return ;
        }
        System.out.println(root.data);
        for (int i = 0  ; i < root.children.size() ; i++){
            preOrder(root.children.get(i));
        }
    }

    public static void postOrder (TreeNode<Integer> root){
        if (root  == null){
            return;
        }
        for (int i = 0  ; i < root.children.size() ; i++){
            postOrder(root.children.get(i));
        }
        System.out.println(root.data);

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}
