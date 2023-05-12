import java.util.Scanner;

public class q_a_5_Sum_of_digits_recursive {

    public static int sumOfDigits(int input) {
        if (input  == 0) {
            return 0;
        }
        int sum = input % 10;
        return sum + sumOfDigits(input / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
    }
}
