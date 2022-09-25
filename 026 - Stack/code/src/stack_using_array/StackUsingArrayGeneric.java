package stack_using_array;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackUsingArrayGeneric<T> {

    private ArrayList<T> data; // the array containing the stack data
    private int top; // the index value of top most stack element

    public StackUsingArrayGeneric(){
        data = new ArrayList<T>(10);
        top = -1;
    }

    public StackUsingArrayGeneric(int capacity){
        data = new ArrayList<T>(capacity);
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
    public T top(){
        if (top == -1){
            throw new EmptyStackException();
        }
        return data.get(top);
    }

    public void push(T element){

        top++;
        data.add(top,element);
    }


    public T pop(){
        if (size() == 0){
            throw new EmptyStackException();
        }
        T value =  data.get(top);
        top--;
        return value;
    }

    public static void main(String[] args) {
        StackUsingArrayGeneric<Integer> newStack = new StackUsingArrayGeneric<>(2);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        newStack.push(45);
        System.out.println(newStack.size());


    }

    // your code from chat box
}
