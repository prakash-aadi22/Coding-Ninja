package Extra_Practice;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        next = null;
    }
}

class Node1<T> {
    T data;
    Node1<T> next;

    Node1(T data) {
        this.data = data;
        next = null;
    }
}

public class node_example {
    public static void main(String[] args) {
        Node<Integer> node = new Node<>(10);
        System.out.println("node --> " + node);
        System.out.println("node.data --> " + node.data);
        System.out.println("node.next --> " + node.next);
        System.out.println("-------------------------------------------------------------------");
        Node<Integer> node1 = new Node<>(100);
        node.next = node1;
        System.out.println("node1 --> " + node1);
        System.out.println("node.next --> " + node.next);
        System.out.println("node1.data --> " + node1.data);
        System.out.println("node1.next --> " + node1.next);
        System.out.println("-------------------------------------------------------------------");
        node1.next = node;
        System.out.println("node --> " + node);
        System.out.println("node1 --> " + node1);
        System.out.println("node1.next --> " + node1.next);
        System.out.println("=========================================================================");
        System.out.println("-------------------------------------------------------------------");
        Node1<Integer> n1 = new Node1<>(20);
        System.out.println("n1 --> " + n1);
        System.out.println("n1.data --> " + n1.data);
        System.out.println("n1.next --> " + n1.next);
        System.out.println("-------------------------------------------------------------------");
        Node1<Integer> n2 = new Node1<>(200);
        n1.next = n2;
        System.out.println("n2 --> " + n2);
        System.out.println("n1.next --> " + n1.next);
        System.out.println("n2.data --> " + n2.data);
        System.out.println("n2.next --> " + n2.next);
        System.out.println("-------------------------------------------------------------------");
        n2.next = n1;
        System.out.println("n1 --> " + n1);
        System.out.println("n2 --> " + n2);
        System.out.println("n2.next --> " + n2.next);
    }
}
