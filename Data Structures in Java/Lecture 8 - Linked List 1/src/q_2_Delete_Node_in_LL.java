import java.util.Scanner;

//class Node<T> {
//    T data;
//    Node<T> next;
//
//    Node(T data) {
//        this.data = data;
//        next = null;
//    }
//}

public class q_2_Delete_Node_in_LL {
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
        System.out.println();
    }

    //    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) { // LinkedListNode given in the question
    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null && count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            return head;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            int n = sc.nextInt();
            head = deleteNode(head, n);
            print(head);
        }
    }
}
