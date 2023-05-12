import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_2_Mirror_a_Binary_Tree {
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

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }

    public static void print_LevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            if (front != null) {
                System.out.print(front.data + ":");
                if (front.left == null) {
                    System.out.print("L:-1");
                } else {
                    System.out.print("L:" + front.left.data);
                }
                if (front.right == null) {
                    System.out.print(",R:-1");
                } else {
                    System.out.print(",R:" + front.right.data);
                }
                System.out.println();
                pendingNodes.add(front.left);
                pendingNodes.add(front.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        mirrorBinaryTree(root);
        print_LevelWise(root);
    }
}
