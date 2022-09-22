package stack_using_array;



import java.util.EmptyStackException;

/**
 * Dynamic Stack
 */
public class StackUsingArrayVC {
    private int[] arr;
    private int size;

    public StackUsingArrayVC(){
        arr = new int[10];
        size = 0;
    }

    public StackUsingArrayVC(int capacity){
        if (capacity == 0){
            capacity = 1;
        }
        arr = new int[capacity];
        size = 0;
    }

    private void doubleCapacity (){
        int[] arrNew = new int[2*size];
        for (int i = 0 ; i < size ; i++){
            arrNew[i] = arr[i];
        }
        arr = arrNew;
    }


    // push method for stack
    public void push(int data){
        if(size() == arr.length){
            doubleCapacity();
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

