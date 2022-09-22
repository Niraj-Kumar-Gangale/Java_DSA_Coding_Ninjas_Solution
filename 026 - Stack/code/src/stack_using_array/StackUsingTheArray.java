package stack_using_array;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Stack using array implementation (my solution). This stack is dynamic.
 */
public class StackUsingTheArray {

    private int[] arr;
    private int size;

    // push method for stack
    public void push(int data){
        if (size == 0) {
            arr = new int[size + 1];
            arr[size] = data;
        }else{
            int[] arrNew = Arrays.copyOf(arr, size+1);
            arrNew[size] = data;
            arr = arrNew;
        }
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
        int value = arr[size -1];
        arr = Arrays.copyOf(arr, size-1);
        size--;
        return value;

    }




    public static void main(String[] args) {
        StackUsingTheArray newStack = new StackUsingTheArray();
        System.out.println(newStack.pop());
    }
}
