import java.util.*;

public class q_a_4_Pair_Sum_Binary_Tree {

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

    static void pairSum(BinaryTreeNode<Integer> root, int sum) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> arr = convertTreeToArray(root);
        Collections.sort(arr);
        int i = 0, j = arr.size() - 1;
        while (i < j) {

            if (arr.get(i) + arr.get(j) == sum) {
                System.out.println(arr.get(i) + " " + arr.get(j));
                i++;
                j--;
            } else if (arr.get(i) + arr.get(j) < sum) {
                i++;
            } else {
                j--;
            }
        }
    }

    public static ArrayList<Integer> convertTreeToArray(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> leftArrayList = convertTreeToArray(root.left);
        ArrayList<Integer> rightArrayList = convertTreeToArray(root.right);
        ArrayList<Integer> ansArrayList = new ArrayList<>();
//        for (int i : leftArrayList) {
//            ansArrayList.add(i);
//        }
//        for (int i : rightArrayList) {
//            ansArrayList.add(i);
//        }
//        ansArrayList.add(root.data);
//        return ansArrayList;
        ansArrayList.addAll(leftArrayList);
        ansArrayList.addAll(rightArrayList);

        ansArrayList.add(root.data);
        return ansArrayList;
    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput_LevelWise();
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        pairSum(root, sum);
    }
}
