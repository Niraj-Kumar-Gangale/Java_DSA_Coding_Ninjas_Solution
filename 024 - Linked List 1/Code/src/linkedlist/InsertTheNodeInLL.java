package linkedlist;


public class InsertTheNodeInLL {

    /**
     * Method to insert the value in linked list
     * @param head the head of the linked list
     * @param pos the position to insert
     * @param data the value to insert
     * @return the head reference of the linked list
     */
    public static Node<Integer> insert (Node<Integer>  head, int pos , int data)  {

        if (pos < 0){
            throw new InsertPositionOutOfBound("position value is less than 0");
        }

        Node<Integer>  newNode = new Node<>(data);
        if (pos == 0){
            newNode.next = head;
            return newNode;
        }
        Node<Integer> temp = head;
        int i = 0;
        while ((temp!=null)&&i < pos-1){
            temp = temp.next;
            i++;
        }

        if (temp != null){
            newNode.next = temp.next;
            temp.next = newNode;
        }else{
            throw new InsertPositionOutOfBound("position "+pos+" is out of range of Insertion "+ 0 + " to " + LinkedListLength.length(head));
        }

        return head;
    }

    public static void main(String[] args)  {
        Node<Integer> head ;
        head = TakingLLInputs.takingInput();
        head = insert(head, 1, 45);
        LinkedListPrint.printLinkedList(head);
    }
}
