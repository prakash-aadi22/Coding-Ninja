import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;

public class q_a_1_Reverse_Queue {
    static Scanner sc = new Scanner(System.in);

    public static Queue<Integer> takeInput() {
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        return queue;
    }

    public static void reverseQueue(Queue<Integer> input) {

//        Stack<Integer> stack = new Stack<>();
//        while (!input.isEmpty()) {
//            stack.add(input.peek());
//            input.remove();
//        }
//        while (!stack.isEmpty()) {
//            input.add(stack.peek());
//            stack.pop();
//        }

        // Recursion
        if (input.size() == 0 || input.size() == 1) {
            return;
        }
        int temp = input.remove();
        reverseQueue(input);
        input.add(temp);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Queue<Integer> queue = takeInput();
            reverseQueue(queue);
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        }
    }
}
