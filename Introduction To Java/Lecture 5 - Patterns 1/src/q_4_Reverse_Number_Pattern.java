import java.util.Scanner;

public class q_4_Reverse_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i - j);
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}
