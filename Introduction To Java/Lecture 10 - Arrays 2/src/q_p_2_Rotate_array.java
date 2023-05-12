import java.util.Scanner;

public class q_p_2_Rotate_array {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void rotate(int[] arr, int d) {
        int[] arr1 = new int[d];
        int i = 0;
        while (i < d) {
            arr1[i] = arr[i];
            i++;
        }
        i = 0;
        while (i < arr.length - d) {
            arr[i] = arr[i + d];
            i++;
        }
        i = 0;
        int k = arr.length - d;
        while (i < d) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
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
            int[] arr = input();
            int rotationIndexNumber = sc.nextInt();
            rotate(arr, rotationIndexNumber);
            printArray(arr);
        }
    }
}
