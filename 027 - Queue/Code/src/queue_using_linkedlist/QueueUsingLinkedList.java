package queue_using_linkedlist;

import queue_using_array.EmptyQueueException;

class Node{

    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}

public class QueueUsingLinkedList {
    Node front;
    Node rear;
    int size;

    public QueueUsingLinkedList(){
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
    public int front() throws EmptyQueueException {
        if (size == 0){
            throw new EmptyQueueException();
        }
        return front.data;
    }

    // Enqueue
    public void enqueue(int element){
        Node newNode = new Node(element);
        if(size == 0){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue () throws EmptyQueueException {
        if(size == 0){
            throw new EmptyQueueException();
        }
        int value = front.data;
        front = front.next;
        size--;
        return value;
    }


    public static void main(String[] args) throws EmptyQueueException {
        QueueUsingLinkedList newQueue = new QueueUsingLinkedList();
        newQueue. enqueue(54);
        newQueue. enqueue(54);
        newQueue. enqueue(54);
        newQueue. enqueue(54);
        System.out.println(newQueue.getSize());
        newQueue.dequeue();
        newQueue.dequeue();
        newQueue.dequeue();
        System.out.println(newQueue.getSize());
    }
}
