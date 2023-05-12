import java.util.Scanner;

public class q_1_Row_Wise_Sum {

    static Scanner sc = new Scanner(System.in);

    public static int[][] take2DInput() {
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void rowWiseSum(int[][] mat) {
//        for (int i = 0; i < mat.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < mat[i].length; j++) {
//                sum += mat[i][j];
//            }
//            System.out.print(sum + " ");
//        }

        for (int[] ints : mat) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            System.out.print(sum + " ");
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[][] inputs = take2DInput();
            rowWiseSum(inputs);
        }
    }
}
