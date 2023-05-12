import java.util.Arrays;
import java.util.Scanner;

public class q_a_5_Triplet_sum {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int tripletSum(int[] arr, int num) {
        // TIME LIMIT EXCEEDS
//        int count = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                for (int k = j + 1; k < arr.length; k++) {
//                    if (arr[i] + arr[j] + arr[k] == num) {
//                        count++;
//                    }
//                }
//            }
//        }
//        return count;


        Arrays.sort(arr);
        int n = arr.length;
        int numTriplets = 0;
        for (int i = 0; i < n; i++) {
            int pairSum = num - arr[i];
            int numPairs = 0;
            int start = i + 1;
            int stop = n - 1;
            while (start < stop) {
                if (arr[start] + arr[stop] < pairSum) {
                    start++;
                } else if (arr[start] + arr[stop] > pairSum) {
                    stop--;
                } else {
                    if (arr[start] == arr[stop]) {
                        int totalCount = (stop - start) + 1;
                        numPairs += (totalCount * (totalCount - 1) / 2);
                        break;
                    }
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                    while (tempI <= tempJ && arr[start] == arr[tempI]) {
                        tempI++;
                    }
                    while (tempI <= tempJ && arr[stop] == arr[tempJ]) {
                        tempJ--;
                    }
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                    numPairs += (totalElementFromStart * totalElementFromEnd);
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            int num = sc.nextInt();
            System.out.println(tripletSum(arr, num));
        }
    }
}
