import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Triplet {
    int value;
    int rowIndex;
    int colIndex;
}

class TripletComparator implements Comparator<Triplet> {
    public int compare(Triplet a, Triplet b) {
        if (a.value <= b.value) {
            return -1;
        }
        return 1;
    }
}

public class q_a_3_Merge_K_sorted_arrays {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
        TripletComparator comparator = new TripletComparator();
        PriorityQueue<Triplet> priorityQueue = new PriorityQueue<>(comparator);
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) != null) {
                Triplet a = new Triplet();
                a.value = input.get(i).get(0);
                a.rowIndex = i;
                a.colIndex = 0;
                priorityQueue.add(a);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (!priorityQueue.isEmpty()) {
            Triplet a = priorityQueue.remove();
            arr.add(a.value);
            if (a.colIndex + 1 < input.get(a.rowIndex).size()) {
                Triplet b = new Triplet();
                b.value = input.get(a.rowIndex).get(a.colIndex + 1);
                b.rowIndex = a.rowIndex;
                b.colIndex = a.colIndex + 1;
                priorityQueue.add(b);
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int k = Integer.parseInt(br.readLine().trim());
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        while (k > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> current = new ArrayList<Integer>();
            String[] strNums;
            strNums = br.readLine().split("\\s");
            for (int i = 0; i < n; i++) {
                current.add(Integer.parseInt(strNums[i]));
            }
            input.add(current);
            k--;
        }
        ArrayList<Integer> output = mergeKSortedArrays(input);
        if (output != null) {
            for (int i : output) {
                System.out.print(i + " ");
            }
        }
    }
}
