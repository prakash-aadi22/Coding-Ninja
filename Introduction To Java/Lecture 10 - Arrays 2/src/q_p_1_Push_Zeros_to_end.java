import java.util.Scanner;

public class q_p_1_Push_Zeros_to_end {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void pushZerosAtEnd(int[] arr) {
        int len = arr.length;
        int i = 0;
        int k = 0;
        int temp = 0;
        for (i = 0; i < len; i++) {
            if (arr[i] != 0) {
                //swap elements
                temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;
            }
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
            pushZerosAtEnd(arr);
            printArray(arr);
        }
    }
}
