import java.util.Scanner;

public class q_1_Code_Binary_Search {

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int x) {
        Scanner sc = new Scanner(System.in);
        int start = 0, end = arr.length, mid = (start + end) / 2;
        for (int i = 1; i <= x; i++) {
            int noToSearch = sc.nextInt();
            for (int j = 0; j < arr.length; j++) {
                if (noToSearch == arr[mid]) {
                    return mid;
                } else if (noToSearch > arr[mid]) {
                    for (int k = mid + 1; k < end; k++) {
                        if (noToSearch == arr[k]) {
                            return k;
                        }
                    }
                } else if (noToSearch < arr[mid]) {
                    for (int k = mid - 1; k >= start; k--) {
                        if (noToSearch == arr[k]) {
                            return k;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = input();
        int noOfTestCases = sc.nextInt();
        System.out.println(binarySearch(arr, noOfTestCases));
    }
}
