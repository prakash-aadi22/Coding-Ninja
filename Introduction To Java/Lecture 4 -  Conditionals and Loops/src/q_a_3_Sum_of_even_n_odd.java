import java.util.Scanner;

public class q_a_3_Sum_of_even_n_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfEven = 0, sumOfOdd = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                sumOfEven = sumOfEven + rem;
            } else {
                sumOfOdd = sumOfOdd + rem;
            }
            n /= 10;
        }
        System.out.println(sumOfEven + " " + sumOfOdd);
    }
}
