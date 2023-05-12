import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class q_5_Pair_sum_in_a_BST {

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

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<Integer>> stack1 = new Stack<>();
        Stack<BinaryTreeNode<Integer>> stack2 = new Stack<>();
        BinaryTreeNode<Integer> temp = root;
        while (temp != null) {
            stack1.push(temp);
            temp = temp.left;
        }
        temp = root;
        while (temp != null) {
            stack2.push(temp);
            temp = temp.right;
        }
        // Assume BST contains all unique elements
        while (!stack1.isEmpty() && !stack2.isEmpty() && (stack1.peek().data < stack2.peek().data)) {
            BinaryTreeNode<Integer> frontNode1 = stack1.peek(), frontNode2 = stack2.peek();
            if (frontNode1.data + frontNode2.data == s) {
                System.out.println(frontNode1.data + " " + frontNode2.data);
                stack1.pop();
                stack2.pop();
                frontNode1 = frontNode1.right;
                while (frontNode1 != null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }
                frontNode2 = frontNode2.left;
                while (frontNode2 != null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                }
            } else if (frontNode1.data + frontNode2.data < s) {
                stack1.pop();
                frontNode1 = frontNode1.right;
                while (frontNode1 != null) {
                    stack1.push(frontNode1);
                    frontNode1 = frontNode1.left;
                }
            } else {
                stack2.pop();
                frontNode2 = frontNode2.left;
                while (frontNode2 != null) {
                    stack2.push(frontNode2);
                    frontNode2 = frontNode2.right;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int s = sc.nextInt();
        printNodesSumToS(root, s);
    }
}
