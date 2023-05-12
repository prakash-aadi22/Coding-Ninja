import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1_Print_Level_Wise {
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

    public static void printLevelWise(TreeNode<Integer> root) {
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if (root == null) {
            return;
        }
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode<Integer> node = q.poll();
            if (node != null) {
                System.out.print(node.data + " ");
                for (int i = 0; i < node.children.size(); i++) {
                    q.add(node.children.get(i));
                }
            } else {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
    }
}
