package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJavaCollection {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //ArrayDequeue
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
