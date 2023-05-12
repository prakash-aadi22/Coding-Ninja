import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_1_Check_if_generic_tree_contain_element_x {
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

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }
        for (TreeNode<Integer> child : root.children) {
            if (checkIfContainsX(child, x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int x = sc.nextInt();
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(checkIfContainsX(root, x));
    }
}
