package Extra_Practice;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Using_Binary_Tree {
    public static Binary_Tree_Node<Integer> takeInput_Recursively(Scanner sc) {
        System.out.print("Enter the data: ");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(rootData);
        root.left = takeInput_Recursively(sc);
        root.right = takeInput_Recursively(sc);
        return root;
    }

    public static Binary_Tree_Node<Integer> takeInput_LevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<Binary_Tree_Node<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        Binary_Tree_Node<Integer> root = new Binary_Tree_Node<>(rootData);
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            Binary_Tree_Node<Integer> front;
            front = pendingNodes.remove();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                Binary_Tree_Node<Integer> child = new Binary_Tree_Node<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                Binary_Tree_Node<Integer> child = new Binary_Tree_Node<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void print_Recursively(Binary_Tree_Node<Integer> root) {
        if (root == null) {
            return;
        }
        String print = root.data + " ";
        if (root.left != null) {
            print += "L: " + root.left.data + ", ";
        }
        if (root.right != null) {
            print += "R: " + root.right.data + ", ";
        }
        System.out.println(print);
        print_Recursively(root.left);
        print_Recursively(root.right);
    }

    public static void print_LevelWise(Binary_Tree_Node<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<Binary_Tree_Node<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            Binary_Tree_Node<Integer> front = pendingNodes.poll();
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

    public static int countNodes(Binary_Tree_Node<Integer> root) {
        if (root == null) {
            return 0;
        }
        int ans = 1;
        ans += countNodes(root.left);
        ans += countNodes(root.right);
        return ans;
    }

    public static int largestNode(Binary_Tree_Node<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Binary_Tree_Node<Integer> root = takeInput_Recursively(sc);
        print_Recursively(root);
        System.out.println(countNodes(root));
        System.out.println(largestNode(root));
        Binary_Tree_Node<Integer> root1 = takeInput_LevelWise();
        print_LevelWise(root1);
        System.out.println(countNodes(root1));
        System.out.println(largestNode(root1));
    }
}
