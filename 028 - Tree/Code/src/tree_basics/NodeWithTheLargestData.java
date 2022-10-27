package tree_basics;

public class NodeWithTheLargestData {


    // we need to write a function in order to find the max of the
    // all the data node present

    public static int largestOfAllNodeData (TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        // solving  the  small problem   to solve the bigger
        int maxValue = root.data;
        int childCount = root.children.size();
        for (int i = 0 ; i < childCount ;i++){
            int smallAns = largestOfAllNodeData(root.children.get(i));
            if(smallAns >= maxValue){
                maxValue = smallAns;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TakeInputLevelWise.takeTreeInputLevelWise();
        System.out.println(largestOfAllNodeData(root));
    }
}
