import java.util.Scanner;

public class q_4_Number_of_Balanced_BTs {

    public static long balancedBTs(long n) {
        int mod = (int) Math.pow(10, 9) + 7;
        return balancedBTs(n, mod);
    }

    public static long balancedBTs(long n, int mod) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long x = balancedBTs(n - 1);
        long y = balancedBTs(n - 2);
        return (x * x + 2 * x * y) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(balancedBTs(n));
    }
}
