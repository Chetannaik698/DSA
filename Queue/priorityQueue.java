package Queue;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements with different priorities
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        priorityQueue.offer(15);
        priorityQueue.offer(1);

        // Peek at the highest priority element (smallest value)
        System.out.println("Peek: " + priorityQueue.peek()); // Output: 1

        // Dequeue elements (in priority order)
        while (!priorityQueue.isEmpty()) {
            System.out.println("Poll: " + priorityQueue.poll());
        }
    }
}
