import java.util.Scanner;

public class q_5_Is_Connected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] edges = new int[V][V];
        if (V == 0 && E == 0) {
            System.out.println("true");
            return;
        }
        for (int i = 0; i < E; i++) {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        boolean ans = isConnected(edges);
        System.out.println(ans);
    }

    public static boolean isConnected(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        DFS(edges, 0, visited);
        for (boolean elem : visited) {
            if (elem == false)
                return false;
        }
        return true;
    }

    public static void DFS(int[][] edges, int startVer, boolean[] visited) {
        visited[startVer] = true;
        for (int i = 0; i < edges.length; i++) {
            if (edges[startVer][i] == 1 && !visited[i]) {
                visited[i] = true;
                DFS(edges, i, visited);
            }
        }
        return;
    }
}
