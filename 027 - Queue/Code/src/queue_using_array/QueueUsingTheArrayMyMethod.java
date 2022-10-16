package queue_using_array;

/**
 * Queue Implementation Using Array
 */
public class QueueUsingTheArrayMyMethod {

    int[] data;
    int currentIndex;

    /**
     * Default Constructor
     */
    public QueueUsingTheArrayMyMethod() {
        data = new int[10];
        currentIndex = -1;
    }

    /**
     * Parameterized Constructor
     * @param capacity the length of Queue.
     */
    public QueueUsingTheArrayMyMethod(int capacity){
        data = new int[capacity];
        currentIndex = -1;
    }

    public int size(){
        return 1 + currentIndex;
    }

    public boolean isEmpty(){
        return size() == 0;
    }
    public void enqueue (int element) throws EmptyQueueException {
        if( size() == data.length){
            throw new EmptyQueueException();
        }
        currentIndex++;
        data[currentIndex] = element;
    }

    public int dequeue() throws EmptyQueueException {
        if (size()==0){
            throw new EmptyQueueException();
        }

        int value = data[0];
        // for loop
        if (currentIndex >= 0) System.arraycopy(data, 1, data, 0, currentIndex);
        currentIndex--;
        return value;
    }
    public int front(){
        return data[0];
    }

    public static void main(String[] args) throws EmptyQueueException {

        QueueUsingTheArrayMyMethod newQueue = new QueueUsingTheArrayMyMethod(5);
        newQueue.enqueue(45);
        newQueue.enqueue(45);
        newQueue.enqueue(45);
        newQueue.enqueue(45);
        newQueue.dequeue();
        System.out.println(newQueue.size());

    }



}
