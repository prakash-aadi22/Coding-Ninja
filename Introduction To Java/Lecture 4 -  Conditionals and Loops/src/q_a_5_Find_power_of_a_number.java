import java.util.Scanner;

public class q_a_5_Find_power_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
//        System.out.println((int) Math.pow(x, n));
        int power = 1;
        while (n != 0) {
            power *= x;
            n--;
        }
        System.out.println(power);
    }
}
