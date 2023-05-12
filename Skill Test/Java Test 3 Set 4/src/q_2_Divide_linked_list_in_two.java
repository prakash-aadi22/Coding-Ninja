import java.util.Scanner;
import java.util.Stack;

class ListNode<t> {
    public t data;
    public ListNode<t> next;

    public ListNode(t data) {
        this.data = data;
    }
}

public class q_2_Divide_linked_list_in_two {
    static Scanner sc = new Scanner(System.in);

    public static ListNode<Integer> createList() {
        ListNode<Integer> head = null;
        ListNode<Integer> rear = null;
        int data = sc.nextInt();
        while (data != -1) {
            ListNode<Integer> newNode = new ListNode<Integer>(data);
            if (head == null) {
                head = newNode;
                rear = head;
            } else {
                rear.next = newNode;
                rear = rear.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void make2List(ListNode<Integer> head) {
    }

    public static void main(String[] args) {
        ListNode<Integer> head = createList();
        make2List(head);
    }
}
