import java.util.Scanner;

public class q_a_1_Total_Sum_on_the_Boundaries_and_Diagonals {

    static Scanner sc = new Scanner(System.in);

    public static int[][] take2DInput() {
        int sizeSquare = sc.nextInt();
        int[][] arr = new int[sizeSquare][sizeSquare];
        for (int i = 0; i < sizeSquare; i++) {
            for (int j = 0; j < sizeSquare; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void totalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || i == mat.length - 1) {
                    sum += mat[i][j];
                } else {
                    if (i == j || i + j == mat.length - 1)
                        sum += mat[i][j];
                }
            }
        }
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j == 0 || j == mat[i].length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[][] inputs = take2DInput();
            totalSum(inputs);
        }
    }
}
