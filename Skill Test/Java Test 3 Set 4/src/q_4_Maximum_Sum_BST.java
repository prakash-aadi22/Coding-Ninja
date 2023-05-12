import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class QueueEmptyException1 extends Exception {

}

class QueueUsingLL1<T> {
    class Node1<T> {
        T data;
        Node1<T> next;

        Node1(T data) {
            this.data = data;
        }
    }

    private Node1<T> head;
    private Node1<T> tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public T front() throws QueueEmptyException1 {
        if (size == 0) {
            QueueEmptyException1 e = new QueueEmptyException1();
            throw e;
        }
        return head.data;
    }

    public void enqueue(T element) {
        Node1<T> newNode = new Node1<T>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T dequeue() throws QueueEmptyException1 {
        if (head == null) {
            QueueEmptyException1 e = new QueueEmptyException1();
            throw e;
        }
        if (head == tail) {
            tail = null;
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}

class BinaryTreeNode1<T> {
    T data;
    BinaryTreeNode1<T> left;
    BinaryTreeNode1<T> right;

    public BinaryTreeNode1(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Pair1<T, U> {
    T minimum;
    U maximum;

    public Pair1(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class q_4_Maximum_Sum_BST {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static BinaryTreeNode1<Integer> takeInput() throws NumberFormatException, IOException {
        QueueUsingLL1<BinaryTreeNode1<Integer>> pendingNodes = new QueueUsingLL1<BinaryTreeNode1<Integer>>();
        int start = 0;

        String[] nodeDatas = br.readLine().trim().split(" ");

        if (nodeDatas.length == 1) {
            return null;
        }

        int rootData = Integer.parseInt(nodeDatas[start]);
        start += 1;

        BinaryTreeNode1<Integer> root = new BinaryTreeNode1<Integer>(rootData);
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode1<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException1 e) {
                return null;
            }

            int leftChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if (leftChildData != -1) {
                BinaryTreeNode1<Integer> leftChild = new BinaryTreeNode1<Integer>(leftChildData);
                currentNode.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = Integer.parseInt(nodeDatas[start]);
            start += 1;

            if (rightChildData != -1) {
                BinaryTreeNode1<Integer> rightChild = new BinaryTreeNode1<Integer>(rightChildData);
                currentNode.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }
        return root;
    }
//=================================
    public static int subTreeSum(BinaryTreeNode1<Integer> curNode) {
        if (curNode == null) {
            return 0;
        }
        int curSum = curNode.data;
        curSum += subTreeSum(curNode.left);
        curSum += subTreeSum(curNode.right);
        return curSum;
    }
    public static int isBST(BinaryTreeNode1<Integer> curNode, int low, int high) {
        if (curNode == null) {
            return 1;
        }
        if (curNode.data < low || curNode.data > high) {
            return 0;
        }
        if (isBST(curNode.left, low, curNode.data - 1) == 1 && isBST(curNode.right, curNode.data + 1, high) == 1) {
            return 1;
        }
        return 0;

    }
    public static void traverseTree(BinaryTreeNode1<Integer> curNode, int[] ans) {
        if (isBST(curNode, Integer.MIN_VALUE, Integer.MAX_VALUE) == 1) {
            int maxSum = subTreeSum(curNode);
            ans[0] = Math.max(ans[0], maxSum);
        }
        if (curNode.left != null) {
            traverseTree(curNode.left, ans);
        }
        if (curNode.right != null) {
            traverseTree(curNode.right, ans);
        }
    }

    public static int maxSumBST(BinaryTreeNode1<Integer> root) {
        int[] ans = {0};
        traverseTree(root, ans);
        return ans[0];
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BinaryTreeNode1<Integer> root = takeInput();
        System.out.println(maxSumBST(root));
    }
}
