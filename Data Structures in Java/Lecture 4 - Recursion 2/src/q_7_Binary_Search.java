import java.util.Scanner;

public class q_7_Binary_Search {
    static Scanner sc = new Scanner(System.in);

    public static int[] input() {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int x) {
        return binarySearch(arr, x, 0, arr.length - 1);
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
        int[] arr = input();
        int noOfSearches = sc.nextInt();
        for (int i = 1; i <= noOfSearches; i++) {
            int elementToSearch = sc.nextInt();
            System.out.println((binarySearch(arr, elementToSearch)));
        }
    }
}
