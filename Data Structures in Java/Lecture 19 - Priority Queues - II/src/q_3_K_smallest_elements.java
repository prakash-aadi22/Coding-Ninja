import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class q_3_K_smallest_elements {
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            int maxVal = pq.peek();
            if (maxVal > input[i])
                maxVal = input[i];
            if (maxVal != pq.peek()) {
                pq.poll();
                pq.add(maxVal);
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
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> output = kSmallest(n, input, k);
        Collections.sort(output);
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
}
