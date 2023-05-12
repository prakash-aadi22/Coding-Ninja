import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_3_Print_nodes_at_distance_k_from_node {

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
        nodesAtDistanceKWithRootDistance(root, node, k);
    }

    public static int nodesAtDistanceKWithRootDistance(BinaryTreeNode<Integer> root, int node, int k) {
        if (root == null)
            return -1;

        if (root.data == node) {

            printNodesDown(root, k);
            return 0;
        }
        int leftHeight = nodesAtDistanceKWithRootDistance(root.left, node, k);
        if (leftHeight != -1) {
            if (leftHeight + 1 == k) {
                System.out.println(root.data);
            } else {
                printNodesDown(root.right, k - leftHeight - 2);

            }
            return leftHeight + 1;
        }
        int rightHeight = nodesAtDistanceKWithRootDistance(root.right, node, k);
        if (rightHeight != -1) {
            if (rightHeight + 1 == k) {
                System.out.println(root.data);
            } else {
                printNodesDown(root.left, k - rightHeight - 2);
            }
            return rightHeight + 1;
        }
        return -1;
    }

    public static void printNodesDown(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        printNodesDown(root.left, k - 1);
        printNodesDown(root.right, k - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        int target = sc.nextInt();
        int k = sc.nextInt();
        nodesAtDistanceK(root, target, k);
    }
}
