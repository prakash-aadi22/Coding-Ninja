import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

class PairLinkedList {
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}

public class q_5_BST_to_Sorted_LL {
    public static BinaryTreeNode<Integer> takeInput_LevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            front = pendingNodes.remove();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;
    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        return helper(root).head;
    }

    private static PairLinkedList helper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            PairLinkedList pair = new PairLinkedList();
            pair.head = null;
            pair.tail = null;
            return pair;
        }
        LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(root.data);
        PairLinkedList leftTree = helper(root.left);//get left tree
        PairLinkedList rightTree = helper(root.right);//get right tree
        PairLinkedList pair = new PairLinkedList();

        /*attach left tree to root and root to right tree*/

        //if left is not null attach root to right and return
        if (leftTree.head != null) {
            pair.head = leftTree.head;
            pair.tail = leftTree.tail;
            pair.tail.next = newHead;
            pair.tail = newHead;
            if (rightTree.head == null) {//if right is null, return
                pair.tail.next = null;
                return pair;
            }
        }
        //attach right tree to root
        if (rightTree.head != null && leftTree.head != null) {
            pair.tail.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if left is null just attach right to root and return
        if (rightTree.head != null && leftTree.head == null) {
            pair.head = newHead;
            newHead.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if both are null, simply return the current node
        else {
            pair.head = newHead;
            pair.tail = newHead;
        }
        return pair;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        LinkedListNode<Integer> head = constructLinkedList(root);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
