package recursive_LL;

import java.util.Scanner;

public class print_LL {
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

    public static void print(Node<Integer> head) {
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        print(head.next);
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
}
