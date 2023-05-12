import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class q_1_Print_ith_Node {
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

//    public static void print(Node<Integer> head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//        System.out.println();
//    }

    //    public static void printIthNode(LinkedListNode<Integer> head, int i) { // LinkedListNode given in the question
    public static void printIthNode(Node<Integer> head, int i) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
            if (count == i){
                System.out.println(head.data);
            }
        }
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            int n = sc.nextInt();
//        print(head);
            printIthNode(head, n);
        }
    }
}
