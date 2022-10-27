package tree_basics;

public class DepthOfTree {

    // solving the question using the recursion,
    // or you can ues the print level wise method to solve the problem

    // print all the nodes at a depth k

    public static void printNodeAtKDepth(TreeNode<Integer> root, int k){
        // base case

        if(k < 0){
            return;
        }
        if (k == 0){
            System.out.println(root.data);
            return;
        }

        // solve the small to solve the big
        int childCount = root.children.size();
        for (int i = 0 ; i < childCount ; i++){
            printNodeAtKDepth(root.children.get(i),k-1 );
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root  = TakeInputLevelWise.takeTreeInputLevelWise();
        printNodeAtKDepth(root,2);
    }

}
