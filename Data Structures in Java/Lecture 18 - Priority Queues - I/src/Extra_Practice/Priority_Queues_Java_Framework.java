package Extra_Practice;

import java.util.PriorityQueue;

public class Priority_Queues_Java_Framework {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        System.out.println(pq);
        System.out.println(pq.size());
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        pq.clear();
        System.out.println(pq);
    }
}
