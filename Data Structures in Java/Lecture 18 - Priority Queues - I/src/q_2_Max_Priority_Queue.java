import java.util.ArrayList;
import java.util.Scanner;

class PQ1 {
    ArrayList<Integer> heap = new ArrayList<>();

    boolean isEmpty() {
        return heap.isEmpty();
    }

    int getSize() {
        return heap.size();
    }

    int getMax() {
        if (heap.isEmpty()) {
            return Integer.MIN_VALUE;
        } else {
            return heap.get(0);
        }
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        while (childIndex > 0) {
            int parentIndex = (childIndex - 1) / 2;
            if (heap.get(childIndex) > (heap.get(parentIndex))) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
            } else {
                break;
            }
        }
    }

    int removeMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int maxElement = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        int maxIndex = 0;
        while (leftChildIndex < heap.size()) {
            if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                maxIndex = rightChildIndex;
            }
            if (maxIndex != parentIndex) {
                int temp = heap.get(maxIndex);
                heap.set(maxIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                parentIndex = maxIndex;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            } else {
                break;
            }
        }
        return maxElement;
    }
}

public class q_2_Max_Priority_Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PQ1 pq = new PQ1();
        int choice = sc.nextInt();
        while (choice != -1) {
            switch (choice) {
                case 1: // insert
                    int element = sc.nextInt();
                    pq.insert(element);
                    break;
                case 2: // getMax
                    System.out.println(pq.getMax());
                    break;
                case 3: // removeMax
                    System.out.println(pq.removeMax());
                    break;
                case 4: // size
                    System.out.println(pq.getSize());
                    break;
                case 5: // isEmpty
                    System.out.println(pq.isEmpty());
                default:
                    return;
            }
            choice = sc.nextInt();
        }
    }
}
