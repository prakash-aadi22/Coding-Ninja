import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Input {
    int n;
    int k;
    Queue<Integer> queue;

    public Input(int n, int k, Queue<Integer> queue) {
        this.queue = queue;
        this.n = n;
        this.k = k;
    }

}

public class q_a_2_Reverse_the_First_K_Elements_in_the_Queue {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Input takeInput() throws NumberFormatException, IOException {
        String[] n_k = br.readLine().trim().split(" ");
        int n = Integer.parseInt(n_k[0]);
        int k = Integer.parseInt(n_k[1]);
        String[] values = br.readLine().trim().split(" ");
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(values[i]));
        }
        return new Input(n, k, queue);
    }

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        if (input.size() > k) {
            k = k % input.size();
        }
        if (k == 0 || k == 1) {
            return input;
        }
        reverseQueue(input, k);
        for (int i = 0; i < input.size() - k; i++) {
            input.add(input.remove());
        }
        return input;
    }

    public static void reverseQueue(Queue<Integer> input, int k) {
        if (input.size() == 0 || input.size() == 1 || k == 0) {
            return;
        }
        int temp = input.remove();
        reverseQueue(input, k - 1);
        input.add(temp);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Input input = takeInput();
        int k = input.k;
        Queue<Integer> queue = input.queue;
        reverseKElements(queue, k);
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
    }
}