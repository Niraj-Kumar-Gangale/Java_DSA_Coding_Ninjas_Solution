package stack_using_linked_list;

import java.util.EmptyStackException;
import java.util.logging.SocketHandler;

public class StackUsingTheLinkedList {

    private Node head ;
    private Node tail;
    private int size;


    public StackUsingTheLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // implement the size method
    // O(1)
    public int size (){
        return size;
    }

    // implement the isEmpty
    // O(1)
    public boolean isEmpty(){
        return size == 0;
    }

    // implement the top function
    // O(1)
    public int top(){
        if (size == 0){
            throw new EmptyStackException();
        }
        return tail.data;
    }

    // implement the push method
    // O(1)
    public void push(int element){
        Node newNode = new Node(element);
        if (head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    // pop implementation
    //  O(N)
    public int pop (){
        if (head == null ){
            throw new EmptyStackException();
        }
        if (size == 1){
            int value = head.data;
            head = null; tail = null;
            size--;
            return value;
        }
        int value = tail.data;

        tail = head;
        for (int i = 1 ; i < size-1 ;i++){
            tail = tail.next;
        }
        size--;
        return value;
    }

    public static void main(String[] args) {
        StackUsingTheLinkedList newStack = new StackUsingTheLinkedList();
        newStack.push(17);
        System.out.println(newStack.top());
        newStack.push(23);
        System.out.println(newStack.top());
        newStack.push(11);
        System.out.println(newStack.top());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.top());
    }


}
