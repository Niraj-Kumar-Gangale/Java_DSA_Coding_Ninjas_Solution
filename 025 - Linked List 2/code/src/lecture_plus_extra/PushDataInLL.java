package lecture_plus_extra;

public class PushDataInLL {

    public static Node<Integer> pushDataInLL (Node<Integer> head ,int data){
        Node<Integer> newNode = new Node<>(data);

        if (head == null){
            return newNode;
        }else{
            Node<Integer> temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer>  head = null;

        head = pushDataInLL(head , 4);
        head = pushDataInLL(head , 5);
        head = pushDataInLL(head , 9);
        head = pushDataInLL(head , 8);
        PrintLL.printLL(head);
    }
}
