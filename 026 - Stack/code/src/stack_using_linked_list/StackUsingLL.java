package stack_using_linked_list;

public class StackUsingLL {

    private Node head;
    private int size;
    //Define the data members


    public StackUsingLL() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return head == null;
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if (head == null){
            return -1;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int top() {
        //Implement the top() function
        if (head == null ){
            return -1;
        }
        return head.data;
    }
}
