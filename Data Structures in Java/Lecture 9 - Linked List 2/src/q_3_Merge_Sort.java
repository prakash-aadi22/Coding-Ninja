import java.util.Scanner;

public class q_3_Merge_Sort {
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

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        LinkedListNode<Integer> midNode = findMid(head);
        LinkedListNode<Integer> h2 = midNode.next;
        midNode.next = null;
        LinkedListNode<Integer> part1 = mergeSort(head);
        LinkedListNode<Integer> part2 = mergeSort(h2);
        return mergeTwoList(part1, part2);
    }

    private static LinkedListNode<Integer> findMid(LinkedListNode<Integer> head) {
        if (head == null) {
            return head;
        }
        LinkedListNode<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        LinkedListNode<Integer> t1 = head1, t2 = head2, tail = null, head = null;
        if (t1.data <= t2.data) {
            head = t1;
            tail = t1;
            t1 = t1.next;
        } else {
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            } else {
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            tail.next = t2;
        }
        if (t2 == null) {
            tail.next = t1;
        }
        return head;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            LinkedListNode<Integer> head = takeInput();
            head = mergeSort(head);
            print(head);
        }
    }
}
