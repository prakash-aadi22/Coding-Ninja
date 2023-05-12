import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DoubleNode {
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}

public class q_a_5_kReverse {
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

    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }
        if (k == 0) {
            return head;
        }
        LinkedListNode<Integer> h2, t1 = head;
        int count = 1;
        while (count < k && t1.next != null) {
            t1 = t1.next;
            count++;
        }
        h2 = t1.next;
        t1.next = null;
        DoubleNode ans = reversePart(head);
        ans.tail.next = kReverse(h2, k);
        return ans.head;
    }

    private static DoubleNode reversePart(LinkedListNode<Integer> head) {
        if (head == null || head.next == null) {
            DoubleNode ans = new DoubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode ans = reversePart(head.next);
        ans.tail.next = head;
        head.next = null;
        ans.tail = ans.tail.next;
        return ans;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            LinkedListNode<Integer> head = takeInput();
            int k = Integer.parseInt(br.readLine().trim());
            LinkedListNode<Integer> newHead = kReverse(head, k);
            print(newHead);
            t -= 1;
        }
    }
}