import java.util.Scanner;

public class q_2_Largest_Row_or_Column {

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

    public static void findLargest(int[][] mat) {
        int largestInRow = Integer.MIN_VALUE, largestInColumn = Integer.MIN_VALUE;
        int i, j;
        int maxRow = 0;
        int maxColumn = 0;

        // if row = 0
        int rows = mat.length;
        int cols = 0;
        if (rows != 0) {
            cols = mat[0].length;
        }

        // Finding sum and largest of rows
        for (i = 0; i < mat.length; i++) {
//        for (i = 0; i < rows; i++) {
            int sum = 0;
            for (j = 0; j < mat[i].length; j++) {
//            for (j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            if (sum > largestInRow) {
                largestInRow = sum;
                maxRow = i;
            }
        }

        // Finding sum and largest of columns
//        for (j = 0; j < mat[j].length; j++) { // Gives index out of bound for row = 0
        for (j = 0; j < cols; j++) { // if the value of row is 0
            int sum = 0;
            for (i = 0; i < mat.length; i++) {
//            for (i = 0; i < rows; i++) {
                sum += mat[i][j];
            }
            if (sum > largestInColumn) {
                largestInColumn = sum;
                maxColumn = j;
            }
        }

        // Printing result
        if (largestInRow >= largestInColumn) {
            System.out.println("row " + maxRow + " " + largestInRow);
        } else {
            System.out.println("column " + maxColumn + " " + largestInColumn);
        }
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[][] inputs = take2DInput();
            findLargest(inputs);
        }
    }
}
