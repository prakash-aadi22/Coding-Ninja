import java.util.Scanner;

public class q_4_Delete_node {
    static Scanner sc = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        int data = sc.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
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

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
        } else {
            head.next = deleteNodeRec(head.next, pos - 1);
        }
        return head;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            LinkedListNode<Integer> head = takeInput();
            int pos = sc.nextInt();
            head = deleteNodeRec(head, pos);
            print(head);
        }
    }
}
