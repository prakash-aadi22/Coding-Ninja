import java.util.Scanner;

public class q_p_6_Sum_of_Two_Arrays {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }


    public static void sumOfTwoArrays(int[] arr1, int[] arr2, int[] output) {
//        int len1 = arr1.length;
//        int len2 = arr2.length;
//        int len3, small;
//        int car = 0;
//        if (len1 <= len2) {
//            small = len1;
//        } else {
//            small = len2;
//        }
//        if (len1 >= len2) {
//            len3 = len1;
//        } else {
//            len3 = len2;
//        }
//        len3++;
//        for (int i = 0; i < small; i++) {
//            output[len3 - i - 1] = (arr1[len1 - i - 1] + arr2[len2 - i - 1] + car) % 10;
//            car = (arr1[len1 - i - 1] + arr2[len2 - i - 1] + car) / 10;
//        }
//        if (len1 > len2) {
//            for (int i = len2; i < len1; i++) {
//                output[len3 - i - 1] = (arr1[len1 - i - 1] + car) % 10;
//                car = arr1[len1 - i - 1] / 10;
//            }
//        } else if (len2 > len1) {
//            for (int i = len1; i < len2; i++) {
//                output[len3 - i - 1] = (arr2[len2 - i - 1] + car) % 10;
//                car = arr2[len2 - i - 1] / 10;
//            }
//        }
//        output[0] += car;


        int len1 = arr1.length;
        int len2 = arr2.length;
        int len3, small;
        int car = 0;
        small = Math.min(len1, len2);
        len3 = Math.max(len1, len2);
        len3++;
        for (int i = 0; i < small; i++) {
            output[len3 - i - 1] = (arr1[len1 - i - 1] + arr2[len2 - i - 1] + car) % 10;
            car = (arr1[len1 - i - 1] + arr2[len2 - i - 1] + car) / 10;
        }
        if (len1 > len2) {
            for (int i = len2; i < len1; i++) {
                output[len3 - i - 1] = (arr1[len1 - i - 1] + car) % 10;
                car = arr1[len1 - i - 1] / 10;
            }
        } else if (len2 > len1) {
            for (int i = len1; i < len2; i++) {
                output[len3 - i - 1] = (arr2[len2 - i - 1] + car) % 10;
                car = arr2[len2 - i - 1] / 10;
            }
        }
        output[0] += car;
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
            int[] output = new int[1 + Math.max(arr1.length, arr2.length)];
            sumOfTwoArrays(arr1, arr2, output);
            printArray(output);
        }
    }
}
