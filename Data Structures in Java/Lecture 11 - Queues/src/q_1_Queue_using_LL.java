import java.util.Scanner;

class Queue {

    private Node front, rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue() {
        if (size == 1) {
            rear = null;
        }
        if (front != null) {
            int value = front.data;
            front = front.next;
            size--;
            return value;
        } else {
            return -1;
        }
    }

    public int front() {
        if (size == 0) {
            return -1;
        } else {
            return front.data;
        }
//        if (front != null) {
//            return front.data;
//        } else {
//            return -1;
//        }
    }
}

public class q_1_Queue_using_LL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int q = sc.nextInt();
        while (q > 0) {
            int choice, input;
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    input = sc.nextInt();
                    queue.enqueue(input);
                }
                case 2 -> System.out.println(queue.dequeue());
                case 3 -> System.out.println(queue.front());
                case 4 -> System.out.println(queue.getSize());
                default -> System.out.println((queue.isEmpty()) ? "true" : "false");
            }
            q -= 1;
        }
    }
}
