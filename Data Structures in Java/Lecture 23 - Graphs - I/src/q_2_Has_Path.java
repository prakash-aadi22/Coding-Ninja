import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class q_2_Has_Path {
    public static void printHelper(int[][] edges, int v1, int v2, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n = edges.length;
        while (q.size() != 0) {
            int out = q.remove();
            visited[out] = true;
            if (out == v2) {
                System.out.print("true");
                return;
            }
            for (int i = 0; i < n; i++) {
                if (edges[out][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.print("false");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] edges = new int[n][n];
        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        boolean[] visited = new boolean[edges[0].length];
        printHelper(edges, v1, v2, visited);
    }
}
