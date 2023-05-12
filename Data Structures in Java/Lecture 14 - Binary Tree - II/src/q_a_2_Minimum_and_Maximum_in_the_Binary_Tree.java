import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair2<T, U> {
    T minimum;
    U maximum;

    public Pair2(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

public class q_a_2_Minimum_and_Maximum_in_the_Binary_Tree {
    public static BinaryTreeNode<Integer> takeInput_LevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front;
            front = pendingNodes.remove();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;
    }

    private static final Pair2<Integer, Integer> maxMin = new Pair2<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);

    public static Pair2<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
        getMinAndMaxHelper(root);
        return maxMin;
    }

    private static void getMinAndMaxHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        int rootData = root.data;
        int maxVal = maxMin.maximum;
        if (rootData > maxVal) {
            maxMin.maximum = root.data;
        }
        int minVal = maxMin.minimum;
        if (rootData < minVal) {
            maxMin.minimum = root.data;
        }
        getMinAndMaxHelper(root.left);
        getMinAndMaxHelper(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        Pair2<Integer, Integer> pair = getMinAndMax(root);
        System.out.println(pair.minimum + " " + pair.maximum);
    }
}
