import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_5_Path_Sum_Root_to_Leaf {

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

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        helper(root, k, "");
    }

    public static void helper(BinaryTreeNode<Integer> root, int k, String s) {
        if (root == null)
            return;
        if (root.left == null && root.right == null && root.data == k) {
            System.out.println(s + root.data);
            return;
        }
        s = s + root.data + " ";
        helper(root.left, k - root.data, s);
        helper(root.right, k - root.data, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int k = sc.nextInt();
        rootToLeafPathsSumToK(root, k);
    }
}
