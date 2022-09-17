package linkedlist;

public class DeleteNodeInLinkedList {


    public static Node<Integer> deleteNode (Node<Integer>  head, int pos)  {

        if (pos < 0){
            throw new InsertPositionOutOfBound("position value is less than 0");
        }
        if (head == null){
            return null;
        }
        Node<Integer> temp = head;
        if (pos == 0){
            head = temp.next;
            return head;
        }
        int i = 0;
        while ((temp!=null)&&i < pos-1){
            temp = temp.next;
            i++;
        }

        if (temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
        else{
            throw new InsertPositionOutOfBound("position "+pos+" is out of range of deletion "+ 0 + " to " + (LinkedListLength.length(head)-1));
        }

        return head;
    }


    public static void main(String[] args) {
        Node<Integer> head;
        head = TakingLLInputs.takingInput();
        head = deleteNode(head, 0);
        LinkedListPrint.printLinkedList(head);
    }

}
