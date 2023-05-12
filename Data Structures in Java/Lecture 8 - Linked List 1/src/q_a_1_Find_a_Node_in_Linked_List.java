import java.util.Scanner;

//class Node<T> {
//    T data;
//    Node<T> next;
//    Node(T data) {
//        this.data = data;
//        next = null;
//    }
//}

public class q_a_1_Find_a_Node_in_Linked_List {
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
//    }

    //    public static int findNode(LinkedListNode<Integer> head, int n) {
    public static int findNode(Node<Integer> head, int n) {
        // My code
        int count = -1;
        while (head != null) {
            count++;
            if (head.data == n) {
                return count;
            }
            head = head.next;
        }
        return -1;

//        if (head == null) {
//            return -1;
//        }
//        int count = 0;
//        while (head != null && head.data != n) {
//            head = head.next;
//            count++;
//        }
//        if (head != null) {
//            return count;
//        } else {
//            return -1;
//        }

    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            int n = sc.nextInt();
            System.out.println(findNode(head, n));
//            print(head);
        }
    }
}
