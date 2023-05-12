import java.util.ArrayList;
import java.util.Scanner;

class QueueEmptyException extends Exception {
}

class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data) {
        this.data = data;
        children = new ArrayList<TreeNode<T>>();
    }
}


class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class QueueUsingLL<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T front() throws QueueEmptyException {
        if (size == 0) {
            throw new QueueEmptyException();
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
            throw new QueueEmptyException();
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

public class q_3_Remove_leaf_nodes_in_Tree {

    static Scanner s = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise() {
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();  // Queue of node that are entered themselves but their children aren't added yet
        int rootData = s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> currentNode;
            try {
                currentNode = pendingNodes.dequeue();
                int numChild = s.nextInt();
                for (int i = 0; i < numChild; i++) {
                    int currentChild = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                }
            } catch (QueueEmptyException e) {
                throw new RuntimeException(e);
            }
        }
        return root;
    }

    public static void printTreeLevelWise(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
        pendingNodes.enqueue(root);
        pendingNodes.enqueue(null);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> currentNode = null;
            try {
                currentNode = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                e.printStackTrace();
            }
            if (currentNode == null) {
                if (pendingNodes.isEmpty()) {
                    break;
                }
                System.out.println();
                pendingNodes.enqueue(null);
                continue;
            }
            System.out.print(currentNode.data + " ");
            int numChild = currentNode.children.size();
            for (int i = 0; i < numChild; i++) {
                pendingNodes.enqueue(currentNode.children.get(i));
            }
        }
    }


    public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }// if root is null return null
        if (root.children.size() == 0) {// if root itself is leaf return null
            return null;
        }
        // if root.children is a leaf node
        // then delete it from children vector
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> child = root.children.get(i);
            if (child.children.size() == 0) {
                // shifting the vector to left
                // after the point i
                for (int j = i; j < root.children.size() - 1; j++) {
                    root.children.set(j, root.children.get(j + 1));
                }
                // delete the last element
                root.children.remove(root.children.size() - 1);
                i--;
            }
        }
        // Remove all leaf node
        // of children of root
//        for (int i = 0; i < root.children.size(); i++) {
//            // call function for root.children
//            root.children.set(i, removeLeafNodes(root.children.get(i)));
//        }
        root.children.replaceAll(q_3_Remove_leaf_nodes_in_Tree::removeLeafNodes);
        return root;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        root = removeLeafNodes(root);
        printTreeLevelWise(root);
    }
}
