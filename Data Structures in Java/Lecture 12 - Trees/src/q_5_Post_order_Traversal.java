import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_5_Post_order_Traversal {
    static Scanner sc = new Scanner(System.in);

    public static TreeNode<Integer> takeInputLevelWise() {
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> frontNode = pendingNodes.remove();
            System.out.println("Enter num of children of " + frontNode.data);
            int numChildren = sc.nextInt();
            for (int i = 0; i < numChildren; i++) {
                System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    public static void printPreOrder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
//        for (int i = 0; i < root.children.size(); i++) {
//            printPreOrder(root.children.get(i));
//        }
        for (TreeNode<Integer> child : root.children) {
            printPreOrder(child);
        }
    }

    public static void printPostOrder(TreeNode<Integer> root) {
        if (root == null) {
            return;
        }
//        for (int i = 0; i < root.children.size(); i++) {
//            printPostOrder(root.children.get(i));
//        }
        for (TreeNode<Integer> child : root.children) {
            printPostOrder(child);
        }
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        printPreOrder(root);
        System.out.println();
        printPostOrder(root);
    }
}
