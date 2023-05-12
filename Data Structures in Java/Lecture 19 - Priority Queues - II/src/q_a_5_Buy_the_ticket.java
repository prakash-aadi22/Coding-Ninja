import java.util.*;

public class q_a_5_Buy_the_ticket {
    public static int buyTicket(int[] input, int k) {
        Queue<Integer> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < input.length; i++) {
            queue.add(i);
            pq.add(input[i]);
        }
        int time = 0;
        while (!queue.isEmpty()) {
            if (input[queue.peek()] < pq.peek()) {
                queue.add(queue.poll());
            } else {
                int idx = queue.poll();
                pq.remove();
                time++;
                if (idx == k) {
                    break;
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(buyTicket(input, k));
    }
}
