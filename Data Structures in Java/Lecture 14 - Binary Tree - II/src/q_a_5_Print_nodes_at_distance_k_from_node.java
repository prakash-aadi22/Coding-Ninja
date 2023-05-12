import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_5_Print_nodes_at_distance_k_from_node {

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

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        printKDistanceNode(root, node, k);
    }

    private static void printKDistanceFromRoot(BinaryTreeNode<Integer> node, int k) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(node.data);
            return;
        }
        printKDistanceFromRoot(node.left, k - 1);
        printKDistanceFromRoot(node.right, k - 1);
    }

    private static int printKDistanceNode(BinaryTreeNode<Integer> root, int node, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == node) {
            printKDistanceFromRoot(root, k);
            return 0;
        }
        int dl = printKDistanceNode(root.left, node, k);
        if (dl != -1) {
            if (dl + 1 == k) {
                System.out.println(root.data);
            } else {
                printKDistanceFromRoot(root.right, k - dl - 2);
            }
            return 1 + dl;
        }
        int rd = printKDistanceNode(root.right, node, k);
        if (rd != -1) {
            if (rd + 1 == k) {
                System.out.println(root.data);
            } else {
                printKDistanceFromRoot(root.left, k - rd - 2);
            }
            return 1 + rd;
        }
        return -1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        String[] target_k = br.readLine().trim().split(" ");
        int target = Integer.parseInt(target_k[0].trim());
        int k = Integer.parseInt(target_k[1].trim());
        nodesAtDistanceK(root, target, k);
    }
}
