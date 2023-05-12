package Extra_Practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Java_Framework {
    public static void main(String[] args) {
        // Class
        Queue<Integer> q = new LinkedList<>();
        q.add(8);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println("q --> " + q);
        System.out.println("q.size() --> " + q.size());
        System.out.println("q --> " + q);
        System.out.println("q.peek() --> " + q.peek());
        System.out.println("q --> " + q);
        System.out.println("q.element() --> " + q.element());
        System.out.println("q --> " + q);
        System.out.println("q.remove() --> " + q.remove());
        System.out.println("q --> " + q);
        System.out.println("q.poll() --> " + q.poll());
        System.out.println("q --> " + q);

        // Interface
        Queue<Integer> queue = new Queue<>() {
            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean offer(Integer integer) {
                return false;
            }

            @Override
            public Integer remove() {
                return null;
            }

            @Override
            public Integer poll() {
                return null;
            }

            @Override
            public Integer element() {
                return null;
            }

            @Override
            public Integer peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
}
