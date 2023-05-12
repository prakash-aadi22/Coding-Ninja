import java.util.Scanner;

public class q_a_2_Terms_of_AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = (3 * i) + 2;
            if (sum % 4 == 0){
                n++;
                continue;
            }
            System.out.print(sum + " ");
        }
    }
}
