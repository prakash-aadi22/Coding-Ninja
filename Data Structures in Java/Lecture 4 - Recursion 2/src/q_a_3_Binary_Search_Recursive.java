import java.util.Scanner;

public class q_a_3_Binary_Search_Recursive {
    static Scanner sc = new Scanner(System.in);

    public static int[] takeInput() {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int[] input, int element) {
        return binarySearch(input, element, 0, input.length - 1);
    }

    public static int binarySearch(int[] arr, int x, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] < x) {
            return binarySearch(arr, x, mid + 1, end);
        } else if (arr[mid] > x) {
            return binarySearch(arr, x, start, mid - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int element = sc.nextInt();
        System.out.println(binarySearch(input, element));
    }
}
