import java.util.Arrays;
import java.util.Scanner;

public class q_5_Code_Merge_Two_Sorted_Arrays {

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] merge(int[] arr1, int[] arr2) {

//        int size = arr1.length + arr2.length;
//        int[] arr = new int[size];
//        System.arraycopy(arr1, 0, arr, 0, arr1.length);
//        System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);
//        Arrays.sort(arr);
//        return arr;

        int m = arr1.length;
        int n = arr2.length;
        int[] arr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                arr[k] = arr1[i];
                k++;
                i++;
            } else {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr1 = input();
            int[] arr2 = input();
            int[] ans = merge(arr1, arr2);
            printArray(ans);
        }
    }
}
