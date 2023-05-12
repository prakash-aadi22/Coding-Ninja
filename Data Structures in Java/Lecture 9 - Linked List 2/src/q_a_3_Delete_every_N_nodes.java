import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_a_3_Delete_every_N_nodes {
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

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        if (M == 0) {
            return null;
        }
        if (N == 0) {
            return head;
        }
        LinkedListNode<Integer> node = head, delNode = null;
        while (node != null) {
            for (int i = 0; i < M - 1 && node != null; i++) {

                node = node.next;
            }
            if (node == null) {
                break;
            }
            delNode = node.next;
            for (int i = 0; i < N && delNode != null; i++) {

                delNode = delNode.next;
            }
            node.next = delNode;
            node = delNode;
        }
        return head;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            LinkedListNode<Integer> head = takeInput();
            String[] m_n = br.readLine().trim().split("\\s");
            int m = Integer.parseInt(m_n[0]);
            int n = Integer.parseInt(m_n[1]);
            LinkedListNode<Integer> newHead = skipMdeleteN(head, m, n);
            print(newHead);
            t -= 1;
        }
    }
}
