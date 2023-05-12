import java.util.Scanner;

public class q_a_2_Print_Like_a_Wave {

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

    public static void wavePrint(int[][] mat) {
        int k = 0, c = mat.length - 1;
        if (mat.length != 0) {
            k = mat[0].length;
        }
        for (int j = 0; j < k; j++) {
//            for (int i = 0; i < mat.length; i++) {
//                if (j % 2 != 0) {
//                    System.out.print(mat[c][j] + " ");
//                    c--;
//                } else {
//                    c = mat.length - 1;
//                    System.out.print(mat[i][j] + " ");
//                }
//            }

            for (int[] ints : mat) {
                if (j % 2 != 0) {
                    System.out.print(mat[c][j] + " ");
                    c--;
                } else {
                    c = mat.length - 1;
                    System.out.print(ints[j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[][] inputs = take2DInput();
            wavePrint(inputs);
        }
    }
}
