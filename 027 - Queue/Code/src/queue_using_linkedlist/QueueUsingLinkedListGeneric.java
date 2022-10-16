package queue_using_linkedlist;


import queue_using_array.EmptyQueueException;

class NodeGeneric<T>{

        T data;
        NodeGeneric<T> next;
        public NodeGeneric(T data){
                this.data = data;
        }
}
public class QueueUsingLinkedListGeneric<T> {
        NodeGeneric<T> front;
        NodeGeneric<T> rear;
        int size;


        public QueueUsingLinkedListGeneric(){
                front = null;
                rear = null;
                size = 0;
        }

        // size
        public int getSize(){
                return size;
        }

        // isEmpty
        public boolean isEmpty(){
                return size == 0;
        }

        // front
        public T front() throws EmptyQueueException {
                if (size == 0){
                        throw new EmptyQueueException();
                }
                return front.data;
        }

        // Enqueue
        public void enqueue(T element){
                NodeGeneric<T> newNode = new NodeGeneric<T>(element);
                if(size == 0){
                        front = newNode;
                        rear = newNode;
                }else{
                rear.next = newNode;
                rear = newNode;
                }
                size++;
        }

        public T dequeue () throws EmptyQueueException {
                if(size == 0){
                        throw new EmptyQueueException();
                }
                T value = front.data;
                front = front.next;
                if (size == 1){
                        rear = null;
                }
                size--;
                return value;
        }

}
