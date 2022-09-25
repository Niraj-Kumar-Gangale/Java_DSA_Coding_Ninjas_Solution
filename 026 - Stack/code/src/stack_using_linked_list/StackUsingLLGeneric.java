package stack_using_linked_list;

import java.util.EmptyStackException;

public class StackUsingLLGeneric<T> {
    private NodeGeneric<T> head;
    private int size;
    //Define the data members


    public StackUsingLLGeneric() {
        //Implement the Constructor
        head = null;
        size = 0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int size() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return head == null;
    }

    public void push(T element) {
        //Implement the push(element) function
        NodeGeneric<T> newNode = new NodeGeneric<>(element);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public T pop() {
        //Implement the pop() function
        if (head == null){
            throw new EmptyStackException();
        }
        T value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public T top() {
        //Implement the top() function
        if (head == null ){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public static void main(String[] args) {

    }
}
