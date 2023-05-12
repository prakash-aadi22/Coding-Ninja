import java.util.Scanner;

public class count_of_triangles_with_total_n_points_with_m_collinear {
    public static int nCk(int n, int k) {
        int[] C = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            C[i] = 0;
        }

        C[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, k); j > 0; j--) {
                C[j] = C[j] + C[j - 1];
            }
        }
        return C[k];
    }

    public static int countTriangles(int n, int m) {
        return (nCk(n, 3) - nCk(m, 3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // If n = 5, m = 4 so answer = 6
        // n = 8, m = 4, ans = 52
        System.out.print("Enter the numbers of points: ");
        int n = sc.nextInt();
        System.out.print("Enter the numbers of collinear: ");
        int m = sc.nextInt();
        System.out.println(countTriangles(n, m));

    }
}
