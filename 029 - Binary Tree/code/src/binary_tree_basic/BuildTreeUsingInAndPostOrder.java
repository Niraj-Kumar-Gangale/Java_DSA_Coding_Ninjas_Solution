package binary_tree_basic;

/**
 *Construct Tree from Postorder and Inorder
 * Send Feedback
 * For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.
 * Note:
 * Assume that the Binary Tree contains only unique elements.
 * Input Format:
 * The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.
 *
 * The second line of input contains N integers, all separated by a single space. It represents the Postorder-traversal of the binary tree.
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
 * 4 5 2 6 7 3 1
 * 4 2 5 1 6 3 7
 * Sample Output 1:
 * 1
 * 2 3
 * 4 5 6 7
 * Sample Input 2:
 * 6
 * 2 9 3 6 10 5
 * 2 6 3 9 5 10
 * Sample Output 2:
 * 5
 * 6 10
 * 2 3
 * 9
 */

public class BuildTreeUsingInAndPostOrder {

    public static void main(String[] args) {
        int postOrder[] = new int[]{3,5,2};
        int inOrder[] = new int[]{3,2,5};
        BinaryTreeNode<Integer> ans = buildTree(postOrder,inOrder,0,2,0,2);
        PrintTreeLeveWise.printLevelWise(ans);

        System.out.println(postOrder.length);
    }
    public static BinaryTreeNode<Integer> buildTree(int[] postOrderArray, int[] inOrderArray, int pStart, int pEnd,int iStart, int iEnd){
        // edge case
        if (postOrderArray == null || inOrderArray == null ){
            return null;
        }

        // base case
        if(pStart == pEnd && iStart == iEnd){
            if (postOrderArray[pStart] == inOrderArray[iStart]){
                return new BinaryTreeNode<>(postOrderArray[pStart]);
            }
        }

        // make tree node
        BinaryTreeNode<Integer> root  = new BinaryTreeNode<>(postOrderArray[pEnd]);

        // find the length of the left and the right child tree
        int rootNodeData = postOrderArray[pEnd];
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
            root.left = buildTree(postOrderArray,inOrderArray,pStart,pStart+leftChildLength-1,
                    iStart,rootNodeIndex-1);
        }

        int rightChildLength = iEnd-rootNodeIndex;
        if (rightChildLength ==0){
            root.right = null;
        }else{

            root.right = buildTree(postOrderArray,inOrderArray,pStart+leftChildLength,pEnd-1,
                    rootNodeIndex+1,iEnd);
        }

        return root;
    }



    // now the solution by the Coding Ninja
}
