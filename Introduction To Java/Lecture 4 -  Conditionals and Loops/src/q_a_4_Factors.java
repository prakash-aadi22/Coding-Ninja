import java.util.Scanner;

public class q_a_4_Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 2;
        while (i != num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
