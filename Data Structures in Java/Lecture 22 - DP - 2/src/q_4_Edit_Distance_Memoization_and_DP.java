import java.util.Scanner;

public class q_4_Edit_Distance_Memoization_and_DP {
    public static int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] storage = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                storage[i][j] = -1;
            }
        }
        return editDistanceM(s, t, storage);
    }


    private static int editDistanceM(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();
        if (storage[m][n] != -1) {
            return storage[m][n];
        }
        if (m == 0) {
            storage[m][n] = n;
            return storage[m][n];
        }
        if (n == 0) {
            storage[m][n] = m;
            return storage[m][n];
        }
        if (s.charAt(0) == t.charAt(0)) {
            storage[m][n] = editDistanceM(s.substring(1), t.substring(1), storage);
        } else {
            int op1 = editDistanceM(s, t.substring(1), storage);
            int op2 = editDistanceM(s.substring(1), t, storage);
            int op3 = editDistanceM(s.substring(1), t.substring(1), storage);
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
        }
        return storage[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(editDistance(str1, str2));
    }
}
