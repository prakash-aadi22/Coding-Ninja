import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_2_Node_having_sum_of_children_and_node_is_max {
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

    public static TreeNode<Integer> ans;
    public static int max = 0;

    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
        if (root.children.size() == 0) {
            return root;
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); i++) {
//            sum += root.children.get(i).data; // Correct in Coding Ninjas
        }
        if (sum > max) {
            max = sum;
            ans = root;
        }
        for (int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> temp = maxSumNode(root.children.get(i));
            if (temp.data > max) {
                max = temp.data;
                ans = root.children.get(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        TreeNode<Integer> ans = maxSumNode(root);
        if (ans == null) {
            System.out.println(Integer.MIN_VALUE);
        } else {
            System.out.println(ans.data);
        }
    }
}
