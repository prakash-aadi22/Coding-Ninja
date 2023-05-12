import java.util.ArrayList;
import java.util.Scanner;

public class q_1_Remove_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PQ pq = new PQ();
        int choice = sc.nextInt();
        while (choice != -1) {
            switch (choice) {
                case 1: // insert
                    int element = sc.nextInt();
                    pq.insert(element);
                    break;
                case 2: // getMin
                    try {
                        System.out.println(pq.getMin());
                    } catch (PriorityQueueException e) {
                        System.out.println(Integer.MIN_VALUE);
                        return;
                    }
                    break;
                case 3: // removeMin
                    try {
                        System.out.println(pq.removeMin());
                    } catch (PriorityQueueException e) {
                        System.out.println(Integer.MIN_VALUE);
                        return;
                    }
                    break;
                case 4: // size
                    System.out.println(pq.size());
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

class PQ {

    ArrayList<Integer> heap;

    public PQ() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (isEmpty()) {
            // Throw an exception
            throw new PriorityQueueException();
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

    public void downHeapify() {
        int parentIndex = 0, minIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        while (leftChildIndex < heap.size()) {
            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
                minIndex = rightChildIndex;
            }
            if (minIndex != parentIndex) {
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(minIndex));
                heap.set(minIndex, temp);
                parentIndex = minIndex;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = 2 * parentIndex + 2;
            } else {
                break;
            }
        }
    }

    int removeMin() throws PriorityQueueException {
        if (isEmpty()) {
            throw new PriorityQueueException();
        }
        int minElement = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        downHeapify();
        return minElement;
    }
}

class PriorityQueueException extends Exception {

}