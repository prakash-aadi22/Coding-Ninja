import java.util.Scanner;

public class q_2_Merge_two_sorted_LL {
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

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        LinkedListNode<Integer> newHead = null, node1 = head1, node2 = head2, newNode = null;
        int data1 = node1.data, data2 = node2.data;
        if (data1 < data2) {
            newHead = node1;
            node1 = node1.next;
        } else {
            newHead = node2;
            node2 = node2.next;
        }
        newNode = newHead;
        while (node1 != null && node2 != null) {
            data1 = node1.data;
            data2 = node2.data;
            if (data1 < data2) {
                newNode.next = node1;
                newNode = newNode.next;
                node1 = node1.next;
            } else {
                newNode.next = node2;
                newNode = newNode.next;
                node2 = node2.next;
            }
        }
        while (node1 != null) {
            newNode.next = node1;
            newNode = newNode.next;
            node1 = node1.next;
        }
        while (node2 != null) {
            newNode.next = node2;
            newNode = newNode.next;
            node2 = node2.next;
        }
        return newHead;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            LinkedListNode<Integer> head1 = takeInput();
            LinkedListNode<Integer> head2 = takeInput();
            LinkedListNode<Integer> newHead = mergeTwoSortedLinkedLists(head1, head2);
            print(newHead);
        }
    }
}
