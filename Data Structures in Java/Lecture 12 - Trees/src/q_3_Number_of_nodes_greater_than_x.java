import Extra_Practice.Tree_Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_3_Number_of_nodes_greater_than_x {
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

    public static int numNodeGreater(TreeNode<Integer> root, int x) {
        if (root == null) { // Not a Base Case
            return 0;
        }
        int count = 0;
        if (root.data > x) {
            count++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            count += numNodeGreater(root.children.get(i), x);
        }
//        for (TreeNode<Integer> node : root.children) {
//            count += numNodeGreater(node, x);
//        }
        return count;
    }


    public static void main(String[] args) {
        int x = sc.nextInt();
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(numNodeGreater(root, x));
    }
}
