import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_2_LCA_of_Binary_Tree {

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

    static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if (root == null) {
            return -1;
        }
        if (root.data == a || root.data == b) {
            return root.data;
        }
        int leftLca = getLCA(root.left, a, b);
        int rightLca = getLCA(root.right, a, b);
        if (leftLca == -1 && rightLca == -1) {
            return -1;
        } else if (leftLca == -1) {
            return rightLca;
        } else if (rightLca == -1) {
            return leftLca;
        } else {
            return root.data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = getLCA(root, a, b);
        System.out.println(h);
    }
}
