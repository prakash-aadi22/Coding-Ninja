import java.util.PriorityQueue;
import java.util.Scanner;

public class q_a_2_Kth_largest_element {
    public static int kthLargest(int n, int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            int minVal = pq.peek();
            if (minVal < input[i]) {
                minVal = input[i];
            }
            if (minVal != pq.peek()) {
                pq.poll();
                pq.add(minVal);
            }
        }
        int minVal = Integer.MAX_VALUE;
        while (!pq.isEmpty()) {
            int check = pq.poll();
            if (check < minVal) {
                minVal = check;
            }
        }
        return minVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(kthLargest(n, input, k));
    }
}
