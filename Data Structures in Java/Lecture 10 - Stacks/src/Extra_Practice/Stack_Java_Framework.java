package Extra_Practice;

import java.util.Stack;

public class Stack_Java_Framework {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        System.out.println("s --> " + s);
        System.out.println("s.peek() --> " + s.peek());
        s.pop();
        System.out.println("s.pop() --> ");
        System.out.println("s --> " + s);
        System.out.println("s.pop() --> " + s.pop());
        System.out.println("s --> " + s);
        System.out.println("s .empty()--> " + s.empty());
        System.out.println("s.search(5) --> " + s.search(5));
        System.out.println("s.add(11) --> " + s.add(11));
        System.out.println("s --> " + s);
        System.out.println("s.search(1) --> " + s.search(1));
        System.out.println("s.search(2) --> " + s.search(2));
        System.out.println("s.search(3) --> " + s.search(3));
        System.out.println("s.search(4) --> " + s.search(4));
        System.out.println("s.search(5) --> " + s.search(5));
        System.out.println("s.search(6) --> " + s.search(6));
        System.out.println("s.search(7) --> " + s.search(7));
        System.out.println("s.search(8) --> " + s.search(8));
        System.out.println("s.search(9) --> " + s.search(9));
        System.out.println("s.search(10) --> " + s.search(10));
        System.out.println("s.search(11) --> " + s.search(11));
        System.out.println("s.firstElement() --> " + s.firstElement());
        System.out.println("s.lastElement() --> " + s.lastElement());
        System.out.println("s.size() --> " + s.size());
        for (int i = 0; i < s.size(); i++) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
        for (Integer i : s) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : s) {
            System.out.print(i + " ");
        }
    }
}
