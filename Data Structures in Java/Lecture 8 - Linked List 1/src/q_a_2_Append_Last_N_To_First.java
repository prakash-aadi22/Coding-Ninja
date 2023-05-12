import java.util.Scanner;

//class Node<T> {
//    T data;
//    Node<T> next;
//    Node(T data) {
//        this.data = data;
//        next = null;
//    }
//}

public class q_a_2_Append_Last_N_To_First {
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

    //    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
//        LinkedListNode<Integer> node = head, checkNode = null, newHead = null;
        Node<Integer> node = head, checkNode, newHead;
        if (n == 0) {
            return head;
        }
        int count = 0;
        while (node != null) {
            node = node.next;
            count = count + 1;
        }
        if (count < n) {
            return head;
        }
        n = count - n;
        node = head;
        for (int i = 0; i < n - 1; i++) {
            node = node.next;
        }
        checkNode = node.next;
        node.next = null;
        newHead = checkNode;
        while (checkNode.next != null) {
            checkNode = checkNode.next;
        }
        checkNode.next = head;
        head = newHead;
        return head;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            int n = sc.nextInt();
            head = appendLastNToFirst(head, n);
            print(head);
        }
    }
}
