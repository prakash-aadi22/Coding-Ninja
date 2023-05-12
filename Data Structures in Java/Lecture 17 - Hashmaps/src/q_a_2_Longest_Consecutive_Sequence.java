import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class q_a_2_Longest_Consecutive_Sequence {

    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> map = new HashMap<>();
        HashMap<Integer, Integer> lenMap = new HashMap<>();
        for (int j : arr) {
            map.put(j, true);
        }
        int maxStart = -1, maxLen = 0;
        for (int i : arr) {
            if (map.get(i)) {
                int currStart = i, currLen = 1;
                boolean flag = true;
                map.put(i, false);
                int ahead = i + 1;
                while (flag) {
                    if (map.containsKey(ahead)) {
                        currLen = currLen + 1;
                        map.put(ahead, false);
                        ahead = ahead + 1;
                    } else {
                        flag = false;
                    }
                }
                flag = true;
                int before = i - 1;
                while (flag) {
                    if (map.containsKey(before)) {
                        currLen = currLen + 1;
                        currStart = before;
                        map.put(before, false);
                        before = before - 1;
                    } else {
                        flag = false;
                    }
                }
                if (currLen >= maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                    lenMap.put(maxStart, maxLen);
                }
            }

        }
        for (int j : arr) {
            if (lenMap.containsKey(j) && lenMap.get(j) >= maxLen) {
                maxStart = j;
                maxLen = lenMap.get(j);
                break;
            }
        }
        output.add(maxStart);
        output.add(maxStart + maxLen - 1);
        return output;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        ArrayList<Integer> ans = longestConsecutiveIncreasingSequence(arr);
        printArray(ans);
    }
}
