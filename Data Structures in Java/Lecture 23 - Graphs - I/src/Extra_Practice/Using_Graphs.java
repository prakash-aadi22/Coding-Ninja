package Extra_Practice;

import java.util.Scanner;

public class Using_Graphs {
    static Scanner sc = new Scanner(System.in);

    public static void printDFS(int[][] matrix) {
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            if (!visited[i]) {
                printHelperDFS(matrix, i, visited);
            }
        }
    }

    public static void printHelperDFS(int[][] matrix, int startingVertex, boolean[] visited) {
        System.out.println(startingVertex);
        visited[startingVertex] = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[startingVertex][i] == 1 && !visited[i]) {
                printHelperDFS(matrix, i, visited);
            }
        }
    }

    public static int[][] takeInput() {
        System.out.print("Enter the number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter the number of edges: ");
        int edges = sc.nextInt();
        int[][] matrix = new int[vertices][vertices];
        System.out.println("Enter the connecting vertices --> ");
        for (int i = 0; i < edges; i++) {
            System.out.print("Enter the value first front connecting vertex: ");
            int firstVertex = sc.nextInt();
            System.out.print("Enter the value second end connecting vertex: ");
            int secondVertex = sc.nextInt();
            matrix[firstVertex][secondVertex] = 1;
            matrix[secondVertex][firstVertex] = 1;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        printDFS(arr);
    }
}
