import java.util.ArrayList;
import java.util.Scanner;

public class q_2_Print_Matrix_diagonally {

    //    public static void printInDiagonalForm(int[][] arr) {
//        int row, col;
//        int rowCount = arr.length;
//        int columnCount = arr[0].length;
//        for (int k = 0; k < rowCount; k++) {
//            for (row = k, col = 0; row >= 0 && col < columnCount; row--, col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//        for (int k = 1; k < columnCount; k++) {
//            for (row = rowCount - 1, col = k; row >= 0 && col < columnCount; row--, col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static void printInDiagonalForm(int[][] arr) {
//        int i, j, k, m = arr.length, n = arr[0].length;
//        for (k = 0; k <= m - 1; k++) {
//            i = k;
//            j = 0;
//            while (i >= 0) {
//                System.out.print(arr[i][j] + "\t");
//                i = i - 1;
//                j = j + 1;
//            }
//        }
//        for (k = 1; k <= n - 1; k++) {
//            i = m - 1;
//            j = k;
//            while (j <= n - 1) {
//                System.out.print(arr[i][j] + "\t");
//                i = i - 1;
//                j = j + 1;
//            }
//        }
//    }

//    public static void printInDiagonalForm(int[][] arr) {
//        int i = 0, j = 0;
//        boolean isUp = true;
//        for (int k = 0; k < arr.length * arr.length; ) {
//            if (isUp) {
//                for (; i >= 0 && j < arr.length; j++, i--) {
//                    System.out.print(arr[i][j] + " ");
//                    k++;
//                }
//                if (i < 0 && j <= arr.length - 1) {
//                    i = 0;
//                }
//                if (j == arr.length) {
//                    i = i + 2;
//                    j--;
//                }
//            } else {
//                for (; j >= 0 && i < arr.length; i++, j--) {
//                    System.out.print(arr[i][j] + " ");
//                    k++;
//                }
//                if (j < 0 && i <= arr.length - 1)
//                    j = 0;
//                if (i == arr.length) {
//                    j = j + 2;
//                    i--;
//                }
//            }
//            isUp = !isUp;
//        }
//    }

    public static void printInDiagonalForm(int[][] arr) {
        ArrayList<Integer> al = printMatrix(arr, arr.length, arr[0].length);
        for (Integer i : al) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> printMatrix(int[][] mat, int n, int m) {
        ArrayList<ArrayList<Integer>> diagonals = new ArrayList<>();
        for (int i = 0; i < n + m - 1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            diagonals.add(list);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) % 2 != 0) {
                    diagonals.get(i + j).add(mat[i][j]);
                } else {
                    diagonals.get(i + j).add(0, mat[i][j]);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < diagonals.size(); i++) {
//            while (diagonals.get(i).size() != 0) {
//                ans.add(diagonals.get(i).get(0));
//                diagonals.get(i).remove(0);
//            }
//        }
        for (ArrayList<Integer> diagonal : diagonals) {
            while (diagonal.size() != 0) {
                ans.add(diagonal.get(0));
                diagonal.remove(0);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printInDiagonalForm(arr);
        sc.close();
    }
}
