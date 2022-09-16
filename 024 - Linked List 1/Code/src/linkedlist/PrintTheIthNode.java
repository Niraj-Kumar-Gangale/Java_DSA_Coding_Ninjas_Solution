package linkedlist;

public class PrintTheIthNode {

    // my solution
    public static void printIthNode(Node<Integer> head, int i){
        //Your code goes here
        Node<Integer> temp = head ;
        int j = 0;

        while(temp != null && j<=i){
            if(j==i){
                System.out.println(temp.data);
                break;
            }
            temp = temp.next;
            j++;
        }
    }


    // coding Ninja Solution
    public static void printIthNode2(Node<Integer> head, int i){
        int position = 0;
        Node<Integer> temp = head;
        while(temp != null && position < i) {
            temp = temp.next;
            position++;
        }
        if(temp != null){
            System.out.println(temp.data);
        }
    }


    public static void main(String[] args) {
        Node<Integer> head;
        head = TakingLLInputs.takingInput();
        printIthNode(head,5);
        printIthNode(head,5);

    }
}
