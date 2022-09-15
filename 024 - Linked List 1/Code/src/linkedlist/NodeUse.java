package linkedlist;

/**
 *  <a href="https://www.javatpoint.com/ds-linked-list">LinkedList blog post</a>
 */
public class NodeUse {

    public static void main(String[] args) {
        // make a first node
        Node<Integer> node1 = new Node<>(45);
        System.out.println(node1.data);
        System.out.println(node1.next);


        // make the second node
        Node<Integer> node2 = new Node<>(78);
        System.out.println(node2.data);
        System.out.println(node2.next);


        // connect these nodes together
        node1.next = node2;


        // do the same above with the String Type Parameter
        Node<String> nodeString1 = new Node<>("Noble");
        Node<String> nodeString2 = new Node<>("Niraj");

        // connect these String Nodes together
        nodeString1.next = nodeString2;


        /*
        if you define the Node next a
        like this :-
                      Node next;
        then the next node can be of any type from Integer to String to Car To Vehicle
        because then it will take
                     T -> Object
        ------------------------------------------
        node1.next = nodeString1;
        >>> The above code become possible
        ------------------------------------------
         */


        // node1.next = nodeString1;  // Error for Node<T> next;

    }

}
