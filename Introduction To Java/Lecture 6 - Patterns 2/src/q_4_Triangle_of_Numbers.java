import java.util.Scanner;

public class q_4_Triangle_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int i, j, k;
        k = n - 1;
        for (j = 1; j <= n; j++) {
            num = j;
            for (i = 1; i <= k; i++)
                System.out.print(" ");
            k--;
            for (i = 1; i <= j; i++) {
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for (i = 1; i < j; i++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
}
