import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q_1_Islands {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int[][] takeInput() throws IOException {
        String[] strNums;
        strNums = br.readLine().split("\\s");
        int n = Integer.parseInt(strNums[0]);
        int e = Integer.parseInt(strNums[1]);
        int[][] edges = new int[n][n];
        int firstVertex, secondVertex;
        for (int i = 0; i < e; i++) {
            String[] strNums1;
            strNums1 = br.readLine().split("\\s");
            firstVertex = Integer.parseInt(strNums1[0]);
            secondVertex = Integer.parseInt(strNums1[1]);
            edges[firstVertex][secondVertex] = 1;
            edges[secondVertex][firstVertex] = 1;
        }
        return edges;
    }

    public static int numConnected(int[][] edges, int n) {
        boolean[] visited = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(edges, i, visited, n);
                count++;
            }
        }
        return count;
    }

    private static void dfs(int[][] edges, int v1, boolean[] visited, int n) {
        visited[v1] = true;
        for (int i = 0; i < n; i++) {
            if (visited[i] == false && edges[v1][i] == 1) {
                dfs(edges, i, visited, n);
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int[][] edges = takeInput();
        int ans = numConnected(edges, edges.length);
        System.out.println(ans);
    }
}
