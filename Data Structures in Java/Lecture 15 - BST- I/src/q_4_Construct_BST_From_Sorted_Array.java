import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_4_Construct_BST_From_Sorted_Array {
    private static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
        if (arr.length == 0) {
            return null;
        }
        return convertToBST(arr, 0, arr.length - 1);
    }

    public static BinaryTreeNode<Integer> convertToBST(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);
        root.left = convertToBST(arr, left, mid - 1);
        root.right = convertToBST(arr, mid + 1, right);
        return root;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        BinaryTreeNode<Integer> ans = SortedArrayToBST(arr, len);
        preOrder(ans);
    }
}
