package Extra_Practice;

class Operations {
    private int[] data;
    private int front; // index at which front element is stored
    private int rear; // index at which rear element is stored
    private int size;

    public Operations() {
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }

    public Operations(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int front() {
        if (size == 0) {
            //QueueEmptyException
            System.out.println("Empty Queue");
        }
        return data[front];
    }

    void enqueue(int element) {
        if (size == data.length) {
            // Stack Full
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        size++;
        rear = (rear + 1) % data.length;
//		rear++;
//		if(rear == data.length){
//			rear = 0;
//		}
        data[rear] = element;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i <= front - 1; i++) {
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length - 1;
    }

    int dequeue() {
        if (size == 0) {
            //QueueEmptyException
            System.out.println("Empty Queue");
        }
        int temp = data[front];
        front = (front + 1) % data.length;
//		front++;
//		if(front == data.length){
//			front = 0;
//		}
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }
}

public class Queue_Using_Array {
    public static void main(String[] args) {
        Operations queue = new Operations(3);
        for (int i = 1; i <= 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.size());
        System.out.println(queue.front());
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
