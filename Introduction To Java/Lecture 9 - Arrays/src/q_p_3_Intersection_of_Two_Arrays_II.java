import java.util.Scanner;

public class q_p_3_Intersection_of_Two_Arrays_II {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void intersections(int[] arr1, int[] arr2) {
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    System.out.print(arr1[i] + " ");
//                    arr2[j] = Integer.MIN_VALUE;
//                    break;
//                }
//            }
//        }

        for (int k : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (k == arr2[j]) {
                    System.out.print(k + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr = input();
            int[] arr1 = input();
            intersections(arr, arr1);
        }
    }
}
