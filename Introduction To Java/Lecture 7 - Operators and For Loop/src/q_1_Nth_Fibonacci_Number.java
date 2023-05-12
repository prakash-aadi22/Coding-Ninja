import java.util.Scanner;

public class q_1_Nth_Fibonacci_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
