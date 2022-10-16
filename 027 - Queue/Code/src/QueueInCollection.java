import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollection {

    // I have doubt about the queue implementation,
    // also about the linked list already implemented the queue
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(45);  // work as enqueue
//        queue.push(45); // push from linked list is not working
//        queue.pop();   // pop is not working from the list
        queue.size(); // size is working
        queue.isEmpty();  // is empty works fine
//        queue.front();  // front does not work
        System.out.println(queue.poll()); // work a dequeue bot does not return exception
        // but null when the queue is empty
        System.out.println(queue.peek());  // work as front, return null for the empty queue
    }
}
