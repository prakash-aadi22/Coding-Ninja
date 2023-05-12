import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_2_Print_Elements_in_Range {
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

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null)
            return;
        if (k1 < root.data) {
            elementsInRangeK1K2(root.left, k1, k2);
        }
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }
        if (k2 > root.data) {
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        elementsInRangeK1K2(root, k1, k2);
    }
}
