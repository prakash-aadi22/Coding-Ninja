import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1_Check_cousins {
    static Scanner s = new Scanner(System.in);

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


    public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
        return !isSiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);
    }

    public static boolean isSiblings(BinaryTreeNode<Integer> root, int node1, int node2) {

        if (root == null) {
            return false;
        }
        if (root.left != null && root.right != null) {

            if (root.left.data == node1 && root.right.data == node2) {
                return true;
            }

        }
        return isSiblings(root.left, node1, node2) || isSiblings(root.right, node1, node2);
    }

    public static int level(BinaryTreeNode<Integer> root, int k, int node1) {
        if (root == null)
            return -1;
        if (root.data == node1) {
            return k;
        }
        int left = level(root.left, k + 1, node1);
        int right = level(root.right, k + 1, node1);
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int p = s.nextInt();
        int q = s.nextInt();
        System.out.println(isCousin(root, p, q));
    }
}
