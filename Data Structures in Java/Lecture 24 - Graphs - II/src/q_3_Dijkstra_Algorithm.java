import java.util.Scanner;

public class q_3_Dijkstra_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int[][] graph = new int[n][n];
        int t1, t2, cost;
        while (e > 0) {
            e--;
            t1 = sc.nextInt();
            t2 = sc.nextInt();
            cost = sc.nextInt();
            graph[t1][t2] = cost;
            graph[t2][t1] = cost;
        }
        int[] dis = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 1; i < n; i++)
            dis[i] = Integer.MAX_VALUE;
        int source;
        for (int i = 0; i < n; i++) {
            source = findMinVertex(dis, visited);
            visited[source] = true;
            for (int j = 0; j < n; j++) {
                if (graph[source][j] > 0 && visited[j] == false && dis[j] > dis[source] + graph[source][j]) {
                    dis[j] = dis[source] + graph[source][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i + " " + dis[i]);
        }
    }

    public static int findMinVertex(int[] dis, boolean[] visited) {
        int v, min_edge, n;
        min_edge = Integer.MAX_VALUE;
        n = dis.length;
        v = -1;
        for (int i = 0; i < n; i++) {
            if (min_edge > dis[i] && visited[i] == false) {
                min_edge = dis[i];
                v = i;
            }
        }
        return v;
    }
}
