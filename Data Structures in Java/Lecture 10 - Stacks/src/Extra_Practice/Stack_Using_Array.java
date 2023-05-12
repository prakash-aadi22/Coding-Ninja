package Extra_Practice;

class Operations {
    private int[] data;
    private int top; // is the index of topmost element of stack

    public Operations(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
//		if(top == -1){
//			return true;
//		}else{
//			return false;
//		}
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public int top() {
        if (size() == 0) {
            //StackEmptyException
            System.out.println("Empty Stack");
        }
        return data[top];
    }

    public void push(int elem) {
        if (size() == data.length) {
            // Stack Full
            doubleCapacity();
        }
        top++;
        data[top] = elem;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
//        for (int i = 0; i <= top; i++) {
//            data[i] = temp[i];
//        }
        if (top + 1 >= 0) {
            System.arraycopy(temp, 0, data, 0, top + 1);
        }

    }

    public int pop() {
        if (size() == 0) {
            //StackEmptyException
            System.out.println("Empty Stack");
        }
        int temp = data[top];
        top--;
        return temp;

    }
}

public class Stack_Using_Array {
    public static void main(String[] args) {
        Operations stack = new Operations(3);
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.top());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
