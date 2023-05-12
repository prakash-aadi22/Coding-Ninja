import java.util.Scanner;

class Stack_LL {
    private Node_not_generic head;
    private int size;

    public Stack_LL() {
        head = null;
        size = 0;
    }

    public int getSize() {
        //Implement the getSize() function
        return size;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (size == 0);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node_not_generic newNode = new Node_not_generic(element);
//        if (head == null) {
//            head = newNode;
//        } else {
//            newNode.next = head;
//            head = newNode;
//        }
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
    }

    public int pop() {
        //Implement the pop() function
        if (head == null) {
            size = 0;
            return -1;
        } else {
            size--;
            int topEle = head.data;
            head = head.next;
            return topEle;
        }
    }

    public int top() {
        //Implement the top() function
//        if (head == null) {
//            return -1;
//        } else {
//            return head.data;
//        }
        return head == null ? -1 : head.data;
    }
}

public class q_1_Stack_Using_LL {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack_LL s = new Stack_LL();
        int q = sc.nextInt();
        while (q > 0) {
            int choice, input;
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    input = sc.nextInt();
                    s.push(input);
                }
                case 2 -> System.out.println(s.pop());
                case 3 -> System.out.println(s.top());
                case 4 -> System.out.println(s.getSize());
                default -> System.out.println((s.isEmpty()) ? "true" : "false");
            }
            q -= 1;
        }
    }
}
