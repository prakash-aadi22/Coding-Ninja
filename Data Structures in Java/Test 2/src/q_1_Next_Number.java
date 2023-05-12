import java.util.Scanner;
import java.util.Stack;

class Solution {
    public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
        Stack<Integer> stack = new Stack<>();
        LinkedListNode<Integer> temp = head;
        while (temp.next != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        if (temp.data + 1 < 10) {
            temp.data = temp.data + 1;
            return head;
        }
        stack.push(temp.data);
        temp = null;
        int carry = 1;
        while (!stack.isEmpty() && carry != 0) {
            int result = stack.pop() + carry;
            LinkedListNode<Integer> newNode = new LinkedListNode<>(result % 10);
            newNode.next = temp;
            temp = newNode;
            carry = result / 10;
        }
        if (carry == 0) {
            return temp;
        }
        LinkedListNode<Integer> newNode = new LinkedListNode<>(1);
        newNode.next = temp;
        return newNode;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class q_1_Next_Number {
    static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        int data = s.nextInt();
        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedListNode<Integer> head = takeInput();
        head = Solution.nextLargeNumber(head);
        print(head);

    }

}
