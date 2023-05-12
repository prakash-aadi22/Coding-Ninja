import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_4_Find_Height {
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

    public static int getHeight(TreeNode<Integer> root) {
        if (root == null) { // Not a Base Case
            return 0;
        }
        int max = 1;
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight = 1 + getHeight(root.children.get(i));
            if (max < childHeight) {
                max = childHeight;
            }
        }
//        for (TreeNode<Integer> child : root.children) {
//            int childHeight = 1 + getHeight(child);
//            if (max < childHeight) {
//                max = childHeight;
//            }
//        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInputLevelWise();
        System.out.println(getHeight(root));
    }
}
