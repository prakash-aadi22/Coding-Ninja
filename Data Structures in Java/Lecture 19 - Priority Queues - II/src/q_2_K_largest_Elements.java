import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class q_2_K_largest_Elements {
    public static ArrayList<Integer> kLargest(int[] input, int k) {
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
        ArrayList<Integer> arr = new ArrayList<>();
        while (!pq.isEmpty()) {
            arr.add(pq.poll());
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int j = 0; j < n; j++) {
            input[j] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> output = kLargest(input, k);
        for (int i : output) {
            System.out.println(i);
        }

    }
}
