import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_4_Next_larger_element {
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

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n) {
        if (root == null) {
            return null;
        }
        TreeNode<Integer> nextLargerNode = null;
        if (root.data > n) nextLargerNode = root;
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
            if (nextLargerInChild != null) {
                if (nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        TreeNode<Integer> root = takeInputLevelWise();
        TreeNode<Integer> ans = findNextLargerNode(root, n);
        if (ans == null) {
            System.out.println(Integer.MIN_VALUE);
        } else {
            System.out.println(ans.data);
        }

    }
}
