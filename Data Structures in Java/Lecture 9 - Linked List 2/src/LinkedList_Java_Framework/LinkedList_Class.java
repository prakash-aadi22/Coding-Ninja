package LinkedList_Java_Framework;

import java.util.LinkedList;

public class LinkedList_Class {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        System.out.println("l --> " + l);
        System.out.println("l.peek() --> " + l.peek());
        System.out.println("l --> " + l);
        System.out.println("l.size() --> " + l.size());
        System.out.println("l --> " + l);
        System.out.println("l.contains(5) --> " + l.contains(5));
        System.out.println("l --> " + l);
        System.out.println("l.contains(55) --> " + l.contains(55));
        System.out.println("l --> " + l);
        System.out.println("l.element() --> " + l.element());
        System.out.println("l --> " + l);
        System.out.println("l.getFirst() --> " + l.getFirst());
        System.out.println("l --> " + l);
        System.out.println("l.getLast() --> " + l.getLast());
        System.out.println("l --> " + l);
        System.out.println("l.get(4) --> " + l.get(4));
        System.out.println("l --> " + l);
        System.out.println("l.indexOf(5) --> " + l.indexOf(6));
        System.out.println("l --> " + l);
        System.out.println("l.lastIndexOf(5) --> " + l.lastIndexOf(5));
        System.out.println("l --> " + l);
        System.out.println("l.poll() --> " + l.poll());
        System.out.println("l --> " + l);
        System.out.println("l.remove() --> " + l.remove());
        System.out.println("l --> " + l);
        System.out.println("l.clear(); --> ");
        l.clear();
        System.out.println("l --> " + l);
    }
}
