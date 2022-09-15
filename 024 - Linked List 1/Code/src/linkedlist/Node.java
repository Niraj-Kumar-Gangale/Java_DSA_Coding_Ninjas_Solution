package linkedlist;

/**
 *  <a href="https://www.javatpoint.com/ds-linked-list">LinkedList blog post</a>
 */
public class Node<T> {

    // Data members
    T data;
    Node<T> next;

    // constructor for the node
    public Node (T data){
        this.data = data;
        next = null;
    }

}
