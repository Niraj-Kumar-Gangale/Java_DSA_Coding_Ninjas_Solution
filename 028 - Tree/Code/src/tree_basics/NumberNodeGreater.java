package tree_basics;

public class NumberNodeGreater {

    // we have to find the total number of nodes greater than the given number

    public static int numNodeGreater(TreeNode<Integer> root,int x){

        // edge case
        if (root == null){
            return Integer.MIN_VALUE;
        }
        int greaterThanXCount = 0;
        if (x < root.data){
            greaterThanXCount++;
        }

        int childCount = root.children.size();
        for (int i = 0 ; i < childCount ;  i++){
            greaterThanXCount += numNodeGreater(root.children.get(i),x );
        }
        return greaterThanXCount;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(numNodeGreater(root,5));
    }
}
