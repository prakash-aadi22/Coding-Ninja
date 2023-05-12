import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class q_6_All_connected_components {
    public static void helper(int[][] edges, boolean[] visited, ArrayList<Integer> arr, int start) {
        visited[start] = true;
        arr.add(start);
        int n = edges.length;
        for (int j = 0; j < n; j++) {
            if (edges[start][j] == 1 && !visited[j]) {
                helper(edges, visited, arr, j);
            }
        }
    }

    public static void help(int[][] edges) {
        boolean[] visited = new boolean[edges.length];
        for (int i = 0; i < edges.length; i++) {
            if (!visited[i]) {
                ArrayList<Integer> arrAns = new ArrayList<Integer>();
                helper(edges, visited, arrAns, i);
                Collections.sort(arrAns);
//                for (int j = 0; j < arrAns.size(); j++) {
//                    System.out.print(arrAns.get(j) + " ");
//                }
                for (Integer arrAn : arrAns) {
                    System.out.print(arrAn + " ");
                }
                System.out.println();
            }
        }
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
        help(edges);
    }
}
