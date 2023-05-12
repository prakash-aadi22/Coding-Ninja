import java.util.Scanner;

public class q_1_Print_2D_Array {
    static Scanner s = new Scanner(System.in);

    public static int[][] takeInput() {
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void print2DArray(int[][] input) {
        for (int i = 0; i < input.length; i++) {
            int count = input.length - i;
            while (count > 0) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                count--;
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
        int[][] input = takeInput();
        print2DArray(input);
    }
}
