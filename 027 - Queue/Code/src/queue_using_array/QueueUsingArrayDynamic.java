package queue_using_array;

public class QueueUsingArrayDynamic {
    private int[] data;
    private int frontIndex;
    private int rearIndex;
    private int size;

    // basic constructor
    public QueueUsingArrayDynamic(){
        data = new int[10];
        frontIndex = -1;
        rearIndex = -1;
        size = 0;
    }

    public QueueUsingArrayDynamic(int capacity){
        data = new int[capacity];
        frontIndex = -1;
        rearIndex = -1;
        size = 0;
    }

    private void doubleCapacity(){
        int[] temp = data;
        data = new int[data.length*2];
        for (int i = 0 ; i < temp.length ; i++) {
            if (frontIndex < temp.length) {
                data[i] = temp[frontIndex];
            } else {
                data[i] = temp[frontIndex - temp.length];
            }
            frontIndex++;
        }
        frontIndex = 0;
        rearIndex = temp.length-1;
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
            doubleCapacity();
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
        QueueUsingArrayDynamic newQueue = new QueueUsingArrayDynamic(7);
        newQueue.enqueue(11);
        newQueue.enqueue(12);
        newQueue.enqueue(13);
        newQueue.enqueue(14);
        newQueue.enqueue(15);
        newQueue.enqueue(16);
        newQueue.enqueue(17);

        System.out.println(newQueue.size());

        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.enqueue(7);
        newQueue.enqueue(8);
        newQueue.enqueue(9);
        newQueue.enqueue(10);
        newQueue.enqueue(89);

        System.out.println(newQueue.size());
        System.out.println(newQueue.front());
        newQueue.enqueue(45);

        System.out.println(newQueue.size());

    }
}
