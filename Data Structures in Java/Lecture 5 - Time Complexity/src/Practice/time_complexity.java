package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class time_complexity {
    public static void array_sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void arrayList_sort(ArrayList<Integer> arr) {
        Collections.sort(arr);
    }

    public static void arrayList_sort2(ArrayList<Integer> arr) {
        arr.sort(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        System.out.println("=================================================================================");
        // For Array with input in decreasing order
        for (int i = 10; i <= 100000000; i *= 10) {
            int[] input = new int[i];
            for (int j = 0; j < input.length; j++) {
                input[j] = input.length - j;
            }
            long startTime = System.currentTimeMillis();
            array_sort(input);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by Arrays.sort() to sort the array of " + i + " size is --> " + (endTime - startTime));
        }
        System.out.println("=================================================================================");
        // For ArrayList with input in decreasing order
        for (int i = 10; i <= 100000000; i *= 10) {
            ArrayList<Integer> al = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                al.add(i - j);
            }
            long startTime = System.currentTimeMillis();
            arrayList_sort(al);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by Collections.sort() to sort the array of " + i + " size is --> " + (endTime - startTime));
        }
        System.out.println("=================================================================================");
        // For ArrayList with input in decreasing order
        for (int i = 10; i <= 100000000; i *= 10) {
            ArrayList<Integer> al = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                al.add(i - j);
            }
            long startTime = System.currentTimeMillis();
            arrayList_sort2(al);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by arr.sort(Comparator.naturalOrder()) to sort the array of " + i + " size is --> " + (endTime - startTime));
        }
        System.out.println("=================================================================================");
        System.out.println("---------------------------------------------------------------------------------");
        // For Array with input in increasing order
        for (int i = 10; i <= 100000000; i *= 10) {
            int[] arr = new int[i];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = j;
            }
            long startTime = System.currentTimeMillis();
            array_sort(arr);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by Arrays.sort to sort the array of " + i + " size is --> " + (endTime - startTime));
        }
        System.out.println("=================================================================================");
        // For ArrayList with input in increasing order
        for (int i = 10; i <= 100000000; i *= 10) {
            ArrayList<Integer> al = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                al.add(j);
            }
            long startTime = System.currentTimeMillis();
            arrayList_sort(al);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by Collections.sort() to sort the array of " + i + " size is --> " + (endTime - startTime));
        }
        System.out.println("=================================================================================");
        // For ArrayList with input in increasing order
        for (int i = 10; i <= 100000000; i *= 10) {
            ArrayList<Integer> al = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                al.add(j);
            }
            long startTime = System.currentTimeMillis();
            arrayList_sort2(al);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by arr.sort(Comparator.naturalOrder()) to sort the array of " + i + " size is --> " + (endTime - startTime));
        }
        System.out.println("=================================================================================");
    }
}
