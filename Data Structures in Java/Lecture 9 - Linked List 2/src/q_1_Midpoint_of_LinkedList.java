import java.util.Scanner;

public class q_1_Midpoint_of_LinkedList {
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

//    public static void print(LinkedListNode<Integer> head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        LinkedListNode<Integer> slow = head, fast = head.next;
//        while (fast != null && fast.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            LinkedListNode<Integer> head = takeInput();
//        print(head);
            head = midPoint(head);
            System.out.println(head);
        }
    }
}
