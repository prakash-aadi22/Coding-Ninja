import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge> {
    int source;
    int dest;
    int weight;

    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

public class q_1_Kruskal_Algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Edge[] input = new Edge[e];
        for (int i = 0; i < e; i++) {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            int weight = sc.nextInt();
            Edge edge = new Edge();
            edge.source = sv;
            edge.dest = ev;
            edge.weight = weight;
            input[i] = edge;
        }
        Arrays.sort(input);
        kruskals(input, n);
    }

    public static void kruskals(Edge[] input, int n) {
        Edge[] output = new Edge[n - 1];
        int[] parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        int count = 0;
        int i = 0;
        while (count < n - 1) {
            int parentSource = findParent(parent, input[i].source);
            int parentDest = findParent(parent, input[i].dest);
            if (parentDest == parentSource) {
                i++;
                continue;
            }
            output[count] = input[i];
            parent[parentSource] = parentDest;
            count++;
            i++;
        }
        for (Edge edge : output) {
            if (edge.source < edge.dest)
                System.out.println(edge.source + " " + edge.dest + " " + edge.weight);
            else {
                System.out.println(edge.dest + " " + edge.source + " " + edge.weight);
            }
        }
    }

    public static int findParent(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return findParent(parent, parent[i]);
    }
}
