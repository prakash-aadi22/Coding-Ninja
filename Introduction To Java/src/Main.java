import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] arr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr1));
        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(Arrays.deepToString(arr2));
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(j + ", ");
            }
            System.out.println();
        }
        System.out.println("=======================================================================================");
        int[][] arr3 = new int[4][];
        System.out.println(arr3.length);
        System.out.println(arr3[0]);
        System.out.println(Arrays.toString(arr3[0]));
//        int[][] arr4 = new int[][4]; //error
//        System.out.println(arr4.length);
        int[][] arr5 = new int[3][4];
        System.out.println(arr5.length);
        System.out.println(arr5[0]);
        System.out.println(arr5[0][0]);
        System.out.println(Arrays.toString(arr5[0]));
    }
}