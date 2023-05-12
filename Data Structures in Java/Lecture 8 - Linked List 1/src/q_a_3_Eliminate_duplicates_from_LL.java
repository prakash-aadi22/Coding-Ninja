import java.util.Scanner;

//class Node<T> {
//    T data;
//    Node<T> next;
//    Node(T data) {
//        this.data = data;
//        next = null;
//    }
//}

public class q_a_3_Eliminate_duplicates_from_LL {
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
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node<Integer> t1 = head, t2 = head.next;
        while (t2 != null) {
            if (t1.data.equals(t2.data)) {
                t2 = t2.next;
            } else {
                t1.next = t2;
                t1 = t2;
            }
        }
        t1.next = null;
        return head;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            head = removeDuplicates(head);
            print(head);
        }
    }
}
