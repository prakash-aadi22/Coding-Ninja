import java.util.Scanner;

//class Node<T> {
//    T data;
//    Node<T> next;
//    Node(T data) {
//        this.data = data;
//        next = null;
//    }
//}

public class q_3_Length_of_LL {
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

    //    public static int length(LinkedListNode<Integer> head) {
    public static int length(Node<Integer> head) {
        int count = 0;
        while (head != null) {
//            System.out.print(head.data + " ");
            head = head.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            System.out.println(length(head));
//            print(head);
        }
    }
}
