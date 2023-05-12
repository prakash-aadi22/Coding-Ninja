import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class q_a_4_Running_Median {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];
        if (size == 0) {
            return input;
        }
        String[] strNums;
        strNums = br.readLine().split("\\s");
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }
        return input;
    }

    public static void findMedian(int[] arr) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            if (max.isEmpty()) {
                max.add(i);
            } else if (i > max.peek()) {
                min.add(i);
                if ((min.size() - max.size()) > 1) {
                    int p = min.remove();
                    max.add(p);
                }
            } else {
                max.add(i);
                if ((max.size() - min.size()) > 1) {
                    int p = max.remove();
                    min.add(p);
                }
            }
            if (max.size() > min.size()) {
                System.out.print(max.peek() + " ");
            } else if (max.size() < min.size()) {
                System.out.print(min.peek() + " ");
            } else {
                System.out.print((max.peek() + min.peek()) / 2 + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int[] arr = takeInput();
        findMedian(arr);
    }
}
