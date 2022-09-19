package lecture_plus_extra;

public class InsertRecursively {

    // my solution is same as the Coding Ninjas
    public static Node<Integer> insertRecursively (Node<Integer> head ,int pos , int data){
        // base case
        if (pos == 0 ){
            Node<Integer> newNode = new Node<>(data);
            newNode.next = head;
            return newNode;
        }
        if (head == null || pos < 0){
            return head;
        }

        // smallAns
        Node<Integer> smallAns = insertRecursively(head.next , pos-1, data);

        // solve big using the  small
        head.next = smallAns;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        head = insertRecursively(head, 4 ,78);
        PrintLL.printLL(head);
    }
}
