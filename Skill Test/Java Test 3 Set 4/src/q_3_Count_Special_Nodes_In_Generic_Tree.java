import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public int numChildren() {
        return this.children.size();
    }

    public TreeNode<T> getChild(int index) {
        if (index > this.children.size()) {
            return null;
        }

        return this.children.get(index);
    }
}

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}

class QueueUsingLL<T> {

    class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
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

    public T front() throws QueueEmptyException {
        if (size == 0) {
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }

        return head.data;
    }


    public void enqueue(T element) {
        Node<T> newNode = new Node<T>(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public T dequeue() throws QueueEmptyException {
        if (head == null) {
            QueueEmptyException e = new QueueEmptyException();
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

class QueueEmptyException extends Exception {
}

public class q_3_Count_Special_Nodes_In_Generic_Tree {
    static Scanner sc = new Scanner(System.in);


    public static TreeNode<Integer> takeInput() {

        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
        int rootData = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<Integer>(rootData);

        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                int numChild = sc.nextInt();

                for (int i = 0; i < numChild; i++) {
                    int currentChild = sc.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                }
            } catch (QueueEmptyException e) {
            }
        }
        return root;
    }

//    private static int countSpecialNodesHelper(TreeNode<Integer> root, ArrayList<Integer> distinctElements) {
//        if (distinctElements.contains(root.data)) {
//            return 0;
//        }
//        distinctElements.add(root.data);
//        int specialNodesInChild = 0;
//        int childCount = root.numChildren();
//        for (int i = 0; i < childCount; i++) {
//            specialNodesInChild += countSpecialNodesHelper(root.getChild(i), distinctElements);
//        }
//        distinctElements.remove(distinctElements.size() - 1);
//
//        return (1 + specialNodesInChild);
//    }
//
//    public static int countSpecialNodes(TreeNode<Integer> root) {
//        ArrayList<Integer> distinctElements = new ArrayList<>();
//        return countSpecialNodesHelper(root, distinctElements);
//    }


    private static int countSpecialNodesHelper(TreeNode<Integer> root, Set<Integer> distinctElements) {
        if (distinctElements.contains(root.data)) {
            return 0;
        }
        distinctElements.add(root.data);
        int specialNodesInChild = 0;
        int childCount = root.numChildren();
        for (int i = 0; i < childCount; i++) {
            specialNodesInChild += countSpecialNodesHelper(root.getChild(i), distinctElements);
        }
        distinctElements.remove(root.data);
        return (1 + specialNodesInChild);
    }

    public static int countSpecialNodes(TreeNode<Integer> root) {
        Set<Integer> distinctElements = new HashSet<>();
        return countSpecialNodesHelper(root, distinctElements);
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            TreeNode<Integer> root = takeInput();
            System.out.println(countSpecialNodes(root));
        }
    }
}
