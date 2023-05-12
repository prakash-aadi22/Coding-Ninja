import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_a_5_Second_Largest_Element_In_Tree {
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

    static class Pair<T> {
        T first;
        T second;

        Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {
        return findSecondLargestT(root).second;
    }

    public static Pair<TreeNode<Integer>> findSecondLargestT(TreeNode<Integer> root) {
        Pair<TreeNode<Integer>> output;
        if (root == null) {
            output = new Pair<TreeNode<Integer>>(null, null);
            return output;
        }
        output = new Pair<TreeNode<Integer>>(root, null);
        for (TreeNode<Integer> child : root.children) {
            Pair<TreeNode<Integer>> childPair = findSecondLargestT(child);
            if (childPair.first.data > output.first.data) {
                if (childPair.second == null || childPair.second.data < output.first.data) {
                    output.second = output.first;
                    output.first = childPair.first;
                } else {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } else if (childPair.first.data.equals(output.first.data) && childPair.second != null) {
                output.second = childPair.second;
            } else if (output.first.data != childPair.first.data && (output.second == null || childPair.first.data > output.second.data)) {
                output.second = childPair.first;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        TreeNode<Integer> ans = findSecondLargest(root);
        if (ans == null) {
            System.out.println(Integer.MIN_VALUE);
        } else {
            System.out.println(ans.data);
        }
    }
}
