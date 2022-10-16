package queue_using_array;

public class QueueUsingArrayCN {
    private int[] data;
    private int frontIndex;
    private int rearIndex;
    private int size;

    // basic constructor
    public QueueUsingArrayCN(){
        data = new int[10];
        frontIndex = -1;
        rearIndex = -1;
        size = 0;
    }

    public QueueUsingArrayCN(int capacity){
        data = new int[capacity];
        frontIndex = -1;
        rearIndex = -1;
        size = 0;
    }

    // size
    public int size(){
        return size;
    }

    // isEmpty
    public boolean isEmpty ()
    {
        return size()==0;
    }

    // front
    public int front() throws EmptyQueueException {
        if(size() == 0){
            throw new EmptyQueueException();
        }
        return data[frontIndex];
    }

    // enqueue
    public void enqueue(int element) throws FullQueueException {
        if (size() == data.length){
            throw new FullQueueException();
        }

        // first time enqueueing
        if (size == 0){
            frontIndex++;
        }
        rearIndex= (rearIndex + 1)% data.length;
//        if(( rearIndex+1 )== data.length){
//            rearIndex = 0;
//        }else{
//            rearIndex++;
//        }
        data[rearIndex] = element;
        size++;
    }

    // dequeue
    public int dequeue() throws EmptyQueueException {
        if( size == 0){
            throw new EmptyQueueException();
        }
        int value = data[frontIndex];
        frontIndex = (frontIndex+1)%data.length;
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
        QueueUsingArrayCN newQueue = new QueueUsingArrayCN(6);
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);
        newQueue.enqueue(5);
        newQueue.enqueue(6);
        System.out.println(newQueue.size());

        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.enqueue(7);
        newQueue.enqueue(8);
        newQueue.enqueue(9);
        newQueue.enqueue(10);

        System.out.println(newQueue.front());


    }
}
