package tree_basics;

public class PrintTree {

    public static void printTree (TreeNode<Integer> root){
//        System.out.print(root.data);
//        System.out.print(":");
//        for (int i = 0; i < root.children.size(); i++) {
//            System.out.print(root.children.get(i).data + ",");
//        }
//        System.out.println();

        // better option then above
        String s = root.data +":";
        for (int i =  0 ; i < root.children.size() ; i++){
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);

        // now call the individual children of the current root
        for (int i = 0 ; i  < root.children.size() ; i++){
            printTree(root.children.get(i));
        }
    }
}
