import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class q_a_6_Bubble_Sort_LinkedList {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static LinkedListNode<Integer> takeInput() throws IOException {
        LinkedListNode<Integer> head = null, tail = null;
        String[] datas = br.readLine().trim().split("\\s");
        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
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

    public static int findLengthLL(LinkedListNode<Integer> head) {
        int count = 0;
        while (head.next != null) {
            head = head.next;
            count = count + 1;
        }
        return count;
    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        int n = findLengthLL(head);
        LinkedListNode<Integer> node1 = null, node2 = null, temp = null;
        int data1 = 0, data2 = 0;
        for (int i = 0; i < n; i++) {
            node1 = head;
            node2 = head.next;
            for (int j = 0; j < n - i; j++) {
                data1 = node1.data;
                data2 = node2.data;
                if (data1 > data2) {
                    node1.data = data2;
                    node2.data = data1;
                }
                node1 = node1.next;
                node2 = node2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        LinkedListNode<Integer> head = takeInput();
        head = bubbleSort(head);
        print(head);
    }
}