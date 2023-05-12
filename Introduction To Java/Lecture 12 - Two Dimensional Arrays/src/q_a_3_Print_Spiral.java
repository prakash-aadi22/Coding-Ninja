import java.util.Scanner;

public class q_a_3_Print_Spiral {

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

    public static void spiralPrint(int[][] matrix) {

        int rows = matrix.length;
        int columns = 0;
        if (rows != 0) {
            columns = matrix[0].length;
        }
        int rowStart = 0;
        int columnStart = 0;
        int rowEnd = rows - 1;
        int columnEnd = columns - 1;
        int count = 0;
        while (count < (rows * columns)) {
            for (int i = columnStart; i <= columnEnd && count < (rows * columns); i++) {
                System.out.print(matrix[rowStart][i] + " ");
                count++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd && count < (rows * columns); i++) {
                System.out.print(matrix[i][columnEnd] + " ");
                count++;
            }
            columnEnd--;
            for (int i = columnEnd; i >= columnStart && count < (rows * columns); i--) {
                System.out.print(matrix[rowEnd][i] + " ");
                count++;
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart && count < (rows * columns); i--) {
                System.out.print(matrix[i][columnStart] + " ");
                count++;
            }
            columnStart++;
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[][] inputs = take2DInput();
            spiralPrint(inputs);
        }
    }
}
