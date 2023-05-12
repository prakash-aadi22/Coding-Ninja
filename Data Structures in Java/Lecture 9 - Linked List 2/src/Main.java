import recursive_LL.Node;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
//                tail = newNode;
            } else {
                tail.next = newNode;
//                tail = newNode; // tail = tail.next;
            }
            tail = newNode; // Extracted the common part.
            data = sc.nextInt();
        }
        return head;
    }

    // 1
//    public static void fun(Node<Integer> start) {
//        if (start == null) {
//            return;
//        }
//        System.out.print(start.data);
//
//        if (start.next != null) {
//            fun(start.next.next);
//        }
//        System.out.print(start.data);
//    }

    //2
//    public static void fun(Node<Integer> head) {
//        if (head == null) {
//            return;
//        }
//        fun(head.next);
//        System.out.print(head.data);
//    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Node<Integer> n = takeInput();
        // 1
//        fun(n);

        //2
//        fun(n);
    }
}
