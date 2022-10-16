package queue_using_array;

import java.util.ArrayList;

public class QueueUsingArrayGeneric<T> {

    private ArrayList<T> data;
    private int frontIndex;
    private int rearIndex;
    private int size;

    // basic constructor
    public QueueUsingArrayGeneric(){
        data = new ArrayList<>(10);
        frontIndex = -1;
        rearIndex = -1;
        this.size = 0;
    }

    public QueueUsingArrayGeneric(int capacity){
        data = new ArrayList<>(capacity);
        frontIndex = -1;
        rearIndex = -1;
        this.size = 0;
    }

    // size
    public int size(){
        return this.size;
    }

    // isEmpty
    public boolean isEmpty ()
    {
        return this.size()==0;
    }

    // front
    public T front() throws EmptyQueueException {
        if(size() == 0){
            throw new EmptyQueueException();
        }
        return data.get(frontIndex);
    }

    // enqueue
    public void enqueue(T element) throws FullQueueException {
        if (size() == data.size()){
            throw new FullQueueException();
        }

        // first time enqueueing
        if (this.size == 0){
            frontIndex++;
        }
//        rearIndex= (rearIndex + 1)% data.size();
        if(( rearIndex+1 )== data.size()){
            rearIndex = 0;
            data.set(rearIndex, element);
        }else if(rearIndex <frontIndex){
            rearIndex++;
            data.set(rearIndex,element);
        }
        else{
            rearIndex++;
            data.add(rearIndex , element) ;
        }
        size++;
    }

    // dequeue
    public T dequeue() throws EmptyQueueException {
        if( size == 0){
            throw new EmptyQueueException();
        }
        T value = data.get(frontIndex);
        frontIndex = (frontIndex+1)%data.size();
//        if((frontIndex + 1) == data.length){
//            frontIndex = 0;
//        }else{
//            frontIndex++;
//        }
        size--;
        if(size==0){
            frontIndex = -1;
            rearIndex = -1;
        }
        return value;
    }

    public static void main(String[] args) throws FullQueueException, EmptyQueueException {



    }
}
