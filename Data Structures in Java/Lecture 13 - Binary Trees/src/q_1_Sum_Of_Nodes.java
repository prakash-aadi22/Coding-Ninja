import Extra_Practice.Binary_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1_Sum_Of_Nodes {
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

    public static int getSum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int ans = root.data;
        ans += getSum(root.left);
        ans += getSum(root.right);
        return ans;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        System.out.println(getSum(root));
    }
}
