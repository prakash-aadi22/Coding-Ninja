import java.util.Scanner;

public class q_3_Leaders_in_array {

    public static void leaders(int[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean allSmaller = true;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    allSmaller = false;
                    break;
                }
            }
            if (allSmaller) {
                System.out.print(input[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        leaders(input);
    }
}
