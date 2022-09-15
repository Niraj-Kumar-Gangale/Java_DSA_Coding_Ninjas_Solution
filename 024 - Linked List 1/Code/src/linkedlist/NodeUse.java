package linkedlist;

public class NodeUse {

    public static void main(String[] args) {
        // make a first node
        Node node1 = new Node(45);
        System.out.println(node1.data);
        System.out.println(node1.next);


        // make the second node
        Node node2 = new Node(78);
        System.out.println(node2.data);
        System.out.println(node2.next);


        // connect these nodes together
        node1.next = node2;
    }

}
