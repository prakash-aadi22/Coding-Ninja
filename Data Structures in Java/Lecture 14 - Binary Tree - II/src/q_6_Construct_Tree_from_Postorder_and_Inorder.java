
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pair1 {
    int[] postOrder;
    int[] inOrder;

    public Pair1(int[] postOrder, int[] inOrder) {
        this.postOrder = postOrder;
        this.inOrder = inOrder;
    }

}

public class q_6_Construct_Tree_from_Postorder_and_Inorder {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Pair1 takeInput() throws NumberFormatException, IOException {
        int n = Integer.parseInt(br.readLine().trim());
        int[] pre = new int[n];
        int[] in = new int[n];
        String[] postOrder = br.readLine().trim().split(" ");
        String[] inOrder = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            pre[i] = Integer.parseInt(postOrder[i].trim());
            in[i] = Integer.parseInt(inOrder[i].trim());
        }
        return new Pair1(pre, in);

    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
        return buildTree(postOrder, inOrder, 0, postOrder.length - 1, 0, inOrder.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int siPost, int eiPost, int siIn, int eiIn) {
        //Base case - If number of elements in the post-order is 0
        if (siPost > eiPost) {
            return null;
        }

        //Defining the root node for current recursion
        int rootData = postOrder[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndex = -1;
        for (int i = siIn; i <= eiIn; i++) {
            if (rootData == inOrder[i]) {
                rootIndex = i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft = siIn;
        int eiInLeft = rootIndex - 1;

        //Defining the index limits for Left Subtree Preorder
        int siPostLeft = siPost;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPostLeft = (siPostLeft) + (leftSubTreeLength - 1);

        //Defining index limits for Right Subtree Inorder
        int siInRight = rootIndex + 1;
        int eiInRight = eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPostRight = eiPostLeft + 1;
        int eiPostRight = eiPost - 1;

        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);
        BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);

        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
            if (frontNode == null) {
                System.out.println();
                if (!pendingNodes.isEmpty()) {
                    pendingNodes.add(null);
                }
            } else {
                System.out.print(frontNode.data + " ");
                if (frontNode.left != null) {
                    pendingNodes.add(frontNode.left);
                }
                if (frontNode.right != null) {
                    pendingNodes.add(frontNode.right);
                }
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Pair1 input = takeInput();
        int[] postOrder = input.postOrder;
        int[] inOrder = input.inOrder;
        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder);
        printLevelWise(root);
    }
}