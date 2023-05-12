import java.util.Scanner;

class GenericNode<T> {
    T data;
    GenericNode<T> left;
    GenericNode<T> right;

    GenericNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class NotGenericNode {
    int data;
    NotGenericNode left;
    NotGenericNode right;

    NotGenericNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Node_OF_BinaryTree_OR_BinarySearchTree {

    public static GenericNode<Integer> Generic_takeInput_Recursively(Scanner sc) {
        System.out.print("Enter the data: ");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        GenericNode<Integer> root = new GenericNode<>(rootData);
        root.left = Generic_takeInput_Recursively(sc);
        root.right = Generic_takeInput_Recursively(sc);
        return root;
    }

    public static void Generic_print_Recursively(GenericNode<Integer> root) {
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
        Generic_print_Recursively(root.left);
        Generic_print_Recursively(root.right);
    }

    public static NotGenericNode NotGeneric_takeInput_Recursively(Scanner sc) {
        System.out.print("Enter the data: ");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }
        NotGenericNode root = new NotGenericNode(rootData);
        root.left = NotGeneric_takeInput_Recursively(sc);
        root.right = NotGeneric_takeInput_Recursively(sc);
        return root;
    }

    public static void NotGeneric_print_Recursively(NotGenericNode root) {
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
        NotGeneric_print_Recursively(root.left);
        NotGeneric_print_Recursively(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotGenericNode root = NotGeneric_takeInput_Recursively(sc);
        NotGeneric_print_Recursively(root);
        GenericNode<Integer> root1 = Generic_takeInput_Recursively(sc);
        Generic_print_Recursively(root1);
    }
}
