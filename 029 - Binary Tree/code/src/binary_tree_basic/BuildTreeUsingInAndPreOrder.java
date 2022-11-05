package binary_tree_basic;


/**
 * Code: Construct Tree from Preorder and Inorder
 * Send Feedback
 * For a given preorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.
 * Note:
 * Assume that the Binary Tree contains only unique elements.
 * Input Format:
 * The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.
 *
 * The second line of input contains N integers, all separated by a single space. It represents the preorder-traversal of the binary tree.
 *
 * The third line of input contains N integers, all separated by a single space. It represents the inorder-traversal of the binary tree.
 * Output Format:
 * The given input tree will be printed in a level order fashion where each level will be printed on a new line.
 * Elements on every level will be printed in a linear fashion. A single space will separate them.
 * Constraints:
 * 1 <= N <= 10^4
 * Where N is the total number of nodes in the binary tree.
 *
 * Time Limit: 1 sec
 * Sample Input 1:
 * 7
 * 1 2 4 5 3 6 7
 * 4 2 5 1 6 3 7
 * Sample Output 1:
 * 1
 * 2 3
 * 4 5 6 7
 * Sample Input 2:
 * 6
 * 5 6 2 3 9 10
 * 2 6 3 9 5 10
 * Sample Output 2:
 * 5
 * 6 10
 * 2 3
 * 9
 */

public class BuildTreeUsingInAndPreOrder {

    public static void main(String[] args) {
        int preOrder[] = new int[]{2,3,5};
        int inOrder[] = new int[]{3,2,5};
        BinaryTreeNode<Integer> ans = buildTree(preOrder,inOrder,0,2,0,2);
        PrintTreeLeveWise.printLevelWise(ans);

        System.out.println(preOrder.length);
    }
    public static BinaryTreeNode<Integer> buildTree(int[] preOrderArray, int[] inOrderArray, int pStart, int pEnd,int iStart, int iEnd){
        // edge case
        if (preOrderArray == null || inOrderArray == null ){
            return null;
        }

        // base case
        if(pStart == pEnd && iStart == iEnd){
            if (preOrderArray[pStart] == inOrderArray[iStart]){
                return new BinaryTreeNode<>(preOrderArray[pStart]);
            }
        }

        // make tree node
        BinaryTreeNode<Integer> root  = new BinaryTreeNode<>(preOrderArray[pStart]);

        // find the length of the left and the right child tree
        int rootNodeData = preOrderArray[pStart];
        int rootNodeIndex = iStart;
        for (int i = iStart ;  i <= iEnd ; i++){
            if (inOrderArray[i] == rootNodeData) {
                rootNodeIndex = i;
                break;
            }
        }
        int leftChildLength = rootNodeIndex - iStart;
        if(leftChildLength == 0 ){
            root.left = null;
        }else{
            // pick out the left child part form the array
            root.left = buildTree(preOrderArray,inOrderArray,pStart+1,pStart+leftChildLength,
                    iStart,rootNodeIndex-1);
        }

        int rightChildLength = iEnd-rootNodeIndex;
        if (rightChildLength ==0){
            root.right = null;
        }else{
            root.right = buildTree(preOrderArray,inOrderArray,pStart+1+leftChildLength,pEnd,
                    rootNodeIndex+1,iEnd);
        }

        return root;
    }



    /// solution by the coding ninja

}
