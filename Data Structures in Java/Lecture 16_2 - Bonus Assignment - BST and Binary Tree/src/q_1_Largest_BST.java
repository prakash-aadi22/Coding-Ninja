import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair<T, V> {
    T first;
    V second;

}

public class q_1_Largest_BST {

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

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        return largestBSTSubtree1(root).second.second;
    }

    public static Pair<Pair<Integer, Integer>, Pair<Boolean, Integer>> largestBSTSubtree1(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Integer, Integer> innerPair1 = new Pair<>();
            innerPair1.first = Integer.MIN_VALUE;
            innerPair1.second = Integer.MAX_VALUE;
            Pair<Boolean, Integer> innerPair2 = new Pair<>();
            innerPair2.first = true;
            innerPair2.second = 0;
            Pair<Pair<Integer, Integer>, Pair<Boolean, Integer>> ansPair = new Pair<>();
            ansPair.first = innerPair1;
            ansPair.second = innerPair2;
            return ansPair;
        }
        Pair<Pair<Integer, Integer>, Pair<Boolean, Integer>> leftAnsPair = largestBSTSubtree1(root.left);
        Pair<Pair<Integer, Integer>, Pair<Boolean, Integer>> rightAnsPair = largestBSTSubtree1(root.right);
        Pair<Pair<Integer, Integer>, Pair<Boolean, Integer>> ansPair = new Pair<>();
        Pair<Integer, Integer> innerPair1 = new Pair<>();
        Pair<Boolean, Integer> innerPair2 = new Pair<>();
        innerPair1.first = Math.max(Math.max(leftAnsPair.first.first, rightAnsPair.first.first), root.data);
        innerPair1.second = Math.min(Math.min(leftAnsPair.first.second, rightAnsPair.first.second), root.data);
        innerPair2.first = leftAnsPair.second.first && rightAnsPair.second.first && (leftAnsPair.first.first < root.data) && (rightAnsPair.first.second > root.data);
        if (innerPair2.first) {
            innerPair2.second = Math.max(leftAnsPair.second.second, rightAnsPair.second.second) + 1;
        } else {
            innerPair2.second = Math.max(leftAnsPair.second.second, rightAnsPair.second.second);
        }
        ansPair.first = innerPair1;
        ansPair.second = innerPair2;
        return ansPair;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        System.out.println(largestBSTSubtree(root));
    }
}
