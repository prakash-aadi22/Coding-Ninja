import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_3_Structurally_Identical {
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

    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (!root1.data.equals(root2.data)) {
            return false;
        }
        if (root1.children.size() != root2.children.size()) {
            return false;
        }
        for (int i = 0; i < root1.children.size(); i++) {
            if (!checkIdentical(root1.children.get(i), root2.children.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root1 = takeInputLevelWise();
        TreeNode<Integer> root2 = takeInputLevelWise();
        System.out.println(checkIdentical(root1, root2));
    }
}
