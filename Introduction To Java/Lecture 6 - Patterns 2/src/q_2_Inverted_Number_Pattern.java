import java.util.Scanner;

public class q_2_Inverted_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
