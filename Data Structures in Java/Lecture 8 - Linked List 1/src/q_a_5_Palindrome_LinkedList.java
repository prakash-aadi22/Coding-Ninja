import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//class Node<T> {
//    T data;
//    Node<T> next;
//    Node(T data) {
//        this.data = data;
//        next = null;
//    }
//}

public class q_a_5_Palindrome_LinkedList {
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

    //    public static boolean isPalindrome(LinkedListNode<Integer> head) {
    public static boolean isPalindrome(Node<Integer> head) {
        Node<Integer> node = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node != null) {
            arr.add(node.data);
            node = node.next;
        }
        int start = 0, end = arr.size() - 1;
        while (start < end) {
//            if (arr.get(start) != arr.get(end)) {
            if (!Objects.equals(arr.get(start), arr.get(end))) {
                return false;
            } else {
                start = start + 1;
                end = end - 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            Node<Integer> head = takeInput();
            System.out.println(isPalindrome(head));
//            print(head);
        }
    }
}
