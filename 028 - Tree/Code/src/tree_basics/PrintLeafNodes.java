package tree_basics;

public class PrintLeafNodes {

    // we need to print the leafs nodes
    public static void printLeafNodes(TreeNode<Integer> root){
        if (root == null){
            return;
        }
        if (root.children.size() == 0){
            System.out.println(root.data);
            return;
        }
        // solve the small to solve the big
        int childCount = root.children.size();
        for (int i = 0 ;  i < childCount ; i ++){
            printLeafNodes(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        printLeafNodes(root);
    }
}
