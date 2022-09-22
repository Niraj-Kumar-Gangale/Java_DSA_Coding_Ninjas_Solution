package stack_using_array;

import java.util.EmptyStackException;

/**
 * Stack using array (in this version we make the size of array to be constant)
 */
// Constant capacity
public class StackUsingArrayCC {

    private final int[] arr;
    private int size;

    public StackUsingArrayCC(){
        arr = new int[10];
        size = 0;
    }

    public StackUsingArrayCC(int capacity){
        if (capacity==0){
            throw new EmptyStackCreationException();
        }
        arr = new int[capacity];
        size = 0;
    }


    // push method for stack
    public void push(int data){
        if(size() == arr.length){
            throw new StackFullException();
        }
        arr[size] = data;
        size++;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int top(){
        if (size == 0){
            throw new EmptyStackException();
        }
        return arr[size-1];
    }

    public int pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        int value = arr[size-1];
        size--;
        return value;

    }
}
