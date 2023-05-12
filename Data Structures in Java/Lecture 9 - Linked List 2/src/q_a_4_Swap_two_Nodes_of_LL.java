import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class q_a_4_Swap_two_Nodes_of_LL {
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

    public static LinkedListNode<Integer> findPrevNode(LinkedListNode<Integer> head, int count) {
        for (int i = 0; i < count - 1; i++) {
            head = head.next;
        }
        return head;
    }

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        if (head == null) {
            return head;
        } else if (j == 0 || (i - j == -1)) {
            int temp = i;
            i = j;
            j = temp;
        }
        LinkedListNode<Integer> swap1 = null, swap2 = null, p1 = null, n1 = null, p2 = null, n2 = null;
        if (i == 0 && i - j == 1) {
            swap1 = head;
            swap2 = head.next;

            swap1 = swap1.next;
            head = swap2;
            swap2.next = swap1;
        } else if (i - j == 1) {
            p1 = findPrevNode(head, j);
            swap1 = p1.next;
            swap2 = swap1.next;
            n2 = swap2.next;

            p1.next = swap2;
            swap2.next = swap1;
            swap1.next = n2;
        } else if (i == 0) {
            swap1 = head;
            n1 = swap1.next;
            p2 = findPrevNode(head, j);
            swap2 = p2.next;
            n2 = swap2.next;

            head = swap2;
            head.next = n1;
            p2.next = swap1;
            swap1.next = n2;
        } else {
            p1 = findPrevNode(head, i);
            p2 = findPrevNode(head, j);
            swap1 = p1.next;
            swap2 = p2.next;
            n1 = swap1.next;
            n2 = swap2.next;

            p1.next = swap2;
            p2.next = swap1;
            swap1.next = n2;
            swap2.next = n1;
        }
        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            LinkedListNode<Integer> head = takeInput();
            String[] i_j = br.readLine().trim().split("\\s");
            int i = Integer.parseInt(i_j[0]);
            int j = Integer.parseInt(i_j[1]);
            LinkedListNode<Integer> newHead = swapNodes(head, i, j);
            print(newHead);
            t -= 1;
        }
    }
}