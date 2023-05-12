import java.util.Scanner;

public class q_a_2_Staircase {

    public static int staircase(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int op1 = staircase(n - 1);
        int op2 = staircase(n - 2);
        int op3 = staircase(n - 3);
        return op1 + op2 + op3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(staircase(n));
    }
}
