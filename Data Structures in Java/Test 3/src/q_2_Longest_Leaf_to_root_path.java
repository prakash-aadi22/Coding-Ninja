import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_2_Longest_Leaf_to_root_path {

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

    public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> leftArrayList = longestRootToLeafPath(root.left);
        ArrayList<Integer> rightArrayList = longestRootToLeafPath(root.right);
        if (leftArrayList.size() >= rightArrayList.size()) {

            leftArrayList.add(root.data);
            return leftArrayList;

        } else {
            rightArrayList.add(root.data);
            return rightArrayList;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        ArrayList<Integer> output = longestRootToLeafPath(root);
        for (int i : output) {
            System.out.println(i);
        }
    }
}
