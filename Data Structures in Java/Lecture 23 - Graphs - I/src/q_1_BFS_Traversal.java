import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q_1_BFS_Traversal {
    public static void printHelper(int[][] edges, int sv, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        while (q.size() != 0) {
            int firstElem = q.remove();
            System.out.print(firstElem + " ");
            visited[sv] = true;
            for (int i = 0; i < edges[0].length; i++) {
                if (edges[firstElem][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void print(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                printHelper(edges, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] edges = new int[V][V];
        for (int i = 0; i < E; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        print(edges);
    }
}
