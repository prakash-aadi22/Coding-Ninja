import java.util.Scanner;

public class q_a_2_Parallelogram_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= r; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
