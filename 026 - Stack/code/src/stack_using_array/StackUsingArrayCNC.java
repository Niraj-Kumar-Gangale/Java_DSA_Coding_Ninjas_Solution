package stack_using_array;

import java.util.EmptyStackException;

public class StackUsingArrayCNC {

    private final int[] data; // the array containing the stack data
    private int top; // the index value of top most stack element

    public StackUsingArrayCNC(){
        data = new int[10];
        top = -1;
    }

    public StackUsingArrayCNC(int capacity){
        data = new int[capacity];
        top = -1;
    }

    // size
    public int size(){
        return top + 1;
    }

    // isEmpty
    public boolean isEmpty(){
        return size() == 0;
    }

    // top value
    public int top(){
        if (top == -1){
            throw new EmptyStackException();
        }
        return data[top];
    }

    public void push(int element){
        if(size() == data.length){
            throw new StackFullException();
        }
        top++;
        data[top] = element;
    }

    public int pop(){
        if (size() == 0){
            throw new EmptyStackException();
        }
        int value =  data[top];
        top--;
        return value;
    }
}
