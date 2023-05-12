import java.util.Scanner;

public class q_2_Fibonacci_Number {
    public static boolean checkMember(int n) {
        int a = 0, b = 1;
        if (n == 0) {
            return true;
        }
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
            if (c == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkMember(n));
    }
}
