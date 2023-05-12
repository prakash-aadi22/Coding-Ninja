import java.util.HashMap;
import java.util.Scanner;

public class q_a_1_Byte_Landian {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        if (n < 12) {
            memo.put(n, n);
            return n;
        }
        if (!memo.containsKey(n)) {
            long ans1 = bytelandian(n / 2, memo);
            long ans2 = bytelandian(n / 3, memo);
            long ans3 = bytelandian(n / 4, memo);
            long currVal = ans1 + ans2 + ans3;
            memo.put(n, Math.max(currVal, n));
        }
        return memo.get(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
        System.out.println(bytelandian(n, memo));
    }
}
