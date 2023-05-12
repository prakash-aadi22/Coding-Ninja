package Extra_Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Using_Tree {
    public static Tree_Node<Integer> takeInput_Recursively(Scanner sc) {
//        System.out.print("Enter the NODE data: ");
        int n = sc.nextInt();
        Tree_Node<Integer> root = new Tree_Node<>(n);
//        System.out.print("Enter the number of children for " + n + ": ");
        int childCount = sc.nextInt();
        for (int i = 0; i < childCount; i++) {
            Tree_Node<Integer> child = takeInput_Recursively(sc);
            root.children.add(child);
        }
        return root;
    }

    public static Tree_Node<Integer> takeInput_LevelWise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
//        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        Queue<Tree_Node<Integer>> pendingNodes = new LinkedList<>();
        Tree_Node<Integer> root = new Tree_Node<>(rootData);
//        pendingNodes.enqueue(root);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
//            Tree_Node<Integer> frontNode = pendingNodes.dequeue();
            Tree_Node<Integer> frontNode = pendingNodes.remove();
            System.out.println("Enter num of children of " + frontNode.data);
            int numChildren = sc.nextInt();
            for (int i = 0; i < numChildren; i++) {
                System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
                int child = sc.nextInt();
                Tree_Node<Integer> childNode = new Tree_Node<Integer>(child);
                frontNode.children.add(childNode);
//                pendingNodes.enqueue(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    public static void print_Recursively(Tree_Node<Integer> root) {
//        String ans = root.data + ": ";
//        for (int i = 0; i < root.children.size(); i++) {
//            ans += root.children.get(i).data + ", ";
//        }
        StringBuilder ans = new StringBuilder(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            ans.append(root.children.get(i).data).append(", ");
        }
        System.out.println(ans);
        for (int i = 0; i < root.children.size(); i++) {
            print_Recursively(root.children.get(i));
        }
    }

    public static int numberOfNodes(Tree_Node<Integer> root) {
        if (root == null) { // Not a Base Case
            return 0;
        }
        int count = 1; // For first Root
        for (int i = 0; i < root.children.size(); i++) {
            count += numberOfNodes(root.children.get(i));
        }
        return count;
    }

    public static int largestNodeData(Tree_Node<Integer> root) {
        if (root == null) { // Not a Base Case
            return Integer.MIN_VALUE;
        }
        int largest = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largestNodeData(root.children.get(i));
            if (childLargest > largest) {
                largest = childLargest;
            }
        }
        return largest;
    }

    public static int getHeight(Tree_Node<Integer> root) {
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

    public static void printAtDepthK(Tree_Node<Integer> root, int k) {
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAtDepthK(root.children.get(i), k - 1);
        }
        for (Tree_Node<Integer> child: root.children) {
            printAtDepthK(child, k - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Tree_Node<Integer> root = new Tree_Node<>(0);
//
//        Tree_Node<Integer> node1 = new Tree_Node<>(1);
//        Tree_Node<Integer> node2 = new Tree_Node<>(2);
//        Tree_Node<Integer> node3 = new Tree_Node<>(3);
//        Tree_Node<Integer> node4 = new Tree_Node<>(4);
//        Tree_Node<Integer> node5 = new Tree_Node<>(5);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//        node2.children.add(node5);
//
//        System.out.println(root);
//        System.out.println(node1);
//        System.out.println(node2);
//        System.out.println(node3);
//        System.out.println(node4);
//        System.out.println(node5);


        Tree_Node<Integer> root = takeInput_Recursively(sc);
        print_Recursively(root);

        Tree_Node<Integer> root1 = takeInput_LevelWise();
        print_Recursively(root1);
    }
}
