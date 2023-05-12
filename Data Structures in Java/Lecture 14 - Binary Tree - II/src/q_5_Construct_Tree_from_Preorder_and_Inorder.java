import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int[] preOrder;
    int[] inOrder;

    public Pair(int[] preOrder, int[] inOrder) {
        this.preOrder = preOrder;
        this.inOrder = inOrder;
    }

}

public class q_5_Construct_Tree_from_Preorder_and_Inorder {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Pair takeInput_LevelWise() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        int[] pre = new int[n];
        int[] in = new int[n];
        String[] preOrder = br.readLine().trim().split(" ");
        String[] inOrder = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            pre[i] = Integer.parseInt(preOrder[i].trim());
            in[i] = Integer.parseInt(inOrder[i].trim());
        }
        return new Pair(pre, in);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        return buildTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] preorder, int[] inorder, int siPre, int eiPre, int siIn, int eiIn) {
        //Base case - If number of elements in the pre-order is 0
        if (siPre > eiPre) {
            return null;
        }

        //Defining the root node for current recursion
        int rootData = preorder[siPre];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndexInorder = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (rootData == inorder[i]) {
                rootIndexInorder = i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft = siIn;
        int eiInLeft = rootIndexInorder - 1;

        //Defining the index limits for Left Subtree Preorder
        int siPreLeft = siPre + 1;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPreLeft = (siPreLeft) + (leftSubTreeLength - 1);

        //Defining index limits for Right Subtree Inorder
        int siInRight = rootIndexInorder + 1;
        int eiInRight = eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPreRight = eiPreLeft + 1;
        int eiPreRight = eiPre;

        BinaryTreeNode<Integer> leftChild = buildTree(preorder, inorder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> rightChild = buildTree(preorder, inorder, siPreRight, eiPreRight, siInRight, eiInRight);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void print_LevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            if (front != null) {
                System.out.print(front.data + ":");
                if (front.left == null) {
                    System.out.print("L:-1");
                } else {
                    System.out.print("L:" + front.left.data);
                }
                if (front.right == null) {
                    System.out.print(",R:-1");
                } else {
                    System.out.print(",R:" + front.right.data);
                }
                System.out.println();
                pendingNodes.add(front.left);
                pendingNodes.add(front.right);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Pair input = takeInput_LevelWise();
        int[] preOrder = input.preOrder;
        int[] inOrder = input.inOrder;
        BinaryTreeNode<Integer> root = buildTree(preOrder, inOrder);
        print_LevelWise(root);
    }
}
