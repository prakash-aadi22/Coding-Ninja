
import java.util.ArrayList;
import java.util.Scanner;

class GenericTreeNode<T> {
    T data;
    ArrayList<GenericTreeNode<T>> children;

    GenericTreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

class NotGenericTreeNode {
    int data;
    ArrayList<NotGenericTreeNode> children; // Error --> ArrayList<Integer>
    // Fixed --> ArrayList<NotGenericTreeNode>

    NotGenericTreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class Node_OF_Tree {
    public static GenericTreeNode<Integer> Generic_takeInput_Recursively(Scanner sc) {
        System.out.print("Enter the NODE data: ");
        int n = sc.nextInt();
        GenericTreeNode<Integer> root = new GenericTreeNode<>(n);
        System.out.print("Enter the number of children for " + n + ": ");
        int childCount = sc.nextInt();
        for (int i = 0; i < childCount; i++) {
            GenericTreeNode<Integer> child = Generic_takeInput_Recursively(sc);
            root.children.add(child);
        }
        return root;
    }

    public static void Generic_print_Recursively(GenericTreeNode<Integer> root) {
        StringBuilder ans = new StringBuilder(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            ans.append(root.children.get(i).data).append(", ");
        }
        System.out.println(ans);
        for (int i = 0; i < root.children.size(); i++) {
            Generic_print_Recursively(root.children.get(i));
        }
    }

    public static NotGenericTreeNode NotGeneric_takeInput_Recursively(Scanner sc) {
        System.out.print("Enter the NODE data: ");
        int n = sc.nextInt();
        NotGenericTreeNode root = new NotGenericTreeNode(n);
        System.out.print("Enter the number of children for " + n + ": ");
        int childCount = sc.nextInt();
        for (int i = 0; i < childCount; i++) {
            NotGenericTreeNode child = NotGeneric_takeInput_Recursively(sc);
            root.children.add(child);
        }
        return root;
    }

    public static void NotGeneric_print_Recursively(NotGenericTreeNode root) {
        StringBuilder ans = new StringBuilder(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            ans.append(root.children.get(i).data).append(", ");
        }
        System.out.println(ans);
        for (int i = 0; i < root.children.size(); i++) {
            NotGeneric_print_Recursively(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericTreeNode<Integer> root = Generic_takeInput_Recursively(sc);
        Generic_print_Recursively(root);
        NotGenericTreeNode root1 = NotGeneric_takeInput_Recursively(sc);
        NotGeneric_print_Recursively(root1);
    }
}
