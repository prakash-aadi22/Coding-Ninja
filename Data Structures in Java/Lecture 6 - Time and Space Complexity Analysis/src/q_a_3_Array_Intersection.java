import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class q_a_3_Array_Intersection {
    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < arr1.length; i++) {
//            if (map.containsKey(arr1[i])) {
//                map.put(arr1[i], map.get(arr1[i]) + 1);
//            } else {
//                map.put(arr1[i], 1);
//            }
//        }
        for (int j : arr1) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (map.containsKey(arr2[i]) && map.get(arr2[i]) != 0) {
//                System.out.print(arr2[i] + " ");
//                map.put(arr2[i], map.get(arr2[i]) - 1);
//            }
//        }
        for (int j : arr2) {
            if (map.containsKey(j) && map.get(j) != 0) {
                System.out.print(j + " ");
                map.put(j, map.get(j) - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int[] arr1 = input();
            int[] arr2 = input();
            intersection(arr1, arr2);
        }
    }
}
