package Extra_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Using_Priority_Queues {
    ArrayList<Integer> heap;

    public Using_Priority_Queues() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return (heap.size() == 0);
    }

    int getMin() {
        if (isEmpty()) {
            return Integer.parseInt(null);
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
