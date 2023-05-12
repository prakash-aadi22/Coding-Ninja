import java.util.Scanner;

public class q_1_Modulo_product {
    public static long modularExp(long x, long y, long p) {
        long ans = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 != 0) {
                ans = (ans * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return ans;
    }

    public static long inverseMod(long n, long p) {
        return modularExp(n, p - 2, p);
    }

    public static long factorialMod(long n, long p) {
        if (n >= p) {
            return 0;
        }
        long ans = (p - 1);
        for (long i = n + 1; i < p; i++) {
            ans = (ans * inverseMod(i, p)) % p;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println(factorialMod(a, b));
        }
    }
}
