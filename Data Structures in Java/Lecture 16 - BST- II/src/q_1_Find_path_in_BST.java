import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1_Find_path_in_BST {
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

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
        if (root == null)
            return null;
        if (root.data == data) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        if (data < root.data) {
            ArrayList<Integer> output = getPath(root.left, data);

            if (output != null) {
                output.add(root.data);
                return output;
            }
        }
        ArrayList<Integer> output2;
        if (data > root.data) {
            output2 = getPath(root.right, data);

            if (output2 != null) {
                output2.add(root.data);
                return output2;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int k = sc.nextInt();
        ArrayList<Integer> output = getPath(root, k);
        if (output != null) {
            for (int i : output) {
                System.out.print(i + " ");
            }
        }
    }

}
