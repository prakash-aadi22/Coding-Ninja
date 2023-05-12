import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class Stack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;
    private int size;

    public Stack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        q1.add(element);
        size = size + 1;
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();

        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        size = size - 1;
        return top;
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int top = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return top;
    }
}

public class q_2_Stack_Using_2_Queues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int q = sc.nextInt();
        while (q > 0) {
            int choice, input;
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    input = sc.nextInt();
                    stack.push(input);
                }
                case 2 -> System.out.println(stack.pop());
                case 3 -> System.out.println(stack.top());
                case 4 -> System.out.println(stack.getSize());
                default -> System.out.println((stack.isEmpty()) ? "true" : "false");
            }
            q -= 1;
        }
    }
}
