import java.util.Scanner;

public class q_5_Reverse_LL_Recursive {
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

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> smallerHead = reverseLinkedListRec(head.next);
        LinkedListNode<Integer> node = smallerHead;
        while (node.next != null) {
            node = node.next;
        }
        node.next = head;
        head.next = null;
        return smallerHead;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            LinkedListNode<Integer> head = takeInput();
            head = reverseLinkedListRec(head);
            print(head);
        }
    }
}
